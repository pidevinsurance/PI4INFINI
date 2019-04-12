package tn.esprit.microinsurance.Services.Impl;

import java.math.BigInteger;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.microinsurance.Entities.Complaints;
import tn.esprit.microinsurance.Entities.Type_subject;
import tn.esprit.microinsurance.Services.Interf.IComplaintsLocal;
import tn.esprit.microinsurance.Services.Interf.IComplaintsRemote;

@Stateless
public class ComplaintsServiceImpl implements IComplaintsLocal, IComplaintsRemote{

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




	



}
