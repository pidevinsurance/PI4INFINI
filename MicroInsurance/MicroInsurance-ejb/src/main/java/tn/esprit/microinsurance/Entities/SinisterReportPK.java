package tn.esprit.microinsurance.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SinisterReportPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public SinisterReportPK() {
	super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + RequestReportId;
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
		if (RequestReportId != other.RequestReportId)
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (idTechnicalAgent != other.idTechnicalAgent)
			return false;
		return true;
	}

	private int idAgent;
	
	private int idTechnicalAgent;
	
	private int RequestReportId ;



	public int getIdTechnicalAgent() {
		return idTechnicalAgent;
	}

	public void setIdTechnicalAgent(int idTechnicalAgent) {
		this.idTechnicalAgent = idTechnicalAgent;
	}

	public int getRequestReportId() {
		return RequestReportId;
	}

	public void setRequestReportId(int requestReportId) {
		RequestReportId = requestReportId;
	}

	public int getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	
	
}
