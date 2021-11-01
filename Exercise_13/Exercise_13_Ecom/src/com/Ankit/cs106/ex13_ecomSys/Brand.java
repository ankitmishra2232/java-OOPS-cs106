package com.Ankit.cs106.ex13_ecomSys;

public class Brand {
	private String name;
	private String originCountry;
	
	
	
	public Brand() {
		super();
	}



	public Brand(String name, String originCountry) {
		super();
		this.name = name;
		this.originCountry = originCountry;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getOriginCountry() {
		return originCountry;
	}



	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	
	

}
