package org.tnsif.HierarchicalInheritance;
// Child class2
public class SnowCone extends Android {
	
//    private data members
	private int version;
	
	
	// Getters and Setters
	public int getVersion() {
			return version;
		}
	
	
	
		public void setVersion(int version) {
			this.version = version;
		}

		
		
//		Generate parameterized constructor
		public SnowCone(String brand, String slotType, int version) {
			super(brand, slotType);
			this.version = version;
		}



		@Override
		public String toString() {
			return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
		}
		
		
		
		

}
