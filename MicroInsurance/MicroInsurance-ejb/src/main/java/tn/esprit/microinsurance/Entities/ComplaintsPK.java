package tn.esprit.microinsurance.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ComplaintsPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ComplaintsPK() {
		super();
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Complaint_id;
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
		ComplaintsPK other = (ComplaintsPK) obj;
		if (Complaint_id != other.Complaint_id)
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (idClient != other.idClient)
			return false;
		return true;
	}


	private int idClient;
	
	private int idAgent;
	
	private int  Complaint_id;

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

	public int getComplaint_id() {
		return Complaint_id;
	}

	public void setComplaint_id(int complaint_id) {
		Complaint_id = complaint_id;
	}
}
