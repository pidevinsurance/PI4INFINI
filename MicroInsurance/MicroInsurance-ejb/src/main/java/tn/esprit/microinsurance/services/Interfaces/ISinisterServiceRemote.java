package tn.esprit.microinsurance.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Sinister;


@Remote
public interface ISinisterServiceRemote {
	
	public void addSinister(Sinister sin);
	public List<Sinister> getAllSinisters();

}
