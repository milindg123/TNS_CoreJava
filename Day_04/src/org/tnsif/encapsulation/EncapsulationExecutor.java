//Program to Demonstrate on encapsulation
//Driver Class

package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		
		SBI s = new SBI();
		s.setAccType("Saving Account");
		s.setAccountNo(123456789);
		s.setAtmCardNo(354123);
		s.setPinNo(4356);
		
		// System.out.println("Account No. is : " + s.getAccountNO());
		
		
		// below line will call to toString() method
		
		System.out.println(s);

	}

}
