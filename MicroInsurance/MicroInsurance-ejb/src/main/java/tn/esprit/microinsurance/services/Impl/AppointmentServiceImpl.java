package tn.esprit.microinsurance.services.Impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.microinsurance.Entities.Appointment;
import tn.esprit.microinsurance.services.Interfaces.IAppointmentServiceLocal;
import tn.esprit.microinsurance.services.Interfaces.IAppointmentServiceRemote;

@Stateless
public class AppointmentServiceImpl implements IAppointmentServiceRemote, IAppointmentServiceLocal{
	
	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;

	@Override
	public void addAppointment(Appointment app) {
		em.persist(app);
		
	}

}
