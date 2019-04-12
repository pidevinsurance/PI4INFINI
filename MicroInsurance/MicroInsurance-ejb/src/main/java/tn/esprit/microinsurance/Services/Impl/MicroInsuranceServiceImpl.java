package tn.esprit.microinsurance.Services.Impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.microinsurance.Entities.MicroInsurance;
import tn.esprit.microinsurance.Entities.User;
import tn.esprit.microinsurance.Services.Interf.IMicroInsuranceLocal;
import tn.esprit.microinsurance.Services.Interf.IMicroInsuranceRemote;

@Stateless
public class MicroInsuranceServiceImpl implements IMicroInsuranceLocal , IMicroInsuranceRemote {

	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;
	
	public MicroInsuranceServiceImpl() {
		super();
	}

	@Override
	public int addMicroInsurance(MicroInsurance microInsurance) {
		
		em.persist(microInsurance);
		return (microInsurance.getId());
	}

	@Override
	public int updateMicroInsurance(MicroInsurance microInsurance) {
		
		em.merge(microInsurance);
		return microInsurance.getId();
	}

	@Override
	public void removeMicroInsurance(int MicroInsuranceID) {
		MicroInsurance microInsurance= em.find(MicroInsurance.class, MicroInsuranceID);
		em.remove(microInsurance);
		
	}

	@Override
	public MicroInsurance getMicroInsuranceById(int MicroInsuranceID) {
		return em.find(MicroInsurance.class, MicroInsuranceID);
	}

	@Override
	public List<Object[]>  countClients() {
		// TODO Auto-generated method stub
		javax.persistence.Query query = em.createNativeQuery("select YEAR(`USER_JOINDATE`), count(*) as newusers from t_user group by YEAR(`USER_JOINDATE`)");
		
		return query.getResultList();
	}

	/*@Override
	public List<Integer>  countClients() {
		//javax.persistence.Query query = em.createNativeQuery("select YEAR(`USER_JOINDATE`), count(*) as newusers from t_user group by YEAR(`USER_JOINDATE`)");
		javax.persistence.Query query = em.createQuery("SELECT count(*) FROM User u WHERE EXTRACT(YEAR ,d.JoinDate)=2019", User.class);

		List<Integer> values = query.getResultList();
		return  values;
	}
*/

	



}
