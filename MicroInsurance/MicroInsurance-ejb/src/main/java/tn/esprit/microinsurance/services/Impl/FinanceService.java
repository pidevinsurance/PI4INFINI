package tn.esprit.microinsurance.services.Impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.microinsurance.Entities.Finance;
import tn.esprit.microinsurance.services.Interf.FinanceServiceRemote;

/**
 * Session Bean implementation class FinanceService
 */
@Stateless
@LocalBean
public class FinanceService implements FinanceServiceRemote{

	/**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public FinanceService() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public int addFinance(Finance u) {
		em.persist(u);
		return u.getId_finance();
	}

	@Override
	public void removeFinance(int id) {
		em.remove(em.find(Finance.class, id));
		
	}

	@Override
	public void updateFinance(Finance financeNewValues, int id) {
		Finance f = em.find(Finance.class, id);
		f.setDate(financeNewValues.getDate());
		f.setSource(financeNewValues.getSource());
		f.setTurnover(financeNewValues.getTurnover());
		f.setType(financeNewValues.getType());	
	}

	@Override
	public Finance findFinanceById(int id) {
		Finance f = em.find(Finance.class, id);
		return f;		
	}
	

	@Override
	public List<Finance> findAllFinances() {
		List<Finance> u = em.createQuery("from Finance", Finance.class).getResultList();
		return u;
	}

	
	//NoResultException

}
