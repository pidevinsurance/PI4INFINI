package tn.esprit.microinsurance.services.Interfaces;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.User;


@Local
public interface IUserServiceLocal {
	
	public void addUser(User u);

}
