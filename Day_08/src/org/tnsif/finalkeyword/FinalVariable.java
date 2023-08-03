// Program to demonstrate on final keyword with variable
package org.tnsif.finalkeyword;

public class FinalVariable {
	
//	Final variable must be initialized during variable declaration
//	final int x;
	
	final float SALARY = 50000.0f;
	
	void print()
	{	
		// We can't change the value of the final variable
//		SALARY = 60000.0f;
		
		System.out.println("salary is : "+ SALARY);
	}
}
