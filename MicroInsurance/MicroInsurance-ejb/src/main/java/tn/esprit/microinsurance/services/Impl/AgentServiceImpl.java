package tn.esprit.microinsurance.services.Impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.microinsurance.Entities.Agent;
import tn.esprit.microinsurance.services.Interfaces.IAgentServiceLocal;
import tn.esprit.microinsurance.services.Interfaces.IAgentServiceRemote;

@Stateless
public class AgentServiceImpl implements IAgentServiceRemote , IAgentServiceLocal{
	
	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;

	@Override
	public void addAgent(Agent ag) {
		em.persist(ag);
		
	}

}
