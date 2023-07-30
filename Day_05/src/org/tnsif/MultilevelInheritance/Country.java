package org.tnsif.MultilevelInheritance;

public class Country {
	
	// Private Data members
	private String natinality;
	private int CountryCode;
	
	// Getters and Setters 
	public String getNatinality() {
		return natinality;
	}
	public void setNatinality(String natinality) {
		this.natinality = natinality;
	}
	public int getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(int countryCode) {
		CountryCode = countryCode;
	}
	
	
//	default constructor (generate constructor from superclass)
	public Country() {
		System.out.println("Country-Parent Class");
	}
	
	// Parameterized Constructor (generate constructor using fields)
	public Country(String natinality, int countryCode) {
		super();
		this.natinality = natinality;
		this.CountryCode = countryCode;
	}
	
	
	// (path : Generate toString --> inherited class --> toString) 
	@Override 
	public String toString() {
		return "Country [natinality=" + natinality + ", CountryCode=" + CountryCode + "]";
	}
	
	
	
	

}
