package tn.esprit.microinsurance.Entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;





@Entity
public class Complaints implements Serializable {

	
	
	private static final long serialVersionUID = 1L;

	
	public Complaints() {
		super();
		// TODO Auto-generated constructor stub
	}



	@EmbeddedId
	private ComplaintsPK Complaint_id; 
	

	@ManyToOne
	@JoinColumn(name = "idClient", referencedColumnName = "USER_ID", insertable=false, updatable=false)
	private User user;


	@ManyToOne
	@JoinColumn(name = "idAgent", referencedColumnName = "AGENT_ID", insertable=false, updatable=false)
	private Agent agent;

	

	


	public Complaints(ComplaintsPK complaint_id, String complaintText, String status, Type_subject type_subject) {
		super();
		Complaint_id = complaint_id;
		ComplaintText = complaintText;
		this.status = status;
		this.type_subject = type_subject;
	}


	public Complaints(String complaintText, Type_subject type_subject) {
		super();
		ComplaintText = complaintText;
		this.type_subject = type_subject;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Agent getAgent() {
		return agent;
	}


	public void setAgent(Agent agent) {
		this.agent = agent;
	}


	public Type_subject getType_subject() {
		return type_subject;
	}


	public void setType_subject(Type_subject type_subject) {
		this.type_subject = type_subject;
	}


	
	@Column(name = "COMPLAINT_TEXT")
	private String ComplaintText;
	
	
	@Column(name = "COMPLAINT_STATUS")
	private String status;
	

	@Enumerated(EnumType.STRING)
	private Type_subject type_subject;
	
	

	public ComplaintsPK getComplaint_id() {
		return Complaint_id;
	}


	public void setComplaint_id(ComplaintsPK complaint_id) {
		Complaint_id = complaint_id;
	}


	public String getComplaintText() {
		return ComplaintText;
	}


	public void setComplaintText(String complaintText) {
		ComplaintText = complaintText;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	
}
