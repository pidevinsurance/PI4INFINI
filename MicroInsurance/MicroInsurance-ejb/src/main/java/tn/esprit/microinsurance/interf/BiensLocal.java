package tn.esprit.microinsurance.interf;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.Biens;

@Local
public interface BiensLocal {
	public int addBien(Biens biens);
	public void removeBien(int id);
	public void updateBien(Biens biens);
	public Biens findBienById(int id);
	public List<Biens> findAllBiens();
}
