package tn.esprit.microinsurance.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Justificatory")



public class Justificatory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "JUSTIFICATORY_ID")
	int  Justificatory_Id;
	
    
    @Column(name = "file")
	private String file;


	public int getJustificatory_Id() {
		return Justificatory_Id;
	}


	public void setJustificatory_Id(int justificatory_Id) {
		Justificatory_Id = justificatory_Id;
	}


	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}
	
    
    
}
