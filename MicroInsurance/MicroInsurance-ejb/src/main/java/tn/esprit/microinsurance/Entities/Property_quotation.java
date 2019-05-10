package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value="Property")

public class Property_quotation  extends Quotation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Property_quotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property_quotation(int id, String nom, String prenom, int age, int phone_Number, String mail,
			String maritalStatus, String occupation, float income, String address, QuotationMode mode, int codePostale,
			Date quotationBegining, Date quotationEnd, float amount, int score, Status status, Product product) {
		super(id, nom, prenom, age, phone_Number, mail, maritalStatus, occupation, income, address, mode, codePostale,
				quotationBegining, quotationEnd, amount, score, status, product);
		// TODO Auto-generated constructor stub
	}
	public Property_quotation(int id, String nom, String prenom, int age, int phone_Number, String mail,
			String maritalStatus, String occupation, float income, String address, QuotationMode mode, int codePostale,
			Date quotationBegining, Date quotationEnd, float amount, int score, Status status, Product product,
			float property_value, Lodger_owner propertyStatus, int numberOfInsuredPieces) {
		super(id, nom, prenom, age, phone_Number, mail, maritalStatus, occupation, income, address, mode, codePostale,
				quotationBegining, quotationEnd, amount, score, status, product);
		this.property_value = property_value;
		this.propertyStatus = propertyStatus;
		this.numberOfInsuredPieces = numberOfInsuredPieces;
	}
	//public enum Property_type{Workshop,house,other}
	private float property_value;
	
	@Enumerated(EnumType.STRING)
	private Lodger_owner propertyStatus;
	
	/*@Enumerated(EnumType.STRING)
	private Property_Type type;*/
	
	public enum Lodger_owner {Lodger,Owner}
	public enum PropertyType{Main,Secondary,Investment_good}
	private int numberOfInsuredPieces ;
	public float getProperty_value() {
		return property_value;
	}
	public void setProperty_value(float property_value) {
		this.property_value = property_value;
	}
	public Lodger_owner getPropertyMode() {
		return propertyStatus;
	}
	public void setPropertyMode(Lodger_owner propertyStatus) {
		this.propertyStatus= propertyStatus;
	}
	/*public PropertyType getType() {
		return type;
	}
	public void setType(PropertyType type) {
		this.type = type;
	}*/
	public int getNumberOfInsuredPieces() {
		return numberOfInsuredPieces;
	}
	public void setNumberOfInsuredPieces(int numberOfInsuredPieces) {
		this.numberOfInsuredPieces = numberOfInsuredPieces;
	}
	
	
	
	

}
