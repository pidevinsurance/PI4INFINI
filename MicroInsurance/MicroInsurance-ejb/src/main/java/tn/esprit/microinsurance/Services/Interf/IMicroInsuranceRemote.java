package tn.esprit.microinsurance.Services.Interf;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.MicroInsurance;


@Remote
public interface IMicroInsuranceRemote {

		public int addMicroInsurance(MicroInsurance microInsurance);
		public int updateMicroInsurance(MicroInsurance microInsurance);
		public void removeMicroInsurance(int MicroInsuranceID);
		public MicroInsurance getMicroInsuranceById(int MicroInsuranceID);
		public List<Object[]> countClients();

	}
