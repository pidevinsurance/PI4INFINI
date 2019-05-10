package tn.esprit.microinsurance.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.esprit.microinsurance.Entities.Contract;
import tn.esprit.microinsurance.Entities.MicroInsurance;
import tn.esprit.microinsurance.Entities.Product;
import tn.esprit.microinsurance.Entities.ProductType;
import tn.esprit.microinsurance.Entities.Quotation;
import tn.esprit.microinsurance.Entities.TypesMicroInsurance;
import tn.esprit.microinsurance.Services.Impl.ProductServiceImpl;



@ManagedBean(name= "productBean")
@SessionScoped
public class ProductBean implements Serializable{

	
	
	@EJB
	ProductServiceImpl productService;
	private static final long serialVersionUID = 1L;
	private int ProductId;
	private ProductType  Label;
	private String Descripition; 
	private TypesMicroInsurance Type;
	private String file;
	private String image;
	private Date DateCreation ;
	private MicroInsurance microinsurance;
	private List<Contract> contracts;
	private List<Quotation>  quotations;
	private List<Product> produits;
	private Product selectedProduct;
	private Product produit;
	private List<Product> fav = new ArrayList<>();
	private int nbreVue;
    private int idM;




    public int getIdM() {
		return idM;
	}




	public void setIdM(int idM) {
		this.idM = idM;
	}




	public int getNbreVue() {
		return nbreVue;
	}




	public void setNbreVue(int nbreVue) {
		this.nbreVue = nbreVue;
	}




	public Boolean exist(int id)
    {
    if(	productService.getNameProductById(id)== produit.getLabel().name())
    {
    	return true;
    }
    else
    	return false;
    }




	public List<Product> getFav() {
		return fav;
	}


	public void setFav(List<Product> fav) {
		this.fav = fav;
	}


	public String ShowMore(int id)
	{
		String navigateTo = "null"; 
		produit = productService.displayProductById(id);
		System.out.println("brabi");
		
	     int nb= produit.getNbreVue()+1;

		if (produit!= null) {
			produit.setProductId(produit.getProductId());
			produit.setLabel(produit.getLabel());
			produit.setDescripition(produit.getDescripition());
			produit.setFile(produit.getFile());
			produit.setImage(produit.getImage());
			produit.setDateCreation(produit.getDateCreation());
			produit.setType(produit.getType());
			produit.setNbreVue(nb);
			produit.setMicroinsurance(microinsurance);
			productService.update(produit);
			navigateTo = "/pages/moreProduct?faces-redirect=true";
		}
		else 
		{
			FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("No Product selected"));
		}
		System.out.println("NbrClick///"+nb);	
		return navigateTo;
	} 
	
	
	public String Addfav(int id)
	{
		String navigateTo = "null"; 
		produit = productService.displayProductById(id);
		System.out.println("brabi");
		int nb= produit.getNbreVue()+1;

		if (produit!= null) {
			produit.setProductId(produit.getProductId());
			produit.setLabel(produit.getLabel());
			produit.setDescripition(produit.getDescripition());
			produit.setFile(produit.getFile());
			produit.setImage(produit.getImage());
			produit.setDateCreation(produit.getDateCreation());
			produit.setType(produit.getType());
			produit.setNbreVue(nb);
			produit.setMicroinsurance(microinsurance);
			productService.update(produit);
			if(productService.findIfExist(produit.getProductId())==false)
			{
			fav.add(produit);
			}
			navigateTo = "/pages/favoris?faces-redirect=true";
		}
	System.out.println("nbre click"+nb);
		return navigateTo;
	} 
	
	
	
	public Product getProduit() {
		return produit;
	}



	public void setProduit(Product produit) {
		this.produit = produit;
	}



	public Product getSelectedProduct() {
		return selectedProduct;
	}



	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}



	public ProductServiceImpl getProductService() {
		return productService;
	}



	public void setProductService(ProductServiceImpl productService) {
		this.productService = productService;
	}



	public int getProductId() {
		return ProductId;
	}



	public void setProductId(int productId) {
		ProductId = productId;
	}



	public ProductType getLabel() {
		return Label;
	}



	public void setLabel(ProductType label) {
		Label = label;
	}



	public String getDescripition() {
		return Descripition;
	}



	public void setDescripition(String descripition) {
		Descripition = descripition;
	}



	public TypesMicroInsurance getType() {
		return Type;
	}



	public void setType(TypesMicroInsurance type) {
		Type = type;
	}



	public String getFile() {
		return file;
	}



	public void setFile(String file) {
		this.file = file;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public Date getDateCreation() {
		return DateCreation;
	}



	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}



	public MicroInsurance getMicroinsurance() {
		return microinsurance;
	}



	public void setMicroinsurance(MicroInsurance microinsurance) {
		this.microinsurance = microinsurance;
	}



	public List<Contract> getContracts() {
		return contracts;
	}



	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}



	public List<Quotation> getQuotations() {
		return quotations;
	}



	public void setQuotations(List<Quotation> quotations) {
		this.quotations = quotations;
	}






	public List<Product> getProduits() {
		produits = productService.displayAllProducts();
		
		return produits;
	}



	public void setProduits(List<Product> produits) {
		this.produits = produits;
	}



	public ProductBean(){}



	
	
	public void displayProduct(Product p) 
	{
		this.setLabel(p.getLabel());
		this.setDescripition(p.getDescripition());
		this.setFile(p.getFile());
		this.setImage(p.getImage());
		this.setDateCreation(p.getDateCreation());
		this.setType(p.getType());
	}



	public String delete(Product prd){
		this.fav.remove(prd);
		return "";



	}}
