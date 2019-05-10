package ManagedBean;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.microinsurance.Entities.Finance;
import tn.esprit.microinsurance.services.Impl.FinanceService;



@ManagedBean(name = "FinanceBean") 
@SessionScoped

public class FinanceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id_Finance;
	private String type;
	private float turnover;
	private String source;
	private Date date;
	private List<Finance> Finances; 
	private List<Finance> Finances2;
	private List<Finance> liabilities;
	private List<Finance> Expenses;
	private List<Finance> Revenue;
	private List<Finance> Drawing;

	



	@EJB
	FinanceService FinanceService;

	public FinanceBean() {}
 
	public void addFinance(Finance f)
	{
		
		FinanceService.addFinance(f); 
	}

	public void removefFinance(int FinanceId)
	{
		FinanceService.removeFinance(FinanceId); 
	}
	
	public void displayFinance(Finance empl) 
	{
	/*	this.setPrenom(empl.getPrenom());
		this.setNom(empl.getNom());
		this.setIsActif(empl.getIsActif()); 
		this.setEmail(empl.getEmail());
		this.setRole(empl.getRole());
		this.setEmail(empl.getEmail());
		this.setPassword(empl.getPassword());
		this.setFinanceIdToBeUpdated(empl.getId());*/
	}
	
	public void updateFinance()
	{
		/*FinanceService.updateFinance(new Finance(FinanceIdToBeUpdated, nom, prenom, email, password, isActif, role));*/
	}
	
	public List<Finance> getFinances() {
		Finances = FinanceService.findAllFinances(); 
		return Finances;
	} 
	
	public List<Finance> getFinances2() {
		List<Finance> rm = new ArrayList<>();
		Finances2 = FinanceService.findAllFinances();
		int i=0;
		for (Finance e:Finances2)
		{
			i++;
			if (!e.getType().equals("Assets") && e!=null)
			{
				//Finances2.remove(i);
				rm.add(e);
			i--;
			}
		}
		Finances2.removeAll(rm);

		return Finances2;
	} 
	public List<Finance> getliabilities() {
		List<Finance> rm = new ArrayList<>();

		liabilities = FinanceService.findAllFinances();
		int i=0;
		for (Finance e:liabilities)
		{
			i++;
			if (!e.getType().equals("Liabilities") && e!=null)
			{
				//liabilities.remove(i);
				rm.add(e);

			i--;
			}
		}
		liabilities.removeAll(rm);

		return liabilities;
	} 
	public List<Finance> getExpenses() {
		List<Finance> rm = new ArrayList<>();

		Expenses = FinanceService.findAllFinances();
		int i=0;
		for (Finance e:Expenses)
		{
			i++;
			if (!e.getType().equals("Expenses")&& e!=null)
			{
				//Expenses.remove(i);
				rm.add(e);

			i--;
			}
		}
		Expenses.removeAll(rm);

		return Expenses;
	} 
	public List<Finance> getRevenue() {
		List<Finance> rm = new ArrayList<>();

		Revenue = FinanceService.findAllFinances();
		int i=0;
		for (Finance e:Revenue)
		{
			i++;
			if (!e.getType().equals("Revenue")&& e!=null)
			{
				//Revenue.remove(i);
				rm.add(e);

			i--;
			}
		}
		Revenue.removeAll(rm);

		return Revenue;
	} 
	public List<Finance> getDrawing() {
		List<Finance> rm = new ArrayList<>();

		Drawing = FinanceService.findAllFinances();
		int i=0;
		for (Finance e:Drawing)
		{
			i++;
			if (!e.getType().equals("Drawing")&& e!=null)
			{
				//Drawing.remove(i);
				rm.add(e);

			i--;
			}
		}
		Drawing.removeAll(rm);

		return Drawing;
	}
	public float getEquity() {
		Finances = FinanceService.findAllFinances();
		float i=0;
		for (Finance e:Finances)
		{
				if (e.getType().equals("Drawing") || e.getType().equals("Assets") || e.getType().equals("Expenses"))
			{
					i=i+e.getTurnover();
			}
				else 
					i=i-e.getTurnover();
		}
		return i;
	}
	
	public float getBalance() {
		Finances = FinanceService.findAllFinances();
		float i=0;
		for (Finance e:Finances)
		{
				if (e.getType().equals("Drawing") || e.getType().equals("Assets") || e.getType().equals("Expenses"))
			{
					i=i+e.getTurnover();
			}

		}
		return i;
	}
	
	public void setFinances(List<Finance> Finances) {
		this.Finances = Finances;
	}
	
	public int getId_Finance() {
		return id_Finance;
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
}
