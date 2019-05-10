package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class HealthContract implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HealthCONTRACT_ID")
	private int healthContract_id;

	@Column(name = "CONTRACT_NUMBER")
	String contractNumber;

	@Temporal(TemporalType.DATE)
	private Date creationDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE")
	private Date beginningDate;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE")
	private Date endDate;

	//@Temporal(TemporalType.DATE)
	@Column(name = "CONTRACT_DURATION")
	private int Duration;

	@Column(name = "COVRED_LEVEL")
	float CovredLevel;

	@Column(name = "CONTRACT_DESCRIPTION")
	private String Description;
	
	@OneToMany(mappedBy="contract", cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Sinister> sinisters = new ArrayList<>();

	
	@OneToMany(mappedBy="contract")
	private List<Premium> premiums= new ArrayList<>();
	
	@ManyToOne
	private Product product;
	

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getBeginningDate() {
		return beginningDate;
	}

	public void setBeginningDate(Date beginningDate) {
		this.beginningDate = beginningDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public int getHealthContract_id() {
		return healthContract_id;
	}

	public void setHealthContract_id(int healthContract_id) {
		this.healthContract_id = healthContract_id;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int date1) {
		Duration = date1;
	}

	public float getCovredLevel() {
		return CovredLevel;
	}

	public void setCovredLevel(float covredLevel) {
		CovredLevel = covredLevel;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<Sinister> getSinisters() {
		return sinisters;
	}

	public void setSinisters(List<Sinister> sinisters) {
		this.sinisters = sinisters;
	}

	public List<Premium> getPremiums() {
		return premiums;
	}

	public void setPremiums(List<Premium> premiums) {
		this.premiums = premiums;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	public Boolean getHeartDisieases() {
		return heartDisieases;
	}

	public void setHeartDisieases(Boolean heartDisieases) {
		this.heartDisieases = heartDisieases;
	}

	public Date getLastHospitalisation() {
		return lastHospitalisation;
	}

	public void setLastHospitalisation(Date lastHospitalisation) {
		this.lastHospitalisation = lastHospitalisation;
	}

	public Date getLastSurgery() {
		return lastSurgery;
	}

	public void setLastSurgery(Date lastSurgery) {
		this.lastSurgery = lastSurgery;
	}

	public Boolean getLongTermTreatments() {
		return longTermTreatments;
	}

	public void setLongTermTreatments(Boolean longTermTreatments) {
		this.longTermTreatments = longTermTreatments;
	}

	private Boolean diabetes;
	private Boolean mentalIllness;
	private Boolean suddenDeaths;
	private Boolean overweight;
	private Boolean hypertension;
	private Boolean heartDisieases;

	@Temporal(TemporalType.DATE)
	private Date lastHospitalisation;

	@Temporal(TemporalType.DATE)
	private Date lastSurgery;

	private Boolean longTermTreatments;

	public HealthContract()  {

	}
	



}
