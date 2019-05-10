package tn.esprit.microinsurance.services.Interf;

import java.util.List;

import javax.ejb.Remote;


import tn.esprit.microinsurance.Entities.Utilisateur;

@Remote
public interface IUserServiceRemote{
public int addUser(Utilisateur user);
public void removeUser(int id);
public void updateUser(Utilisateur user);
public Utilisateur findUserById(Integer id);
public List<Utilisateur> findAllUsers();
public Utilisateur finds(String email,String password);
public void reinitialiseToken(Utilisateur user);
public Utilisateur searchByToken(String token);
public Utilisateur searchBymail(String mail);
public Utilisateur updateUser(String password,Utilisateur user);
boolean verifpass(Utilisateur user, String pass);





}
