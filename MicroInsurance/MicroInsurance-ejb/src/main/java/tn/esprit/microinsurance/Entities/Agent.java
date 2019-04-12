package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.ArrayList;
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

@Entity
@Table(name = "T_AGENT")
public class Agent implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AGENT_ID")
	private int id;
	
	@Column(name = "AGENT_USERNAME")
	private String Username;
	
	@Column(name = "AGENT_PASSWORD")
	private String password;
	
	@Column(name = "AGENT_ADRESS")
	private String Adress;
	
	@Column(name = "AGENT_PHONENB")
	private String Phone_Number;

	@Enumerated(EnumType.STRING)
	private Role_Agent role;
	

	@Column(name = "AGENT_CIN")
	private String AGENT_CIN;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="agent")
	private List<Indemnity_Request> IndemnityRequests;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="agent")
	private List<Sinister_Report> reports;
	
	@OneToMany(mappedBy="agent")
	private List<Complaints> claims;
	
	@OneToMany(mappedBy="agent")
	private List<Premium> premiums;
	
	@OneToMany( cascade = CascadeType.ALL)
	private List<Quotation> quotations;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getAdress() {
		return Adress;
	}


	public void setAdress(String adress) {
		Adress = adress;
	}


	public String getPhone_Number() {
		return Phone_Number;
	}


	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}


	public Role_Agent getRole() {
		return role;
	}


	public void setRole(Role_Agent role) {
		this.role = role;
	}


	public String getAGENT_CIN() {
		return AGENT_CIN;
	}


	public void setAGENT_CIN(String aGENT_CIN) {
		AGENT_CIN = aGENT_CIN;
	}


	public Agent() {
		super();
	}
	
	
	

	
}
