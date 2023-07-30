// Child class 1
package org.tnsif.HierarchicalInheritance;

public class Tiramiso extends Android {
	
//	private data members
	private int version;
	
	
	// Getters and Setters
	public int getVersion() {
			return version;
		}
	public void setVersion(int version) {
			this.version = version;
		}
		

//	Parameterized Constructor
	public Tiramiso(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version = version;
	}
	
	// ToString method
	@Override
	public String toString() {
		return "Tiramiso [version=" + version + ", toString()=" + super.toString() + "]";
	}

	
	


	
	

}
