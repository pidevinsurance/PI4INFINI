package tn.esprit.microinsurance.Entities;

import java.util.ArrayList;
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

@Entity
@Table(name = "T_Product")
public class Product {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private int ProductId;
	
	@Column(name = "PRODUCT_DESCRIPTION")
	private String Descripition;
	
	@Column(name = "PRODUCT_LABEL")
	private String Label;

	@Enumerated(EnumType.STRING)
	private TypesMicroInsurance Type;
	
	@Column(name = "PRODUCT_File")
	private String file;
	
	@OneToMany(mappedBy="product", cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Contract> contracts = new ArrayList<>();
	
	@OneToMany(mappedBy="product", cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Quotation> quotations = new ArrayList<>();
	

	@ManyToOne
	private MicroInsurance microinsurance;
	
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

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
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
