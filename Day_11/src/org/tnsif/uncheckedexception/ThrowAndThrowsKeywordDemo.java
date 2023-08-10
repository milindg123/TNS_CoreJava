package org.tnsif.uncheckedexception;

public class ThrowAndThrowsKeywordDemo {
	
	static void isEligible(int age, int weight) {
		
		if(age>18 && weight>50) {
			System.out.println("Person is eligible to donate the blood");
		}
		
		else
			
			// throw keyword is used to throw an ------> (exception explicitly)
			throw new ArithmeticException ("Criteria is not satisfied");
	}

	public static void main(String[] args) {
		
//		isEligible(13,54);   (When we not use a try and catch block then the exception is written in RED)
		
		try
		{						// (when we used the try and catch block it will return the exception in BLACK)
			isEligible(13,54);
		}
		
		catch(Exception e) 
		{
			System.out.println(e);
		}

	}

}
