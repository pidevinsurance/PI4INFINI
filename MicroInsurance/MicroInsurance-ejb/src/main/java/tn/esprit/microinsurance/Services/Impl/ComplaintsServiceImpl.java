package tn.esprit.microinsurance.Services.Impl;


import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.microinsurance.Entities.Complaints;
import tn.esprit.microinsurance.Entities.ComplaintsPK;
import tn.esprit.microinsurance.Entities.Type_subject;
import tn.esprit.microinsurance.Services.Interf.IComplaintsRemote;



@Stateless
@LocalBean
public class ComplaintsServiceImpl implements IComplaintsRemote{

	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;
	public ComplaintsServiceImpl() {
	super();
	}

	@Override
	public List<Complaints> displayComplaints() {
		List<Complaints> emp = em.createQuery("Select c from Complaints c", Complaints.class).getResultList();
		return emp;
	}


	@Override
	public Long getComplaintBystring(Type_subject type) {
		// TODO Auto-generated method stub
	    type = Type_subject.rescission;
		TypedQuery<Long> query = em.createQuery("Select  count(c) from Complaints c where c.type_subject=:type",Long.class);
		query.setParameter("type",type);		
		return query.getSingleResult();
		
		
		
		
	}

	@Override
	public void ajouterComplaint(Date dateofpub , int idAgent ,int idClient ,String text , Type_subject type) {
		// TODO Auto-generated method stub
		ComplaintsPK complaintpk = new ComplaintsPK();
		complaintpk.setDate_Of_Pub(dateofpub);
		complaintpk.setIdAgent(idAgent);
		complaintpk.setIdClient(idClient);
		Complaints c = new Complaints();
		c.setComplaint_id(complaintpk);
		c.setStatus("Untreated"); //par defaut non valide
		c.setType_subject(type);
		c.setComplaintText(text);
		em.persist(c);
	}



	


	



}
