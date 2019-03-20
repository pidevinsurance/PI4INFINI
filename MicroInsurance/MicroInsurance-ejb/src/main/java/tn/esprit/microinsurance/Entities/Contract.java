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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_Contracts")
public class Contract implements Serializable {



	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONTRACT_ID")
	private int Contract_id;

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

	@Temporal(TemporalType.DATE)
	@Column(name = "CONTRACT_DURATION")
	private Date Duration;

	@Column(name = "COVRED_LEVEL")
	float CovredLevel;

	@Column(name = "CONTRACT_DESCRIPTION")
	private String Description;
	
	@OneToMany(mappedBy="contract", cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Sinister> sinisters = new ArrayList<>();

	
	@OneToMany(mappedBy="contract")
	private List<Premium> premiums= new ArrayList<>();
	
	@ManyToOne
	private MicroInsurance microInsurance;
	
	public MicroInsurance getMicroInsurance() {
		return microInsurance;
	}



	public void setMicroInsurance(MicroInsurance microInsurance) {
		this.microInsurance = microInsurance;
	}



	public List<Sinister> getSinisters() {
		return sinisters;
	}



	public void setSinisters(List<Sinister> sinisters) {
		this.sinisters = sinisters;
	}

	
	
	
	public float getCovredLevel() {
		return CovredLevel;
	}



	public void setCovredLevel(float covredLevel) {
		CovredLevel = covredLevel;
	}



	public Contract() {
		super();
	}

	

	public int getContract_id() {
		return Contract_id;
	}

	public void setContract_id(int contract_id) {
		Contract_id = contract_id;
	}

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

	public Date getDuration() {
		return Duration;
	}

	public void setDuration(Date duration) {
		Duration = duration;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	

}
