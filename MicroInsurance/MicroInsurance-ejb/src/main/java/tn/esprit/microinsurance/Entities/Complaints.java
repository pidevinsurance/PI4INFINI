package tn.esprit.microinsurance.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "MI_COMPLAINTS")
public class Complaints {

	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMPLAINT_ID")
	int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	@Column(name = "COMPLAINT_TEXT")
	String ComplaintText;
	
	
	@Column(name = "COMPLAINT_STATUS")
	String status;
	
}
