// Base Class
package org.tnsif.HierarchicalInheritance;

public class Android {
	
	// Private data members
	private String brand;
	private String slotType;
	
	// Getters and Setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	
	
	
	// Parameterized constructor
	public Android(String brand, String slotType) {
		super();
		this.brand = brand;
		this.slotType = slotType;
	}
	
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slotType=" + slotType + "]";
	}
	

	
	

}
