package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "MI_COMPLAINTS")
public class Complaints implements Serializable {

	
	
	private static final long serialVersionUID = 1L;

	
	@EmbeddedId
	private ComplaintsPK Complaint_id;
	

	@ManyToOne
	@JoinColumn(name = "idClient", referencedColumnName = "USER_ID", insertable=false, updatable=false)
	private User user;


	@ManyToOne
	@JoinColumn(name = "idAgent", referencedColumnName = "AGENT_ID", insertable=false, updatable=false)
	private Agent agent;

	
	
	@Column(name = "COMPLAINT_TEXT")
	private String ComplaintText;
	
	
	@Column(name = "COMPLAINT_STATUS")
	private String status;
	
	@Temporal(TemporalType.DATE)
	private Date Date_Of_Pub ;
	
	@Enumerated(EnumType.STRING)
	private type_subject type_subject;
	
	public enum type_subject{application,refunds,report,rescission}
	

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
