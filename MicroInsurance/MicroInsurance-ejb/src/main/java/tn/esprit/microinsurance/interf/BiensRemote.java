package tn.esprit.microinsurance.interf;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Biens;

@Remote
public interface BiensRemote {
	public int addBien(Biens biens);
	public void removeBien(int id);
	public void updateBien(Biens biens);
	public Biens findBienById(int id);
	public List<Biens> findAllBiens();
}
