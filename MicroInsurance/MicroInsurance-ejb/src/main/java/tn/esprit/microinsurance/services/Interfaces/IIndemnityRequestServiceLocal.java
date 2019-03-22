package tn.esprit.microinsurance.services.Interfaces;

import javax.ejb.Local;


import tn.esprit.microinsurance.Entities.Indemnity_Request;

@Local
public interface IIndemnityRequestServiceLocal {
	
	public void addIndemnityRequest(Indemnity_Request indReq);

}
