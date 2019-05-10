package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: finance
 *
 */
@Entity

public class Finance implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_finance;
	private String type;
	private float turnover;
	private String source;
	private Date date;
	private static final long serialVersionUID = 1L;

	public int getId_finance() {
		return id_finance;
	}
	public void setId_finance(int id_finance) {
		this.id_finance = id_finance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
