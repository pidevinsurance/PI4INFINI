package tn.esprit.microinsurance.Entities;

import java.io.Serializable;


import javax.persistence.Embeddable;

@Embeddable
public class QuotationPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QuotationPK() {
		super();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Quotation_id;
		result = prime * result + idAgent;
		result = prime * result + idClient;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuotationPK other = (QuotationPK) obj;
		if (Quotation_id != other.Quotation_id)
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (idClient != other.idClient)
			return false;
		return true;
	}


	private int idClient;
	
	private int idAgent;
	
	private int  Quotation_id;

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	public int getQuotation_id() {
		return Quotation_id;
	}

	public void setQuotation_id(int quotation_id) {
		Quotation_id = quotation_id;
	}

	
	
}
