package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Indemnity_Request implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	@Column(name = "Indemnity_ID")
	private IndemnityRequestPk IndemnityRequest_id;


	@Column(name = "Indemnity_DESCRIPTION")
	String Indemnity_Description;
	

	@Temporal(TemporalType.DATE)
	@Column(name = "Indemnity_DATE")
	private Date Indemnity_date;

	@Column(name = "IS_VALID")
	private boolean isValide;

	@OneToMany( cascade = CascadeType.ALL)
	private List<Justificatory> Justificatories= new ArrayList<>();

	
	@ManyToOne
    @JoinColumn(name = "idClient", referencedColumnName = "USER_ID", insertable=false, updatable=false)
	private User user;
	
	@ManyToOne
    @JoinColumn(name = "idAgent", referencedColumnName = "AGENT_ID", insertable=false, updatable=false)
	private Agent agent;
	
	@ManyToOne( cascade = CascadeType.ALL)
	private TechnicalAgent technicalAgent;
	

	public IndemnityRequestPk getIndemnityRequest_id() {
		return IndemnityRequest_id;
	}

	public void setIndemnityRequest_id(IndemnityRequestPk indemnityRequest_id) {
		IndemnityRequest_id = indemnityRequest_id;
	}

	public String getIndemnity_Description() {
		return Indemnity_Description;
	}

	public void setIndemnity_Description(String indemnity_Description) {
		Indemnity_Description = indemnity_Description;
	}

	public Date getIndemnity_date() {
		return Indemnity_date;
	}

	public void setIndemnity_date(Date indemnity_date) {
		Indemnity_date = indemnity_date;
	}

	public boolean isValide() {
		return isValide;
	}

	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TechnicalAgent getTechnicalAgent() {
		return technicalAgent;
	}

	public void setTechnicalAgent(TechnicalAgent technicalAgent) {
		this.technicalAgent = technicalAgent;
	}
	
	
	
	

}
