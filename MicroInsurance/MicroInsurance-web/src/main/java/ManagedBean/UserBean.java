package ManagedBean;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;

import tn.esprit.microinsurance.Entities.Utilisateur;
import tn.esprit.microinsurance.services.Impl.UserServiceImpl;



@ManagedBean(name = "UserBean") 
@SessionScoped

public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String nom;
	private String prenom;
	private String adresseMail;
	private String username;
	private String password;
	private String role;
	private String token;
	private String photo;
	private Utilisateur utilisateur;
    private Boolean loggedIn;
	



	@EJB
	UserServiceImpl UserServiceImpl;

	public UserBean() {}
 
	public String addUser()
	{String page=null;
		Utilisateur f= new Utilisateur();	
		f.setNom(nom);
		f.setPassword(password);
		f.setPrenom(prenom);
		f.setAdresseMail(adresseMail);
		f.setRole("Client");
		if(f.getAdresseMail().length()==0 || f.getNom().length()==0 || f.getPrenom().length()==0 || f.getPassword().length()==0 )
		{FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage(FacesMessage.SEVERITY_WARN,"Empty fields","aaaa"));
			return "";
		}
		UserServiceImpl.addUser(f);
		page="index2?faces-redirect=true";
		loggedIn=true;	
		return page;
	}

	public void removefUser(int UserId)
	{
		UserServiceImpl.removeUser(UserId); 
	}
	
	public String Login() 
	{   String page=null;

		utilisateur=UserServiceImpl.finds(adresseMail, password);
		if(utilisateur!=null)
		{page="index2?faces-redirect=true";
		loggedIn=true;	
		}
		else{ FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("Bad Credentials"));
        return "";}
		return page;


		 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
