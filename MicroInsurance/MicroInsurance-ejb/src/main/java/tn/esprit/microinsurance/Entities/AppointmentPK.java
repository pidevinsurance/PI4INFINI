package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Embeddable
public class AppointmentPK implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idClient;
	
	private int idTechnicalAgent;
	

	@Temporal(TemporalType.DATE)
	private Date dateAppointment;


	public AppointmentPK() {
		super();
	}
	
	
	


	public AppointmentPK(int idClient, int idTechnicalAgent, Date dateAppointment) {
		super();
		this.idClient = idClient;
		this.idTechnicalAgent = idTechnicalAgent;
		this.dateAppointment = dateAppointment;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAppointment == null) ? 0 : dateAppointment.hashCode());
		result = prime * result + idClient;
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
		AppointmentPK other = (AppointmentPK) obj;
		if (dateAppointment == null) {
			if (other.dateAppointment != null)
				return false;
		} else if (!dateAppointment.equals(other.dateAppointment))
			return false;
		if (idClient != other.idClient)
			return false;
		if (idTechnicalAgent != other.idTechnicalAgent)
			return false;
		return true;
	}


	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public int getIdTechnicalAgent() {
		return idTechnicalAgent;
	}


	public void setIdTechnicalAgent(int idTechnicalAgent) {
		this.idTechnicalAgent = idTechnicalAgent;
	}


	public Date getDateAppointment() {
		return dateAppointment;
	}


	public void setDateAppointment(Date dateAppointment) {
		this.dateAppointment = dateAppointment;
	}
	
	
}
