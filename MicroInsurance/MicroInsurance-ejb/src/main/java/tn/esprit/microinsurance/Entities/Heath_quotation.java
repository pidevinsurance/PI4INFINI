package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value="Health")

public class Heath_quotation extends Quotation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean diabetes;
	private Boolean mentalIllness;
	private Boolean suddenDeaths;
	private Boolean overweight;
	private Boolean hypertension;
	private int Hospitalisations_number;
	private int Surgeries_number;
	private int chronic_diseases;
	private Boolean longTermTreatments;
	
	
	
	
	public Heath_quotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Heath_quotation(int id, String nom, String prenom, int age, int phone_Number, String mail,
			String maritalStatus, String occupation, float income, String address, QuotationMode mode, int codePostale,
			java.util.Date quotationBegining, java.util.Date quotationEnd, float amount, int score, Status status,
			Product product) {
		super(id, nom, prenom, age, phone_Number, mail, maritalStatus, occupation, income, address, mode, codePostale,
				quotationBegining, quotationEnd, amount, score, status, product);
		// TODO Auto-generated constructor stub
	}
	public Heath_quotation(int id, String nom, String prenom, int age, int phone_Number, String mail, String maritalStatus,
			String occupation, float income, String address, QuotationMode mode, int codePostale,
			Date quotationBegining, Date quotationEnd, float amount, int score, Status status,
			Product product, Boolean diabetes, Boolean mentalIllness, Boolean suddenDeaths, Boolean overweight,
			Boolean hypertension, int hospitalisations_number, int surgeries_number, int chronic_diseases,
			Boolean longTermTreatments) {
		super(id, nom, prenom, age, phone_Number, mail, maritalStatus, occupation, income, address, mode, codePostale,
				quotationBegining, quotationEnd, amount, score, status, product);
		this.diabetes = diabetes;
		this.mentalIllness = mentalIllness;
		this.suddenDeaths = suddenDeaths;
		this.overweight = overweight;
		this.hypertension = hypertension;
		Hospitalisations_number = hospitalisations_number;
		Surgeries_number = surgeries_number;
		this.chronic_diseases = chronic_diseases;
		this.longTermTreatments = longTermTreatments;
	}
	public Boolean getDiabetes() {
		return diabetes;
	}
	public void setDiabetes(Boolean diabetes) {
		this.diabetes = diabetes;
	}
	public Boolean getMentalIllness() {
		return mentalIllness;
	}
	public void setMentalIllness(Boolean mentalIllness) {
		this.mentalIllness = mentalIllness;
	}
	public Boolean getSuddenDeaths() {
		return suddenDeaths;
	}
	public void setSuddenDeaths(Boolean suddenDeaths) {
		this.suddenDeaths = suddenDeaths;
	}
	public Boolean getOverweight() {
		return overweight;
	}
	public void setOverweight(Boolean overweight) {
		this.overweight = overweight;
	}
	public Boolean getHypertension() {
		return hypertension;
	}
	public void setHypertension(Boolean hypertension) {
		this.hypertension = hypertension;
	}
	public int getHospitalisations_number() {
		return Hospitalisations_number;
	}
	public void setHospitalisations_number(int hospitalisations_number) {
		Hospitalisations_number = hospitalisations_number;
	}
	public int getSurgeries_number() {
		return Surgeries_number;
	}
	public void setSurgeries_number(int surgeries_number) {
		Surgeries_number = surgeries_number;
	}
	public Boolean getLongTermTreatments() {
		return longTermTreatments;
	}
	public void setLongTermTreatments(Boolean longTermTreatments) {
		this.longTermTreatments = longTermTreatments;
	}
	public int getChronic_diseases() {
		return chronic_diseases;
	}
	public void setChronic_diseases(int chronic_diseases) {
		this.chronic_diseases = chronic_diseases;
	}

}
