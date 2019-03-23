package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	private int nb_insuredMax;
	
	
	@Column(name = "MI_DESCRIPTION")
	private String Description;
	
	@Column(name = "MI_BUDGET")
	private float Budget;
	
	
	@Column(name = "MI_CONTACT")
	private int contact;
	
	
	@Column(name = "MI_LOCATION")
	private String Location;
	

	@OneToMany(mappedBy="microinsurance")
	private List<Product> products= new ArrayList<>();
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	

	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public int getNb_insuredMax() {
		return nb_insuredMax;
	}


	public void setNb_insuredMax(int nb_insuredMax) {
		this.nb_insuredMax = nb_insuredMax;
	}


	public float getBudget() {
		return Budget;
	}


	public void setBudget(float budget) {
		Budget = budget;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}





}
