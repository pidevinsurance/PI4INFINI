package tn.esprit.microinsurance.services.Impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.microinsurance.Entities.Agent;
import tn.esprit.microinsurance.Entities.Indemnity_Request;
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


}
