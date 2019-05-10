package tn.esprit.microinsurance.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.IndemnityRequestPk;
import tn.esprit.microinsurance.Entities.Sinister_Report;

@Local
public interface ISinisterReportServiceLocal {

	public void addSinisterReport(Sinister_Report SinRep);
	public List<Sinister_Report> getAllSinisterReports();
	
	
}
