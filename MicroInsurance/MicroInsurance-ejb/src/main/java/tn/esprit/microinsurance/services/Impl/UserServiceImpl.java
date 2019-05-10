package tn.esprit.microinsurance.services.Impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

import javax.crypto.EncryptedPrivateKeyInfo;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.MessagingException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;

import tn.esprit.microinsurance.Entities.Utilisateur;
import tn.esprit.microinsurance.services.Interf.IUserServiceRemote;

import tn.esprit.microinsurance.services.Impl.MailSender;

@Stateless
@LocalBean
public class UserServiceImpl implements IUserServiceRemote {

@PersistenceContext(unitName = "Microinsurance-ejb")
EntityManager em;
public UserServiceImpl(){
	
};
//@Override
public int addUser(Utilisateur user) {
	user.setPassword(encrypt(user.getPassword()));
	user.setToken(generateCode());
em.persist(user);
try {
	MailSender.sendMail("smtp.gmail.com", "587",
	        "alaaeddine.ouerfelli@esprit.tn", "alaaeddine.ouerfelli@esprit.tn",
	        "aladin123ftw", user.getAdresseMail(), "Validation code", "Your code is "+user.getToken());
} catch (MessagingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();}
return user.getId();
}
//@Override
public void removeUser(int id) {
System.out.println("In removeUser : ");
em.remove(em.find(Utilisateur.class, id));
System.out.println("Out of removeUser : ");
}
//@Override
public void updateUser(Utilisateur userNewValues) {
System.out.println("In updateUser : ");
Utilisateur user = em.find(Utilisateur.class, userNewValues.getId());
user.setToken(userNewValues.getToken());
System.out.println("Out of updateUser : ");
}

//@Override
public Utilisateur findUserById(Integer id) {
System.out.println("In findUserById : ");
Utilisateur user = em.find(Utilisateur.class, id);
/*try {
	MailSender.sendMail("smtp.gmail.com", "587",
	        "alaaeddine.ouerfelli@esprit.tn", "alaaeddine.ouerfelli@esprit.tn",
	        "aladin123ftw", "alaaeddine.ouerfelli@esprit.tn", "Authentication code", "Your code is aaaaaa");
} catch (MessagingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/
System.out.println(encrypt("chiraz"));
return user;
}

//@Override
public List<Utilisateur> findAllUsers() {
System.out.println("In findAllUsers : ");
List<Utilisateur> users = em.createQuery("from Utilisateur", Utilisateur.class).getResultList();
System.out.println("Out of findAllUsers : ");
return users;
}
//@Override
public Utilisateur finds(String mail,String password) {
	Utilisateur user=new Utilisateur();
	Query query =em.createQuery("select a from Utilisateur a where a.adresseMail =:mail AND password=:password", Utilisateur.class);
	query.setParameter("mail",mail);
	query.setParameter("password", encrypt(password));
	
	try{	
		user=(Utilisateur) query.getSingleResult();
	}
	catch (NoResultException e)
	{
		System.out.println("not found");
		return null;	
	}
	if(( user.getRole()!="0")&&(user.getToken()==null)){
		String token=generateCode();
		user.setToken(token);
		try {
			MailSender.sendMail("smtp.gmail.com", "587",
			        "alaaeddine.ouerfelli@esprit.tn", "alaaeddine.ouerfelli@esprit.tn",
			        "aladin123ftw", user.getAdresseMail(), "Authentication code", "Your code is "+token);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		
	}


	return user;
}

public String encrypt(String input) 
{ 
    try {  
        MessageDigest md = MessageDigest.getInstance("SHA-512"); 

       
        byte[] messageDigest = md.digest(input.getBytes()); 

        
        BigInteger no = new BigInteger(1, messageDigest); 

        
        String hashtext = no.toString(16); 

         
        while (hashtext.length() < 32) { 
            hashtext = "0" + hashtext; 
        } 

         
        return hashtext; 
    } 

    
    catch (NoSuchAlgorithmException e) { 
        throw new RuntimeException(e); 
    } 
}
public String generateCode() 
{ 

    
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                + "0123456789"
                                + "abcdefghijklmnopqrstuvxyz"; 

     
    StringBuilder sb = new StringBuilder(8); 

    for (int i = 0; i < 8; i++) { 

        
        int index 
            = (int)(AlphaNumericString.length() 
                    * Math.random()); 

         
        sb.append(AlphaNumericString 
                      .charAt(index)); 
    } 

    return sb.toString(); 
}
@Override
public void reinitialiseToken(Utilisateur userNewValues) {
	Utilisateur user = em.find(Utilisateur.class, userNewValues.getId());
	user.setToken(null);
	
}
@Override
public Utilisateur searchByToken(String token) {
	Utilisateur user=new Utilisateur();
	Query query =em.createQuery("select a from Utilisateur a where a.token=:token", Utilisateur.class);
	query.setParameter("token",token);
	
	
	try{	
		user=(Utilisateur) query.getSingleResult();
	}
	catch (NoResultException e)
	{
		System.out.println("not found");
		return null;	
	}
	return user;
}
@Override
public Utilisateur searchBymail(String mail) {
	Utilisateur user=new Utilisateur();
	Query query =em.createQuery("select a from Utilisateur a where a.adresseMail=:mail", Utilisateur.class);
	query.setParameter("mail",mail);
	
	
	try{	
		user=(Utilisateur) query.getSingleResult();
	}
	catch (NoResultException e)
	{
		System.out.println("not found");
		return null;	
	}
	return user;
}
@Override
public Utilisateur updateUser(String password,Utilisateur utilisateur) {
	Utilisateur user = em.find(Utilisateur.class, utilisateur.getId());
	user.setPassword(encrypt(password));
	user.setUsername(utilisateur.getUsername());
	
	return user;
} 
@Override
public boolean verifpass(Utilisateur user, String pass)
{return(encrypt(pass).equals(user.getPassword()));
	
}
}

 



