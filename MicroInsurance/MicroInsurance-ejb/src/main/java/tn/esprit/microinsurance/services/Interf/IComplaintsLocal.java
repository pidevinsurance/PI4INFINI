package tn.esprit.microinsurance.services.Interf;

import java.math.BigInteger;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.Complaints;
import tn.esprit.microinsurance.Entities.Type_subject;


@Local
public interface IComplaintsLocal {
	
	public List<Complaints> displayComplaints();
	Long getComplaintBystring(Type_subject type);



}
