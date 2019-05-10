package tn.esprit.microinsurance.services.Impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import tn.esprit.microinsurance.Entities.Sinister_Report;
import tn.esprit.microinsurance.services.Interfaces.ISinisterReportServiceLocal;
import tn.esprit.microinsurance.services.Interfaces.ISinisterReportServiceRemote;


@Stateless
public class SinisterReportServiceImpl implements ISinisterReportServiceRemote , ISinisterReportServiceLocal{

	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;
	
	@Override
	public void addSinisterReport(Sinister_Report SinRep) {
		
		em.persist(SinRep);
		
	}
	
	@Override
	public List<Sinister_Report> getAllSinisterReports() {
		List<Sinister_Report> SinisterReports = em.createQuery("select s from Sinister_Report s", Sinister_Report.class).getResultList();
		return SinisterReports;
	}
	
	

}
