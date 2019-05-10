package tn.esprit.microinsurance.Services.Impl;



import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.microinsurance.Entities.MicroInsurance;
import tn.esprit.microinsurance.Entities.Product;
import tn.esprit.microinsurance.Entities.Suggestion;
import tn.esprit.microinsurance.Services.Interf.IProductRemote;





@LocalBean
@Stateless
public class ProductServiceImpl implements IProductRemote {

	
	/**
	 * 
	 */

	@PersistenceContext(unitName = "Microinsurance-ejb")
	EntityManager em;
	
	public ProductServiceImpl(){
		super();
	}

	@Override
	public int addProduct(Product product) { 
		
		em.persist(product);
		return (product.getProductId());
	}

	@Override
	public void affectProductToMicroInsurance(int ProductId, int MicorInsuranceId) {
		
		MicroInsurance MicroInsuranceManagedEntity = em.find(MicroInsurance.class, MicorInsuranceId);
		Product ProductManagedEntity = em.find(Product.class,  ProductId);
		 MicroInsuranceManagedEntity.getProducts().add(ProductManagedEntity);
		 
	}
	@Override
	public void removeProduct(int idProduct) {
		Product p=em.find(Product.class, idProduct);
		em.remove(p);
		
	}
	@Override
	public void updateProduct(Product p) {
		em.merge(p);
		
	}
	
	
	@Override
	public List<Product> displayAllProducts() {
		List<Product> emp = em.createQuery("Select p from Product p ", Product.class).getResultList();
		return emp;
	}

	@Override
	public Product displayProductById(Integer ProductId) {
		TypedQuery<Product> query = 
				em.createQuery("select p from Product p WHERE p.ProductId=:ProductId", Product.class); 
				query.setParameter("ProductId", ProductId); 
				
				Product product = null; 
				try {
					product= query.getSingleResult(); 
				}
				catch (Exception e) {
					System.out.println("Erreur : " + e);
				}
				return product;
	}
	@Override
	public List<Product> displayRecentProducts() {
		List<Product> emp = em.createQuery("Select p from Product p ORDER BY p. DateCreation DESC ", Product.class).getResultList();
		return emp;
	}
	
	@Override
	public List<Object[]>  MostPurchasedProduct() {
		// TODO Auto-generated method stub
		javax.persistence.Query query = em.createNativeQuery("SELECT COUNT(*) AS nb ,`Label` as Nom FROM `t_contracts` c INNER JOIN `t_product` p ON c.`product_PRODUCT_ID`= p.`PRODUCT_ID` GROUP BY c.`product_PRODUCT_ID`  order by nb DESC");
		
		return query.getResultList();
	}
	@Override
	public double getCoutsinistres()
	{
	javax.persistence.Query query = em.createNativeQuery("SELECT SUM(`SINISTER_INDEMNITY`) as couts_sinistres from t_sinister");
		
		return (double) query.getSingleResult();
		
	}
	@Override
	public double getPrimes_acquises()
	{
	javax.persistence.Query query = em.createNativeQuery("	SELECT SUM(`value`) as primes from premium");
		
		return (double) query.getSingleResult();
		
	}
	
	@Override
	public HashMap<Number, Number> GetProductByContract()
	{
		HashMap<Number, Number>  map = new  HashMap<Number, Number>();
		javax.persistence.Query query = em.createNativeQuery("SELECT COUNT(*) AS nb ,`PRODUCT_ID` as idProduit FROM `t_contracts` c INNER JOIN `t_product` p ON c.`product_PRODUCT_ID`= p.`PRODUCT_ID` GROUP BY c.`product_PRODUCT_ID` order by nb DESC");

	    List<Object[]> list = query.getResultList();

	    for (Object[] result : list) {
	        map.put((Number)result[0], (Number)result[1]);
	    }

	    return map;
	}
	@Override
	public BigInteger displayNbProducts() {
		javax.persistence.Query query = em.createNativeQuery("SELECT COUNt(*) FROM `t_product`");
		return (BigInteger) query.getSingleResult();
	}
	
	@Override
	public int addSuggestion(Suggestion sug) { 
		
		em.persist(sug);
		return (sug.getSuggestionId());
	}
	@Override
	public String getNameProductById(int ProductId) {
		Product p = em.find(Product.class, ProductId);
		return p.getLabel().name();
		}
	
	@Override
	public void update(Product product) {
		System.out.println("In updateProduct: ");
		Product p = em.find(Product.class,product.getProductId());
		p.setNbreVue(product.getNbreVue());
		System.out.println("Out of update : ");
	}
	@Override
	public boolean findIfExist(int ProductId){
		
		List<Product> products= em.createQuery("from Product where  ProductId=:ProductId", Product.class).setParameter( "ProductId", ProductId) .getResultList();
		
		return products.isEmpty();
	}
	
	@Override
	public List<Object[]>  MostView() {
		// TODO Auto-generated method stub
		javax.persistence.Query query = em.createNativeQuery("SELECT `nbreVue` AS nb ,`Label` as Nom FROM `t_product` p GROUP BY p.`Label`");
		return query.getResultList();
	}
	
}
