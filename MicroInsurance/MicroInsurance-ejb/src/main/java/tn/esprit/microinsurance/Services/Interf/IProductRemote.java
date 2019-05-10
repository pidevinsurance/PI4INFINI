package tn.esprit.microinsurance.Services.Interf;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.microinsurance.Entities.Product;
import tn.esprit.microinsurance.Entities.Suggestion;

@Remote
public interface IProductRemote {
	public int addProduct(Product product);
	public void affectProductToMicroInsurance(int ProductId, int MicorInsuranceId);
	public List<Product> displayAllProducts();
	void removeProduct(int idProduct);
	void updateProduct(Product p);
	public Product displayProductById(Integer idProduct);
	List<Product> displayRecentProducts();
	public List<Object[]>  MostPurchasedProduct();
	double getCoutsinistres();
	double getPrimes_acquises();
	public  HashMap<Number, Number> GetProductByContract();
	BigInteger displayNbProducts();
	int addSuggestion(Suggestion sug);
	String getNameProductById(int ProductId);
	void update(Product product);
	boolean findIfExist(int ProductId);
	List<Object[]> MostView();
	

}
