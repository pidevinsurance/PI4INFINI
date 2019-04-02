package tn.esprit.microinsurance.services.Interfaces;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.Appointment;


@Local
public interface IAppointmentServiceLocal {
	
	public void addAppointment(Appointment app);
	

}
