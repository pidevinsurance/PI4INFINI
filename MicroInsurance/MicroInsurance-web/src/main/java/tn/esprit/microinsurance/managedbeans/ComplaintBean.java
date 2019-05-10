package tn.esprit.microinsurance.managedbeans;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.microinsurance.Entities.Complaints;
import tn.esprit.microinsurance.Entities.Type_subject;
import tn.esprit.microinsurance.Services.Impl.ComplaintsServiceImpl;

@SessionScoped
@ManagedBean(name="complaintbean")
public class ComplaintBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	ComplaintsServiceImpl cs;
	

	private String complainttext;
	private Type_subject typesub;

	
	public void addComplaint()
	{
		int idAgent=1;
		int idClient=1;
		Date datesys = new Date();
	    Date dateofpub=datesys;
		cs.ajouterComplaint(dateofpub, idAgent, idClient, complainttext, typesub);
	}
	


	public ComplaintsServiceImpl getCs() {
		return cs;
	}


	public void setCs(ComplaintsServiceImpl cs) {
		this.cs = cs;
	}


	public String getComplainttext() {
		return complainttext;
	}


	public void setComplainttext(String complainttext) {
		this.complainttext = complainttext;
	}


	public Type_subject getTypesub() {
		return typesub;
	}


	public void setTypesub(Type_subject typesub) {
		this.typesub = typesub;
	}

	
	
	

}
