package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_USER")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int id;
	@Column(name = "USER_NOM")
	private String nom;
	@Column(name = "USER_PRENOM")
	private String prenom;
	@Column(name = "USERNAME")
	private String Username;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "USER_MAIL")
	private String Mail;
	@Column(name = "USER_ADRESS")
	private String Adress;

	@Column(name = "USER_INCOME")
	private float Income;

	@Column(name = "USER_MARITALSTATUS")
	private String MaritalStatus;
	
	@Column(name = "USER_OCCUPATION")
	private String  Occupation;
	
	@Enumerated(EnumType.STRING)
	private Role_User role;
	
	@Column(name = "USER_STATUS")
	private String Status;
	
	@Column(name = "USER_PHONENB")
	private String Phone_Number;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "USER_DateOfBirth")
	private Date DateOfBirth;
	
	@Column(name = "USER_CIN")
	private String USER_CIN;
	
	
	@OneToMany(mappedBy="user")
	private List<Appointment> appointments;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contract> contracts = new ArrayList<>();

	@OneToMany(mappedBy="user")
	private List<Indemnity_Request> IndemnityRequests;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "USER_JOINDATE")
	private Date JoinDate;

	
	@OneToMany(mappedBy="user")
	private List<Complaints> claims;
	
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

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public float getIncome() {
		return Income;
	}

	public void setIncome(float income) {
		Income = income;
	}

	public String getMaritalStatus() {
		return MaritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public Role_User getRole() {
		return role;
	}

	public void setRole(Role_User role) {
		this.role = role;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getUSER_CIN() {
		return USER_CIN;
	}

	public void setUSER_CIN(String uSER_CIN) {
		USER_CIN = uSER_CIN;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public List<Indemnity_Request> getIndemnityRequests() {
		return IndemnityRequests;
	}

	public void setIndemnityRequests(List<Indemnity_Request> indemnityRequests) {
		IndemnityRequests = indemnityRequests;
	}

	public Date getJoinDate() {
		return JoinDate;
	}

	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}

	public List<Complaints> getClaims() {
		return claims;
	}

	public void setClaims(List<Complaints> claims) {
		this.claims = claims;
	}
	
	

	
}