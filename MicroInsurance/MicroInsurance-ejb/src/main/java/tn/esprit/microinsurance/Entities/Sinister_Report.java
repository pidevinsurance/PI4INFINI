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
public class Sinister_Report implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuotationPK Quotation_id;


	@ManyToOne
    @JoinColumn(name = "idAgent", referencedColumnName = "AGENT_ID", insertable=false, updatable=false)
	private Agent agent;
	

	@ManyToOne
    @JoinColumn(name = "idTechnicalAgent", referencedColumnName = "TECHNICALAGENT_ID", insertable=false, updatable=false)
	private TechnicalAgent technical_agent;
	
	
	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}

	@Column(name = "SINISTER_COST")
	private float  cost;
	
	@Column(name = "SINISTER_LOCATION")
	private String Location;
	
	@Column(name = "SINISTER_DESCRIPTION")
	private String description;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "REPORT_CREATIONDATE")
	private Date CreationDate;
	
}
