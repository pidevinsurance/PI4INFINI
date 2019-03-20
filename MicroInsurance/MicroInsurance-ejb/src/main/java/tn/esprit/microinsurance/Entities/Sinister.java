package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "T_SINISTER")

public class Sinister implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SINISTER_ID")
	int  Sinister_id;
	
	@Column(name = "SINISTER_INDEMNITY")
	private float Indemnity;
	
	@Column(name = "INEDEMNITY_BEGIN")
	private Date Indemnity_begin;
	
	@Column(name = "Indemnity_maturity")
	private Date Indemnity_maturity;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "SINISTER_DECLARATIONDATE")
	private Date declarationDate;
	
	@Column(name = "SINISTER_STATUS")
	private String status;
	
	@Column(name = "SINISTER_DESCRIPTION")
	private String description;
	
	@ManyToOne
	private Contract contract;
	
	@OneToOne
	private Indemnity_Request IndemnityRequest;
	
	public int getSinister_id() {
		return Sinister_id;
	}

	public void setSinister_id(int sinister_id) {
		Sinister_id = sinister_id;
	}

	public float getIndemnity() {
		return Indemnity;
	}

	public void setIndemnity(float indemnity) {
		Indemnity = indemnity;
	}

	public Date getIndemnity_begin() {
		return Indemnity_begin;
	}

	public void setIndemnity_begin(Date indemnity_begin) {
		Indemnity_begin = indemnity_begin;
	}

	public Date getIndemnity_maturity() {
		return Indemnity_maturity;
	}

	public void setIndemnity_maturity(Date indemnity_maturity) {
		Indemnity_maturity = indemnity_maturity;
	}

	public Date getDeclarationDate() {
		return declarationDate;
	}

	public void setDeclarationDate(Date declarationDate) {
		this.declarationDate = declarationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}


}
