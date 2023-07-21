// Program to Demonstrate on logical Operators
package org.tnsif.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		System.out.println((31!=7) && (3>=5)); // Logical && --> if both Statement true then Return TRUE otherwise False
		System.out.println((31!=7) || (3>=5)); // Logical || --> anyone True then Return TRUE otherwise false
		System.out.println(!((31!=7) && (3>=5)));// Logical !(not)

	}

}
