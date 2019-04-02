package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class IndemnityRequestPk  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int idClient;
	
	private int idAgent;
	
	@Temporal(TemporalType.DATE)
	private Date dateIndemnityRequest;

	public IndemnityRequestPk() {
		super();
	}
	
	

	public IndemnityRequestPk(int idClient, int idAgent, Date dateIndemnityRequest) {
		super();
		this.idClient = idClient;
		this.idAgent = idAgent;
		this.dateIndemnityRequest = dateIndemnityRequest;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateIndemnityRequest == null) ? 0 : dateIndemnityRequest.hashCode());
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
		if (dateIndemnityRequest == null) {
			if (other.dateIndemnityRequest != null)
				return false;
		} else if (!dateIndemnityRequest.equals(other.dateIndemnityRequest))
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (idClient != other.idClient)
			return false;
		return true;
	}

	public int getIdClient() {
		return idClient;
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

	public Date getDateIndemnityRequest() {
		return dateIndemnityRequest;
	}

	public void setDateIndemnityRequest(Date dateIndemnityRequest) {
		this.dateIndemnityRequest = dateIndemnityRequest;
	}

	
	
	
	
	
}