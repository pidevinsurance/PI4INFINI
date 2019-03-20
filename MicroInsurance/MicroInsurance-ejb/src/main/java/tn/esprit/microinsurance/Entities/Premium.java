package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Premium implements Serializable{


	private static final long serialVersionUID = 1L;
	

	
	@EmbeddedId
	private PremiumPk PremiumId; 
	
	@ManyToOne
	@JoinColumn(name = "ContractId", referencedColumnName = "CONTRACT_ID", insertable=false, updatable=false)
	private  Contract contract;


	@ManyToOne
	@JoinColumn(name = "AgentId", referencedColumnName = "AGENT_ID", insertable=false, updatable=false)
	private Agent agent;

	
	@Column(name = "label")
	private String label;
	
	@Column(name = "value")
	private float value;
	
	@Column(name = "Payment_due_value")
	private float payment_due_value;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "payment_due_date")
	private Date payment_Due_Date;



	public PremiumPk getPremiumId() {
		return PremiumId;
	}

	public void setPremiumId(PremiumPk premiumId) {
		PremiumId = premiumId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public float getPayment_due_value() {
		return payment_due_value;
	}

	public void setPayment_due_value(float payment_due_value) {
		this.payment_due_value = payment_due_value;
	}

	public Date getPayment_Due_Date() {
		return payment_Due_Date;
	}

	public void setPayment_Due_Date(Date payment_Due_Date) {
		this.payment_Due_Date = payment_Due_Date;
	}
	
	
}
