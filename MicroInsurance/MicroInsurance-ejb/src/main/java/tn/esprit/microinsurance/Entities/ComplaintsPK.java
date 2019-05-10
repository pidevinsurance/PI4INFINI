package tn.esprit.microinsurance.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class ComplaintsPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idClient;
	
	@Temporal(TemporalType.DATE)
	private Date Date_Of_Pub ;
	
	private int idAgent;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Date_Of_Pub == null) ? 0 : Date_Of_Pub.hashCode());
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
		if (Date_Of_Pub == null) {
			if (other.Date_Of_Pub != null)
				return false;
		} else if (!Date_Of_Pub.equals(other.Date_Of_Pub))
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (idClient != other.idClient)
			return false;
		return true;
	}







	public Date getDate_Of_Pub() {
		return Date_Of_Pub;
	}







	public void setDate_Of_Pub(Date date_Of_Pub) {
		Date_Of_Pub = date_Of_Pub;
	}







	public ComplaintsPK() {
		super();
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


}
