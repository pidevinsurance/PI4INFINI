package tn.esprit.microinsurance.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class AppointmentPK implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idClient;
	
	private int idTechnicalAgent;
	
	private int  Appointment_id;
	
	
	public AppointmentPK()
	{
		super();
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Appointment_id;
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
		if (Appointment_id != other.Appointment_id)
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



	public int getAppointment_id() {
		return Appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		Appointment_id = appointment_id;
	}

	public int getIdTechnicalAgent() {
		return idTechnicalAgent;
	}

	public void setIdTechnicalAgent(int idTechnicalAgent) {
		this.idTechnicalAgent = idTechnicalAgent;
	}
}
