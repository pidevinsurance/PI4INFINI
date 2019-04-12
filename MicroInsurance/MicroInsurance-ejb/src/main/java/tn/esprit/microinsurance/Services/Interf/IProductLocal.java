package tn.esprit.microinsurance.Services.Interf;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.microinsurance.Entities.Product;
import tn.esprit.microinsurance.Entities.Suggestion;

@Local
public interface IProductLocal {

	public int addProduct(Product product);
	public void affectProductToMicroInsurance(int ProductId, int MicorInsuranceId);
	public void removeProduct(int idProduct);
	List<Product> displayAllProducts();
	void updateProduct(Product p);
	public Product displayProductById(Integer idProduct);
	public List<Product> displayRecentProducts();
	public List<Object[]>  MostPurchasedProduct();
	double getCoutsinistres();
	double getPrimes_acquises();
	public  HashMap<Number, Number> GetProductByContract();
	int addSuggestion(Suggestion sug);
}
