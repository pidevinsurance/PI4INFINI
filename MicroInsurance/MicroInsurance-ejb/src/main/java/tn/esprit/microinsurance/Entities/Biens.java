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
@Table(name="Biens")
public class Biens implements Serializable{
private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="id")
	private int id; 
	
	@Column(name="contractNumber")
	private String contractNumber; 
	
	@Column(name="property")
	private String property; 
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="initialAmount")
	private int initialAmount;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "beginDate")
	private Date beginDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "endDate")
	private Date endDate;
	
	@Column(name="description")
	private String description;

	public Biens() {}

	public Biens(String contractNumber, String property, int quantity, int initialAmount, Date beginDate, Date endDate,
			String description) {
		super();
		this.contractNumber = contractNumber;
		this.property = property;
		this.quantity = quantity;
		this.initialAmount = initialAmount;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.description = description;
	}

	public Biens(int id, String contractNumber, String property, int quantity, int initialAmount, Date beginDate,
			Date endDate, String description) {
		super();
		this.id = id;
		this.contractNumber = contractNumber;
		this.property = property;
		this.quantity = quantity;
		this.initialAmount = initialAmount;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.description = description;
	}
	
	/*public Biens(int id, String contractNumber, String property, int quantity,String description, int initialAmount, Date beginDate,
			Date endDate) {
		super();
		this.id = id;
		this.contractNumber = contractNumber;
		this.property = property;
		this.quantity = quantity;
		this.description = description;
		this.initialAmount = initialAmount;
		this.beginDate = beginDate;
		this.endDate = endDate;
		
	}*/

	/*public Biens(int id2, String contractNumber2, String property2, int quantity2, String description2,
			int initialAmount2, java.util.Date beginDate2, java.util.Date endDate2) {
		// TODO Auto-generated constructor stub
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(int initialAmount) {
		this.initialAmount = initialAmount;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
