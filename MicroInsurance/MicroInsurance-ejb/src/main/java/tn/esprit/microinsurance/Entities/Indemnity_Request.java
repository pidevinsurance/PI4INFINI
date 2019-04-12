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
	
	

	public String getIndemnity_Description() {
		return Indemnity_Description;
	}

	public void setIndemnity_Description(String indemnity_Description) {
		Indemnity_Description = indemnity_Description;
	}


	public boolean isValide() {
		return isValide;
	}

	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}
	

}
