package tn.esprit.microinsurance.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;



@Entity
public class LifeContract extends Contract {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LifeContract() {
super();
	}
	@Column(name = "INITIAL_AMOUNT")
	float Initial_Amount;

	@Enumerated(EnumType.STRING)
	@Column(name = "Amount_Mode")
	private ModeType modeType;
	
	@Enumerated(EnumType.STRING)
	private Type_life type_life;
	
	public float getInitial_Amount() {
		return Initial_Amount;
	}
	public void setInitial_Amount(float initial_Amount) {
		Initial_Amount = initial_Amount;
	}
	public ModeType getModeType() {
		return modeType;
	}
	public void setModeType(ModeType modeType) {
		this.modeType = modeType;
	}
	public Type_life getType_life() {
		return type_life;
	}
	public void setType_life(Type_life type_life) {
		this.type_life = type_life;
	}
	public enum Type_life{pension,Death}
	public enum ModeType{Mensuel,trimestriel,Anuelle }
}
