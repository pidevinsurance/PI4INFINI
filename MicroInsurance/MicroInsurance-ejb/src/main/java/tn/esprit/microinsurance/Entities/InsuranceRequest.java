package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "T_InsuranceRequest")
public class InsuranceRequest implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REQUEST_ID")
	int Request_id;

	@Column(name = "REQUEST_DESCRIPTION")
	private String RequestDescription;

	@Temporal(TemporalType.DATE)
	@Column(name = "DEMAND_DATE")
	private Date Demanddate;

	@Column(name = "IS_VALID")
	private boolean isValide;

	public int getRequest_id() {
		return Request_id;
	}

	public void setRequest_id(int request_id) {
		Request_id = request_id;
	}

	public String getRequestDescription() {
		return RequestDescription;
	}

	public void setRequestDescription(String requestDescription) {
		RequestDescription = requestDescription;
	}

	public Date getDemanddate() {
		return Demanddate;
	}

	public void setDemanddate(Date demanddate) {
		Demanddate = demanddate;
	}

	public boolean isValide() {
		return isValide;
	}

	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}
	 
	
}
