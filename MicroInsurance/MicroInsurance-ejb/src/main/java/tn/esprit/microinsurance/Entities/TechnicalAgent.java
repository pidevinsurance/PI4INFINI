package tn.esprit.microinsurance.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "T_TECHNICALAGENT")
public class TechnicalAgent implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TECHNICALAGENT_ID")
	private int id;
	@Column(name = "TECHNICAL_USERNAME")
	private String Username;
	@Column(name = "TECHNICAL_PASSWORD")
	private String password;
	@Column(name = "TECHNICAL_ADRESS")
	private String Adress;
	@Column(name = "TECHNICAL_PHONENB")
	private String Phone_Number;
	
    @Column(name = "TECHNICAL_CIN")
	private String Technical_CIN;
    
    @Column(name = "TECHNICAL_STATUS")
	private String Status;
    
	@OneToMany(mappedBy="technical_agent")
	private List<Sinister_Report> reports;
    
	@OneToMany(mappedBy="technical_agent")
	private List<Appointment> appointments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}

	public String getTechnical_CIN() {
		return Technical_CIN;
	}

	public void setTechnical_CIN(String technical_CIN) {
		Technical_CIN = technical_CIN;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
}
