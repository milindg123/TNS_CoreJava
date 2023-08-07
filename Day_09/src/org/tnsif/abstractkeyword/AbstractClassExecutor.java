// Program to demonstrate on abstract keyword with method
// Uses of Abstract class -> To achieve the abstraction
package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		
//		We can't create the object for abstract class
//		Sandwich s = new Sandwich();
		
		CheeseCornSandwich s = new CheeseCornSandwich();
		s.prepare();
		s.showReceipe();

	}

}
