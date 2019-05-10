package tn.esprit.microinsurance.services.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import tn.esprit.microinsurance.Entities.IndemnityRequestPk;
import tn.esprit.microinsurance.Entities.Indemnity_Request;
import tn.esprit.microinsurance.Entities.TechnicalAgent;
import tn.esprit.microinsurance.Entities.User;
import tn.esprit.microinsurance.services.Interfaces.IIndemnityRequestServiceLocal;
import tn.esprit.microinsurance.services.Interfaces.IIndemnityRequestServiceRemote;




@Stateless
public class IndemnityRequestServiceImpl implements IIndemnityRequestServiceRemote ,IIndemnityRequestServiceLocal {
	
	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;

	@Override
	public void addIndemnityRequest(Indemnity_Request indReq) {
		em.persist(indReq);
		
		
	}

	@Override
	public List<Indemnity_Request> getAllIndemnityRequest() {
		List<Indemnity_Request> indemnity_request = em.createQuery("select e from Indemnity_Request e", Indemnity_Request.class).getResultList();
		return indemnity_request;
	}
	
	
	@Override
	public Indemnity_Request getIndemnityRequestById(IndemnityRequestPk indId) {
	  TypedQuery<Indemnity_Request> query = em.createQuery(
	  "select i from Indemnity_Request i where i.IndemnityRequest_id=:indId", 
	  Indemnity_Request.class);
	  query.setParameter("indId", indId);
	  return query.getSingleResult();
	}

	@Override
	public void UpdateIndemnityRequestTechnicalAgentIDById(IndemnityRequestPk IndemnityRequestId , TechnicalAgent TechnicalAgent) {
		
		//Indemnity_Request ind = em.find(Indemnity_Request.class, IndemnityRequestId);
		//ind.setTechnicalAgent(TechnicalAhent);
		
		Query query = em.createQuery("update Indemnity_Request i set technicalAgent=:TechnicalAgent where i.IndemnityRequest_id=:IndemnityRequestId");
		query.setParameter("IndemnityRequestId", IndemnityRequestId);
		query.setParameter("TechnicalAgent", TechnicalAgent);
		int modified = query.executeUpdate();
		if(modified == 1){
			System.out.println("successfully updated");
		}else{
			System.out.println("failed to update");
		}
	}
	
	
	
	@Override
	public void UpdateIndemnityRequestValidationDById(IndemnityRequestPk IndemnityRequestId , boolean val) {
		
		//Indemnity_Request ind = em.find(Indemnity_Request.class, IndemnityRequestId);
		//ind.setTechnicalAgent(TechnicalAhent);
		
		Query query = em.createQuery("update Indemnity_Request i set isValide=:val where i.IndemnityRequest_id=:IndemnityRequestId");
		query.setParameter("IndemnityRequestId", IndemnityRequestId);
		query.setParameter("val", val);
		int modified = query.executeUpdate();
		if(modified == 1){
			System.out.println("successfully updated");
		}else{
			System.out.println("failed to update");
		}
	}

	
	
	
	
	




	



}
