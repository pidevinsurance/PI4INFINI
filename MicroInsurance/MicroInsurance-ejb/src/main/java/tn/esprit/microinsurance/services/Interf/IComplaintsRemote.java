package tn.esprit.microinsurance.services.Interf;

import java.math.BigInteger;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Complaints;
import tn.esprit.microinsurance.Entities.Type_subject;


@Remote
public interface IComplaintsRemote {

	
	public List<Complaints> displayComplaints();
	Long getComplaintBystring(Type_subject type);



}
