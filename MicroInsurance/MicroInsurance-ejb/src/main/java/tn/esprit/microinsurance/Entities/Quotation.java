package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Quotation implements Serializable{



	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuotationPK Quotation_id;


	@Temporal(TemporalType.DATE)
	private Date QuotationBegining ;

	@Temporal(TemporalType.DATE)
	private Date QuotationEnd ;

	@Column(name = "AMOUNT")
	private float amount ;


	@ManyToOne
	@JoinColumn(name = "idClient", referencedColumnName = "USER_ID", insertable=false, updatable=false)
	private User user;


	@ManyToOne
	@JoinColumn(name = "idAgent", referencedColumnName = "AGENT_ID", insertable=false, updatable=false)
	private Agent agent;


	public Date getQuotationBegining() {
		return QuotationBegining;
	}

	public void setQuotationBegining(Date quotationBegining) {
		QuotationBegining = quotationBegining;
	}

	public Date getQuotationEnd() {
		return QuotationEnd;
	}

	public void setQuotationEnd(Date quotationEnd) {
		QuotationEnd = quotationEnd;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}


}
