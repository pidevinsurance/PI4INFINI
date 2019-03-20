package tn.esprit.microinsurance.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

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
		result = prime * result + IndemnityRequest_id;
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
		if (IndemnityRequest_id != other.IndemnityRequest_id)
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (idClient != other.idClient)
			return false;
		return true;
	}


	private int idClient;
	
	private int idAgent;
	
	private int  IndemnityRequest_id;

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

	public int getIndemnityRequest_id() {
		return IndemnityRequest_id;
	}

	public void setIndemnityRequest_id(int indemnityRequest_id) {
		IndemnityRequest_id = indemnityRequest_id;
	}
}
