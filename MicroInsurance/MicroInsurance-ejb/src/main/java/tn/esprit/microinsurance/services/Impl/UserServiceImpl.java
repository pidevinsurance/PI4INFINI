package tn.esprit.microinsurance.services.Impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.microinsurance.Entities.User;
import tn.esprit.microinsurance.services.Interfaces.IUserServiceLocal;
import tn.esprit.microinsurance.services.Interfaces.IUserServiceRemote;

@Stateless
public class UserServiceImpl implements IUserServiceRemote , IUserServiceLocal{
	
	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;

	@Override
	public void addUser(User u) {
		
		em.persist(u);
		
	}


}
