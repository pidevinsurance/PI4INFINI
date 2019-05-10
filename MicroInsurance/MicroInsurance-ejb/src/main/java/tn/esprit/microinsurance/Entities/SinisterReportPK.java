package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class SinisterReportPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idAgent;

	private int idTechnicalAgent;

	private Date CreationDate;
	
	
	

	public SinisterReportPK() {
		super();
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CreationDate == null) ? 0 : CreationDate.hashCode());
		result = prime * result + idAgent;
		result = prime * result + idTechnicalAgent;
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
		SinisterReportPK other = (SinisterReportPK) obj;
		if (CreationDate == null) {
			if (other.CreationDate != null)
				return false;
		} else if (!CreationDate.equals(other.CreationDate))
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (idTechnicalAgent != other.idTechnicalAgent)
			return false;
		return true;
	}






	public int getIdTechnicalAgent() {
		return idTechnicalAgent;
	}

	public void setIdTechnicalAgent(int idTechnicalAgent) {
		this.idTechnicalAgent = idTechnicalAgent;
	}

	public int getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	public Date getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}

}
