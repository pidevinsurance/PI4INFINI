package tn.esprit.microinsurance.services.Interfaces;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Appointment;

@Remote
public interface IAppointmentServiceRemote {
	
	public void addAppointment(Appointment app);

}
