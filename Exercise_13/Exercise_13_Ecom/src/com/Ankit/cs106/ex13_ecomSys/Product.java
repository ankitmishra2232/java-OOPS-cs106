package com.Ankit.cs106.ex13_ecomSys;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private Brand brand;
	private Double price;
	private String name;
	private List<Category> categories;
	
	public Product() {
		this.name = "";
		this.price=0.0;
		this.categories = new ArrayList<>();
		this.brand=new Brand();
	}

	public Product(Brand brand, Double price, String name, List<Category> categories) {
		super();
		this.brand = brand;
		this.price = price;
		this.name = name;
		this.categories = categories;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	

}
