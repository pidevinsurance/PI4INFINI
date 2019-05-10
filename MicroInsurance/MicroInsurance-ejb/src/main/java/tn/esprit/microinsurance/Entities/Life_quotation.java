package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value="Life")

public class Life_quotation extends Quotation implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	
	public Life_quotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Life_quotation(int id, String nom, String prenom, int age, int phone_Number, String mail, String maritalStatus,
			String occupation, float income, String address, QuotationMode mode, int codePostale,
			Date quotationBegining, Date quotationEnd, float amount, int score, Status status, Product product,
			String initial_amount, LifeQuotationMode payment_mode) {
		super(id, nom, prenom, age, phone_Number, mail, maritalStatus, occupation, income, address, mode, codePostale,
				quotationBegining, quotationEnd, amount, score, status, product);
		this.initial_amount = initial_amount;
		this.payment_mode = payment_mode;
	}
	/*@Enumerated(EnumType.STRING)
	private QuotationType type;*/
	
	@Column (name="Initial_amount")
	private String initial_amount;
	
	@Enumerated(EnumType.STRING)
	private LifeQuotationMode payment_mode;
	
	//public enum QuotationType{Pension,Death}
	public enum LifeQuotationMode{mensuel,trimestriel,semestriel,annuel}
	/*public QuotationType getType() {
		return type;
	}
	public void setType(QuotationType type) {
		this.type = type;
	}*/
	public String getInitial_amount() {
		return initial_amount;
	}
	public void setInitial_amount(String initial_amount) {
		this.initial_amount = initial_amount;
	}
	public LifeQuotationMode getLifeMode() {
		return payment_mode;
	}
	public void setLifeMode(LifeQuotationMode payment_mode) {
		this.payment_mode= payment_mode;
	}
	
	
	

}
