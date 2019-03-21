package tn.esprit.microinsurance.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@Column(name = "PRODUCT_File")
	private String file;
	
	@Enumerated(EnumType.STRING)
	private TypesProduct Type;

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

	

}
