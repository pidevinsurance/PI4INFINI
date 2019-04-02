package tn.esprit.microinsurance.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.TechnicalAgent;

@Local
public interface ITechnicalAgentServiceLocal {
	
	public List<TechnicalAgent> getAllTechnicalAgents();

}
