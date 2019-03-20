package tn.esprit.microinsurance.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class HealthContract extends Contract  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Boolean diabetes;
	private Boolean mentalIllness;
	private Boolean suddenDeaths;
	private Boolean overweight;
	private Boolean hypertension;

	@Temporal(TemporalType.DATE)
	private Date lastHospitalisation;

	@Temporal(TemporalType.DATE)
	private Date lastSurgery;

	private Boolean longTermTreatments;

	public HealthContract()  {
	super();
	}
	
	public Boolean getHeartDisieases() {
		return heartDisieases;
	}

	public void setHeartDisieases(Boolean heartDisieases) {
		this.heartDisieases = heartDisieases;
	}

	private Boolean heartDisieases;
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



}
