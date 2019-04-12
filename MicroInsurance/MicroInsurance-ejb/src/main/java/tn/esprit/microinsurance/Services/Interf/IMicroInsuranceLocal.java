package tn.esprit.microinsurance.Services.Interf;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.MicroInsurance;

@Local
public interface IMicroInsuranceLocal {
	
	public int addMicroInsurance(MicroInsurance microInsurance);
	public int updateMicroInsurance(MicroInsurance microInsurance);
	public void removeMicroInsurance(int MicroInsuranceID);
	public MicroInsurance getMicroInsuranceById(int MicroInsuranceID);
}