package tn.esprit.microinsurance.services.Interfaces;

import java.util.List;

import javax.ejb.Local;


import tn.esprit.microinsurance.Entities.Sinister;

@Local
public interface ISinisterServiceLocal {
	
	public void addSinister(Sinister sin);
	public List<Sinister> getAllSinisters();

}
