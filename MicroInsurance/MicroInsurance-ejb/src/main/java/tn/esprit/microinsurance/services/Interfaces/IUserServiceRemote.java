package tn.esprit.microinsurance.services.Interfaces;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.User;


@Remote
public interface IUserServiceRemote {
	
	public void addUser(User u);

}
