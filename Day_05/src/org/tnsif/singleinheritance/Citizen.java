package org.tnsif.singleinheritance;
// Base class
public class Citizen {
	
	// Private data members
	private String city;
	private int pincode;
	private String area;
	private long adharNo;
	
	// Getters and Setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPicode() {
		return pincode;
	}
	public void setPicode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adharNo=" + adharNo + "]";
	}
	
	// Default Constructor
	public Citizen() {
		System.out.println("Citizen-Parent Class");
	}
	
	// Parameterized Constructor --> (generate constructor by using fields)
	public Citizen(String city, int pincode, String area, long adharNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adharNo = adharNo;
	}
	
	
	
	
	
	

}
