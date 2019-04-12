package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class IndemnityRequestPk  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IndemnityRequestPk() {
		super();
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAgent;
		result = prime * result + idClient;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IndemnityRequestPk other = (IndemnityRequestPk) obj;
		
		if (idAgent != other.idAgent)
			return false;
		if (idClient != other.idClient)
			return false;
		return true;
	}


	private int idClient;
	
	private int idAgent;
	

	@Temporal(TemporalType.DATE)
	@Column(name = "Indemnity_DATE")
	private Date Indemnity_date;

	public int getIdClient() {
		return idClient;
	}

	public Date getIndemnity_date() {
		return Indemnity_date;
	}


	public void setIndemnity_date(Date indemnity_date) {
		Indemnity_date = indemnity_date;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}


}
