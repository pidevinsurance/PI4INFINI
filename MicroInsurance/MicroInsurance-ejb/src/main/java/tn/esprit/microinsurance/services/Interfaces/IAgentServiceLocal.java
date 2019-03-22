package tn.esprit.microinsurance.services.Interfaces;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.Agent;

@Local
public interface IAgentServiceLocal {
	
	public void addAgent(Agent ag);

}
