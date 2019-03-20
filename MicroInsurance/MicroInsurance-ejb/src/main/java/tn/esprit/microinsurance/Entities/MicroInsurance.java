package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_MICROINSURANCE")
public class MicroInsurance implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MI_ID")
	private int id;
	
	@Column(name = "NB_INSURED")
	private int nb_insured;
	
	@Column(name = "NB_CONTRACTS")
	private int nb_contracts;
	
	@Column(name = "MI_DESCRIPTION")
	private String Description;
	
	@Enumerated( EnumType.STRING)
	private TypesMicroInsurance	type;
	
	
	@Column(name = "MI_Adress")
	private String Adress;
	
	
	@OneToMany(mappedBy="microInsurance", cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Contract> contracts = new ArrayList<>();
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNb_insured() {
		return nb_insured;
	}


	public void setNb_insured(int nb_insured) {
		this.nb_insured = nb_insured;
	}


	public int getNb_contracts() {
		return nb_contracts;
	}


	public void setNb_contracts(int nb_contracts) {
		this.nb_contracts = nb_contracts;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public TypesMicroInsurance getType() {
		return type;
	}


	public void setType(TypesMicroInsurance type) {
		this.type = type;
	}


	public String getAdress() {
		return Adress;
	}


	public void setAdress(String adress) {
		Adress = adress;
	}



}
