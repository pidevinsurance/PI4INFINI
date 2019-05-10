package tn.esprit.microinsurance.Services.Interf;


import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Complaints;
import tn.esprit.microinsurance.Entities.Type_subject;


@Remote
public interface IComplaintsRemote {

	
	public List<Complaints> displayComplaints();
	Long getComplaintBystring(Type_subject type);
	void ajouterComplaint(Date dateofpub, int idAgent, int idClient, String text, Type_subject type);



}
