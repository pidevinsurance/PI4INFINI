package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sinister_Report implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SinisterReportPK SinisterReport_id;


	@ManyToOne
    @JoinColumn(name = "idAgent", referencedColumnName = "AGENT_ID", insertable=false, updatable=false)
	private Agent agent;
	

	@ManyToOne
    @JoinColumn(name = "idTechnicalAgent", referencedColumnName = "TECHNICALAGENT_ID", insertable=false, updatable=false)
	private TechnicalAgent technical_agent;
	
	@OneToOne
	private Indemnity_Request Indemnity_Request;
	

	
	
	
	
	public SinisterReportPK getSinisterReport_id() {
		return SinisterReport_id;
	}

	public void setSinisterReport_id(SinisterReportPK sinisterReport_id) {
		SinisterReport_id = sinisterReport_id;
	}

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
	
	

	

	public Indemnity_Request getIndemnity_Request() {
		return Indemnity_Request;
	}

	public void setIndemnity_Request(Indemnity_Request indemnity_Request) {
		Indemnity_Request = indemnity_Request;
	}





	@Column(name = "SINISTER_COST")
	private float  cost;
	
	@Column(name = "SINISTER_LOCATION")
	private String Location;
	
	@Column(name = "SINISTER_DESCRIPTION")
	private String description;
	
	
	
	
	
	
}
