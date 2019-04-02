package tn.esprit.microinsurance.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.TechnicalAgent;;

@Remote
public interface ITechnicalAgentServiceRemote {
	
	public List<TechnicalAgent> getAllTechnicalAgents();

}
