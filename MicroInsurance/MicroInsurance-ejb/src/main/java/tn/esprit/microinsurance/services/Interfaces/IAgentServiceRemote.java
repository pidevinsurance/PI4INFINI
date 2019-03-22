package tn.esprit.microinsurance.services.Interfaces;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Agent;



@Remote
public interface IAgentServiceRemote {
	
	public void addAgent(Agent ag);

}
