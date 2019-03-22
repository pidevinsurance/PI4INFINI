package tn.esprit.microinsurance.services.Interfaces;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Indemnity_Request;

@Remote
public interface IIndemnityRequestServiceRemote {
	
	public void addIndemnityRequest(Indemnity_Request indReq);

}
