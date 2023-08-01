package org.tnsif.instanceofdemo;

class RBI
{
	protected String ifscCode="RBIS0NGPA01";
}

class SBI extends RBI {
	public SBI() {
		
		super.ifscCode = "RBIS0NGPA01";
		String ifscCode="SBIN00002161";
		System.out.println(ifscCode);
		
		/*If parent class and child class variable name is same,
		in such case use super.variablename to access that 
		variable of parent class inside the child class
		 */
		System.out.println(super.ifscCode);

	}
}

// PROGRAM TO DEMONSTRATE ON INSTANCE OF OPERATOR
public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s instanceof RBI);
		System.out.println(s instanceof SBI);
		

	}

}

/*
This keyword uses:
1. it can be used to refer instance variable of current class --> (Instance variable -->current class variable)
2. used to invoke 
*/
