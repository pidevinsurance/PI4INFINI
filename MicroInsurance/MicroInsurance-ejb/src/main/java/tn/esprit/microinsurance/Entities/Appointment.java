package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@EmbeddedId
	private AppointmentPK Appointment_id;
	
	
	
	@ManyToOne
    @JoinColumn(name = "idClient", referencedColumnName = "USER_ID", insertable=false, updatable=false)
	private User user;
	

	@ManyToOne
    @JoinColumn(name = "idTechnicalAgent", referencedColumnName = "TECHNICALAGENT_ID", insertable=false, updatable=false)
	private TechnicalAgent technical_agent;
	
	
	@Column(name = "APPOINTMENT_LOCATION")
	String  location;
	
	@Temporal(TemporalType.DATE)
	Date  date;

	public User getUser() {
		return user;
	}
	
	

	public AppointmentPK getAppointment_id() {
		return Appointment_id;
	}



	public void setAppointment_id(AppointmentPK appointment_id) {
		Appointment_id = appointment_id;
	}



	public void setUser(User user) {
		this.user = user;
	}

	public TechnicalAgent getTechnical_agent() {
		return technical_agent;
	}

	public void setTechnical_agent(TechnicalAgent technical_agent) {
		this.technical_agent = technical_agent;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
