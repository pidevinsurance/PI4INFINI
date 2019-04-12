package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_SUGGESTION")
public class Suggestion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getSuggestionId() {
		return SuggestionId;
	}

	public void setSuggestionId(int suggestionId) {
		SuggestionId = suggestionId;
	}

	public String getSugName() {
		return SugName;
	}

	public void setSugName(String sugName) {
		SugName = sugName;
	}

	public String getSugDescripition() {
		return SugDescripition;
	}

	public void setSugDescripition(String sugDescripition) {
		SugDescripition = sugDescripition;
	}

	public double getPercentQuotation() {
		return PercentQuotation;
	}

	public void setPercentQuotation(double percentQuotation) {
		PercentQuotation = percentQuotation;
	}

	public Date getDateCreation() {
		return DateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}

	public Suggestion() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name = "Suggestion_ID")
	private int SuggestionId;

	@Column(name = "Name")
	private String SugName;

	@Column(name = "DESCRIPTION")
	private String SugDescripition; 
	
	@Column(name = "Percent")
	private double PercentQuotation; 
	
	@Temporal(TemporalType.DATE)
	private Date DateCreation ;
	
	
 
}
