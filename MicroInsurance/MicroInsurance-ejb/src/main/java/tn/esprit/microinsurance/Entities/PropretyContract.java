package tn.esprit.microinsurance.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
public class PropretyContract extends Contract {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PropretyContract() {
		super();
	}
	@Enumerated(EnumType.STRING)
	private Type_Prop Object_Status;
	
	@Enumerated(EnumType.STRING)
	private Type_Prop_Cov TypeBenefit;
	
	@Column(name="VALUE")
	private float total_value_of_contents ;

	public Type_Prop getObject_Status() {
		return Object_Status;
	}

	public void setObject_Status(Type_Prop object_Status) {
		Object_Status = object_Status;
	}

	public Type_Prop_Cov getTypeBenefit() {
		return TypeBenefit;
	}

	public void setTypeBenefit(Type_Prop_Cov typeBenefit) {
		TypeBenefit = typeBenefit;
	}

	public float getTotal_value_of_contents() {
		return total_value_of_contents;
	}

	public void setTotal_value_of_contents(float total_value_of_contents) {
		this.total_value_of_contents = total_value_of_contents;
	}

	
	
}
