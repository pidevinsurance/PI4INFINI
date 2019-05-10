package tn.esprit.microinsurance.services.Interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.IndemnityRequestPk;
import tn.esprit.microinsurance.Entities.Indemnity_Request;
import tn.esprit.microinsurance.Entities.TechnicalAgent;

@Local
public interface IIndemnityRequestServiceLocal {
	
	public void addIndemnityRequest(Indemnity_Request indReq);
	public List<Indemnity_Request> getAllIndemnityRequest();
	public Indemnity_Request getIndemnityRequestById(IndemnityRequestPk indId);
	public void UpdateIndemnityRequestTechnicalAgentIDById(IndemnityRequestPk IndemnityRequestId , TechnicalAgent TechnicalAhent);
	public void UpdateIndemnityRequestValidationDById(IndemnityRequestPk IndemnityRequestId , boolean val);

}
