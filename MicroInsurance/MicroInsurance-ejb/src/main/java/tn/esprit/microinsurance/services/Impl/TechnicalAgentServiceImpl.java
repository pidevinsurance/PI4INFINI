package tn.esprit.microinsurance.services.Impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tn.esprit.microinsurance.Entities.TechnicalAgent;
import tn.esprit.microinsurance.services.Interfaces.ITechnicalAgentServiceLocal;
import tn.esprit.microinsurance.services.Interfaces.ITechnicalAgentServiceRemote;

@Stateless
public class TechnicalAgentServiceImpl implements ITechnicalAgentServiceRemote, ITechnicalAgentServiceLocal {

	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;
	
	
	@Override
	public List<TechnicalAgent> getAllTechnicalAgents() {
		List<TechnicalAgent> TechnicalAgents = em.createQuery("select t from TechnicalAgent t", TechnicalAgent.class).getResultList();
		return TechnicalAgents;
	}

}
