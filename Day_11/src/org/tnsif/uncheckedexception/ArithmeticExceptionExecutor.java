package org.tnsif.uncheckedexception;
import java.util.Scanner;
public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x:  ");
		int x = sc.nextInt();
		System.out.println("Enter the value of y:  ");
		int y = sc.nextInt();
		
		// Try block contains an exception code
		try {
		System.out.println(x/y);
		}
		
		// catch block is used to handle that exception
		catch(Exception e)
		{
			System.out.println("Exception Handled: " + e);
		}

	}

}
