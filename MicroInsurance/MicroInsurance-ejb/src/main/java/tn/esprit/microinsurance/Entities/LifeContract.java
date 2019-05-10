package tn.esprit.microinsurance.Entities;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class LifeContract {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LifeCONTRACT_ID")
	private int lifeContract_id;

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
	
	@Column(name = "INITIAL_AMOUNT")
	float Initial_Amount;

	@Enumerated(EnumType.STRING)
	@Column(name = "Amount_Mode")
	private ModeType modeType;
	
	@Enumerated(EnumType.STRING)
	private Type_life type_life;
	
	public LifeContract() {
		super();
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

	public int getLifeContract_id() {
		return lifeContract_id;
	}


	public void setLifeContract_id(int lifeContract_id) {
		this.lifeContract_id = lifeContract_id;
	}


	public int getDuration() {
		return Duration;
	}


	public void setDuration(int duration) {
		Duration = duration;
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
	public float getInitial_Amount() {
		return Initial_Amount;
	}
	public void setInitial_Amount(float initial_Amount) {
		Initial_Amount = initial_Amount;
	}
	public ModeType getModeType() {
		return modeType;
	}
	public void setModeType(ModeType modeType) {
		this.modeType = modeType;
	}
	public Type_life getType_life() {
		return type_life;
	}
	public void setType_life(Type_life type_life) {
		this.type_life = type_life;
	}


	public enum Type_life{pension,Death}
	public enum ModeType{Mensuel,trimestriel,Anuelle }
}
