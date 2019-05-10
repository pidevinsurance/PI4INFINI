package tn.esprit.microinsurance.services.Impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.microinsurance.Entities.Sinister;
import tn.esprit.microinsurance.services.Interfaces.ISinisterServiceLocal;
import tn.esprit.microinsurance.services.Interfaces.ISinisterServiceRemote;

@Stateless
public class SinisterServiceImpl implements ISinisterServiceRemote, ISinisterServiceLocal{

	
	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;
	
	@Override
	public void addSinister(Sinister sin) {
		
		em.persist(sin);
		
	}
	

	@Override
	public List<Sinister> getAllSinisters() {
		List<Sinister> Sinisters = em.createQuery("select s from Sinister s", Sinister.class).getResultList();
		return Sinisters;
	}
	
	

}
