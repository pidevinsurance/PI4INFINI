package tn.esprit.microinsurance.services.Interf;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Indemnity_Request;
import tn.esprit.microinsurance.Entities.InsuranceRequest;
import tn.esprit.microinsurance.Entities.Justificatory;
import tn.esprit.microinsurance.Entities.Quotation;
import tn.esprit.microinsurance.Entities.User;

@Remote

public interface QuoteRemote {
	public void removeQuoteees(int id);
	public List<Quotation> findAllQuotations();
	public Quotation findQuotationById(int id);
	public void UpdateQuotationStatus(int id, Quotation.Status status);
	public List<Quotation> findTreatedQuotations () ;
	public List<Quotation> findUntreatedQuotations ();
	public void updateStatus(Quotation q) ;
	public void addUser(User user);
	public InsuranceRequest findRequestsByQuotation(int id); //quotationid
	public List<Justificatory>findJustificatisByRequest(int id); //indemnityid
	//public void removeQuote(Quotation q);
	void updateInsuranceRequest(InsuranceRequest ir);
	public List<Object[]> goodQuotation();
	public List<Object[]> badQuotation();
	public List<Object[]> DemandedProducts();


}
