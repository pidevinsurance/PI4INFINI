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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "T_QUOTATION")
public class Quotation implements Serializable{



	public Quotation() {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUOTATION_NUMBER")
	private int id;
	
	@Column(name = "PROSPECT_NOM")
	private String Nom;
	
	@Column(name = "PROSPECT_PRENOM")
	private String Prenom;
	
	@Column(name = "PROSPECT_INCOME")
	private float Income;

	@Column(name = "PROSPECT_MARITALSTATUS")
	private String MaritalStatus;
	
	@Column(name = "PROSPECT_OCCUPATION")
	private String  Occupation;
	
	@Column(name = "PROSPECT_PHONENB")
	private int Phone_Number;
	
	@Column(name = "PROSPECT_AGE")
	private int Age;
	
	@Enumerated(EnumType.STRING)
	private QuotationMode Mode;
	
	@Column(name = "USER_CODEPOSTAL")
	private int CodePostale;
	
	@Temporal(TemporalType.DATE)
	private Date QuotationBegining ;

	@Temporal(TemporalType.DATE)
	private Date QuotationEnd ;

	@Column(name = "AMOUNT")
	private float amount ;

	@Column(name = "SCORE")
	private int Score ;
	
	@ManyToOne
	private Product product;
 
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public float getIncome() {
		return Income;
	}

	public void setIncome(float income) {
		Income = income;
	}

	public String getMaritalStatus() {
		return MaritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public int getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(int phone_Number) {
		Phone_Number = phone_Number;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public QuotationMode getMode() {
		return Mode;
	}

	public void setMode(QuotationMode mode) {
		Mode = mode;
	}

	public int getCodePostale() {
		return CodePostale;
	}

	public void setCodePostale(int codePostale) {
		CodePostale = codePostale;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	
	public Date getQuotationBegining() {
		return QuotationBegining;
	}

	public void setQuotationBegining(Date quotationBegining) {
		QuotationBegining = quotationBegining;
	}

	public Date getQuotationEnd() {
		return QuotationEnd;
	}

	public void setQuotationEnd(Date quotationEnd) {
		QuotationEnd = quotationEnd;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}


}
