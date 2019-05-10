package tn.esprit.microinsurance.services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Sinister_Report;

@Remote
public interface ISinisterReportServiceRemote {
	
	public void addSinisterReport(Sinister_Report SinRep);
	public List<Sinister_Report> getAllSinisterReports();
	

}
