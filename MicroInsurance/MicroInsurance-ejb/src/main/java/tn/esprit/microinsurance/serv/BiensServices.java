package tn.esprit.microinsurance.serv;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.microinsurance.Entities.Biens;
import tn.esprit.microinsurance.interf.BiensLocal;
import tn.esprit.microinsurance.interf.BiensRemote;

@Stateless
@LocalBean
public class BiensServices implements BiensLocal, BiensRemote {

	// Microinsurance-ejb in persistence.xml
	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;

	@Override
	public int addBien(Biens biens) {

		System.out.println("In addBien : ");
		em.persist(biens);
		System.out.println("Out of addBien" + biens.getId());
		return biens.getId();

	}

	@Override
	public void removeBien(int id) {
		System.out.println("In removeBien : ");
		em.remove(em.find(Biens.class, id));
		System.out.println("Out of removeBien : ");

	}

	@Override
	public void updateBien(Biens biensNewValue) {
		System.out.println("In updateBien : ");
		Biens biens = em.find(Biens.class, biensNewValue.getId());
		biens.setContractNumber(biensNewValue.getContractNumber());
		biens.setProperty(biensNewValue.getProperty());
		biens.setQuantity(biensNewValue.getQuantity());
		biens.setInitialAmount(biensNewValue.getInitialAmount());
		biens.setBeginDate(biensNewValue.getBeginDate());
		biens.setEndDate(biensNewValue.getEndDate());
		biens.setDescription(biensNewValue.getDescription());

		System.out.println("Out of updateBien : ");

	}

	@Override
	public Biens findBienById(int id) {

		System.out.println("In findBienById : ");
		Biens biens = em.find(Biens.class, id);
		System.out.println("Out of findBienById : ");
		return biens;

	}

	@Override
	public List<Biens> findAllBiens() {
		List<Biens> biens = em.createQuery("select u from Biens u", Biens.class).getResultList();
		return biens;
	}

}
