package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;

import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "T_QUOTATION")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="discriminator",
    discriminatorType=DiscriminatorType.STRING
    )
public class Quotation implements Serializable{



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUOTATION_NUMBER")
	private int id;
	
	@Column(name = "NAME")
	private String Nom;
	
	@Column(name = "SURNAME")
	private String Prenom;
	
	@Column(name = "AGE")
	private int Age;
	
	@Column(name = "PHONE_NB")
	private int Phone_Number;
	
	
	@Column(name = "MAIL")
	private String mail ;
	
	@Column(name = "MARITALSTATUS")
	private String MaritalStatus;
	
	@Column(name = "OCCUPATION")
	private String  Occupation;
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Column(name = "INCOME")
	private float Income;
	
	@Column (name="ADDRESS")
	private String address;

		
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Quotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quotation(int id, String nom, String prenom, int age, int phone_Number, String mail, String maritalStatus,
			String occupation, float income, String address, QuotationMode mode, int codePostale,
			Date quotationBegining, Date quotationEnd, float amount, int score, Status status, Product product) {
		super();
		this.id = id;
		Nom = nom;
		Prenom = prenom;
		Age = age;
		Phone_Number = phone_Number;
		this.mail = mail;
		MaritalStatus = maritalStatus;
		Occupation = occupation;
		Income = income;
		this.address = address;
		Mode = mode;
		CodePostale = codePostale;
		QuotationBegining = quotationBegining;
		QuotationEnd = quotationEnd;
		this.amount = amount;
		Score = score;
		this.status = status;
		this.product = product;
	}

	@ManyToOne( cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
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

	public enum Status {
		Treated,Untreated
	}

}
