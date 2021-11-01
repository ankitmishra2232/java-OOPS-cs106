package com.Ankit.cs106.ex13_ecomSys;

import java.util.List;

public class EcomSystem {
	private String currency;
	private List<Brand> listOfBrands;
	private List<Category> listofCategories;
	private List<Product> listofProducts;
	
	
	public EcomSystem(String currency, List<Brand> listOfBrands, List<Category> listofCategories,
			List<Product> listofProducts) {
		super();
		this.currency = currency;
		this.listOfBrands = listOfBrands;
		this.listofCategories = listofCategories;
		this.listofProducts = listofProducts;
	}
	
	//to use this website we need some methods here
		public void searchProduct(Boolean isBrand,List<Brand> searchBrand,Boolean category, List<Category> searchCategories) {

			if(searchBrand.addAll(listOfBrands)) {
				isBrand=isBrand.TRUE;
				category=category.FALSE;
			}
			
			if(searchCategories.addAll(listofCategories)) {
				category=category.TRUE;
				isBrand=isBrand.FALSE;
			}
			
			if(searchBrand.addAll(listOfBrands)&&searchCategories.addAll(getListofCategories())) {
				category=category.TRUE;
				isBrand=isBrand.TRUE;
			}
			
		}
	
	public void searchCategory(List<Category> searchCategories) {
		
	}
	public void searchBrand(List<Brand> searchBrand) {
		
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public List<Brand> getListOfBrands() {
		return listOfBrands;
	}


	public void setListOfBrands(List<Brand> listOfBrands) {
		this.listOfBrands = listOfBrands;
	}


	public List<Category> getListofCategories() {
		return listofCategories;
	}


	public void setListofCategories(List<Category> listofCategories) {
		this.listofCategories = listofCategories;
	}


	public List<Product> getListofProducts() {
		return listofProducts;
	}


	public void setListofProducts(List<Product> listofProducts) {
		this.listofProducts = listofProducts;
	}
	

}
