package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_Product")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private int ProductId;
	
	@Enumerated(EnumType.STRING)
	private ProductType  Label;

	@Column(name = "PRODUCT_DESCRIPTION")
	private String Descripition; 
	
	@Enumerated(EnumType.STRING)
	private TypesMicroInsurance Type;
	
	@Column(name = "PRODUCT_File")
	private String file;
	
	@Column(name = "PRODUCT_IMG")
	private String image;
	
	@Temporal(TemporalType.DATE)
	private Date DateCreation ;
	
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	public List<Quotation> getQuotations() {
		return quotations;
	}
	public void setQuotations(List<Quotation> quotations) {
		this.quotations = quotations;
	}

	//@OneToMany(mappedBy="product", cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	//private List<Contract> contracts = new ArrayList<>();
	
	@OneToMany(mappedBy="product", cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Quotation> quotations = new ArrayList<>();
	

	@ManyToOne
	private MicroInsurance microinsurance;
	
	
	
	
	
	public Product( String descripition, ProductType label,TypesMicroInsurance type, String file, String image ) {
		super();
		Label = label;
		Descripition = descripition;
		Type = type;
		this.file = file;
		this.image = image;
	
		
	}
	public Product(){}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getDescripition() {
		return Descripition;
	}

	public void setDescripition(String descripition) {
		Descripition = descripition;
	}

	public ProductType  getLabel() {
		return Label;
	}

	public void setLabel(ProductType  label) {
		Label = label;
	}
	public TypesMicroInsurance getType() {
		return Type;
	}

	public void setType(TypesMicroInsurance type) {
		Type = type;
	}

	public String getFile() {
		return file;
	}

	public Product(int productId, ProductType  label, String descripition, TypesMicroInsurance type, String file,
			String image, List<Quotation> quotations, MicroInsurance microinsurance) {
		super();
		ProductId = productId;
		Label = label;
		Descripition = descripition;
		Type = type;
		this.file = file;
		this.image = image;

		this.quotations = quotations;
		this.microinsurance = microinsurance;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public MicroInsurance getMicroinsurance() {
		return microinsurance;
	}

	public void setMicroinsurance(MicroInsurance microinsurance) {
		this.microinsurance = microinsurance;
	}
	

}
