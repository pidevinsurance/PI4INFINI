package tn.esprit.microinsurance.services.Interf;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Finance;


@Remote
public interface FinanceServiceRemote {
	public int addFinance(Finance f);
	public void removeFinance(int id);
	public void updateFinance(Finance FinanceNewValues, int id);
	public Finance findFinanceById(int id);
	public List<Finance> findAllFinances();

}
