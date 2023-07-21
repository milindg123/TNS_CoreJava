package org.tnsif.operators;

public class Increment_DecrementOperators {

	public static void main(String[] args) {
		int x = 23, y=6; //23 + 7
		int res1 = x++ + ++y;
		System.out.println(res1); //30
		System.out.println(x); //24
		System.out.println(y); //7
		
		System.out.println("\nResult 2 is :");
		int res2 = x-- + --y;
		System.out.println(res1);
		System.out.println(x); 
		System.out.println(y); 

	}

}
