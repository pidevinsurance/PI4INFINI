package tn.esprit.microinsurance.services.Impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import tn.esprit.microinsurance.Entities.User;

import tn.esprit.microinsurance.Entities.InsuranceRequest;
import tn.esprit.microinsurance.Entities.Justificatory;
import tn.esprit.microinsurance.Entities.Quotation;
import tn.esprit.microinsurance.Entities.Quotation.Status;
//import tn.esprit.microinsurance.Entities.User;
import tn.esprit.microinsurance.services.Interf.QuoteLocal;
import tn.esprit.microinsurance.services.Interf.QuoteRemote;

@Stateless
public class QuoatationImpl implements QuoteLocal,QuoteRemote{

	@PersistenceContext(unitName= "Microinsurance-ejb")
	EntityManager em;
	@Override
	public void removeQuoteees(int id) {
		System.out.println("-----------------------------------------------");
		System.out.println("In removeQuotation 1- : "+id);
		Quotation quotation = em.find(Quotation.class,id); 
		System.out.println("removeQuotation: 2- " + quotation.getId());
		em.remove(quotation);
		//em.createNativeQuery("delete from Quotation q where q.QUOTATION_NUMBER=id");
				
		System.out.println("Out of removeQuotation: ");
		
	}

	@Override
	public List<Quotation> findAllQuotations() {
		System.out.println("In findAllQuotations: ");
		List<Quotation> quotes= em.createQuery("select q from Quotation q", Quotation.class).getResultList();
		System.out.println("Out of findAllQuotations: ");
		return quotes;
	}
	@Override
	public void UpdateQuotationStatus(int id, Quotation.Status status) {
		Quotation quote = em.find(Quotation.class, id);
		quote.setStatus(status);
	}
	@Override
	public Quotation findQuotationById(int id) {
		
		Quotation quote= em.find(Quotation.class, id);
		
		return quote;
	}
	

	@Override
	public List<Quotation> findTreatedQuotations () {
		System.out.println("In findTreatedQuotations: ");
		Status s =Status.Treated;
		System.out.println("--------------------------------"+s);
		List <Quotation>quotes= em.createQuery("select q from Quotation q where q.status=:T",Quotation.class).setParameter("T", s).getResultList();
		//quotes.setParameter("Treated", Treated);
		
		System.out.println("Out of findTreatedQuotations: "); 
		
		return quotes;
	}
	@Override
	public List<Quotation> findUntreatedQuotations () {
		System.out.println("In findTreatedQuotations: ");
		Status s =Status.Untreated;
		System.out.println("--------------------------------"+s);
		List <Quotation>quotes= em.createQuery("select q from Quotation q where q.status=:T",Quotation.class).setParameter("T", s).getResultList();
		System.out.println("Out of findUntreatedQuotations: "); 
		return quotes;
	}

	@Override
	public void updateStatus(Quotation q) {
		System.out.println("In updateStatus: ");
		 /*Quotation s= em.find(Quotation.class,q.getId());
		 s.setStatus(q.getStatus());*/
		em.merge(q);
		System.out.println("Out of updateStatus: ");
		
	}

	@Override
	public void updateInsuranceRequest(InsuranceRequest ir) {
		System.out.println("In updateStatus: ");
		 /*Quotation s= em.find(Quotation.class,q.getId());
		 s.setStatus(q.getStatus());*/
		em.merge(ir);
		System.out.println("Out of updateStatus: ");
		
	}

	@Override
	public InsuranceRequest findRequestsByQuotation(int id) { 
		Quotation q = findQuotationById(id);
		TypedQuery<InsuranceRequest> query = em.createQuery("SELECT i FROM  InsuranceRequest i where i.quotation=:q",InsuranceRequest.class); 
		query.setParameter("q", q);
	InsuranceRequest	ir = new InsuranceRequest();
		for ( InsuranceRequest i : (List<InsuranceRequest>)query.getResultList()){
			System.out.println(i.getRequest_id());
			ir = i ;
		}
		return ir;
	}

	@Override
	public List<Justificatory> findJustificatisByRequest(int id) {
		// TODO Auto-generated method stub
		
		
		TypedQuery<Justificatory> query = (TypedQuery<Justificatory>) em.createQuery("SELECT i.Justificatories FROM  InsuranceRequest i where i. Request_id=:id");
		query.setParameter("id", id);
		return query.getResultList();
		

		
	}
	@Override
	public void addUser(User user) {
	System.out .println("In addUser: ");
	em.persist(user);
	System.out.println("Out of addUser"+ user.getId());
	
	}
	public List<Object[]> goodQuotation()
	{
		Query query=em.createNativeQuery("SELECT `QUOTATION_NUMBER` as nb , `SCORE` as score FROM t_quotation WHERE score>50 GROUP BY`QUOTATION_NUMBER`");
		return query.getResultList();
	}
	
	public List<Object[]> badQuotation()
	{
		Query query=em.createNativeQuery("SELECT `QUOTATION_NUMBER` as nb , `SCORE` as score FROM t_quotation WHERE score<50 GROUP BY`QUOTATION_NUMBER`");

		return query.getResultList();
	}
	public List<Object[]> DemandedProducts()
	{
		Query query=em.createNativeQuery("SELECT COUNT(`QUOTATION_NUMBER`) as nb , `Label` as NAME FROM t_quotation q INNER JOIN t_product p WHERE q.`product_PRODUCT_ID`=p.PRODUCT_ID GROUP by p.Label");
		return query.getResultList();
	}
	
	

}
