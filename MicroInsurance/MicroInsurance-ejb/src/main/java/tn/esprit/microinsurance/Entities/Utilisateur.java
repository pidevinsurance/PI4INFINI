package tn.esprit.microinsurance.Entities;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="T_UTILISATEUR")
public class Utilisateur implements Serializable {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column(name="UT_ID")
int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="NOM")
String nom;
@Column(name="PRENOM")
String prenom;
@Column(name="ADRESS_MAIL")
String adresseMail;
@Column(name="USERNAME")
String username;
@Column(name="password")
String password;
@Column(name="ROLE")
String role;
@Column(name="TOKEN")
String token;
@Column(name="PHOTO")
String photo;
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
public Utilisateur() {}
public String getNom() {return nom;}
public void setNom(String nom) {this.nom = nom;}
public String getPrenom() {return prenom;}
public void setPrenom(String prenom) {this.prenom = prenom;}
public String getAdresseMail() {return adresseMail;}
public void setAdresseMail(String adresseMail) {this.adresseMail = adresseMail;}

}
