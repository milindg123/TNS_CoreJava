package org.tnsif.uncheckedexception;

public class FinallyBlockNotExecutedExecutor {
	static void display(int arr[])
	{
		try {
			System.out.println(arr[2]);
			
			/* if try and catch block contains a  -------> ( System.exit(0);) <----------------
			 * 
			 * after the exception code line, then finally block does not execute*/
//			System.exit(0);
		}
		
		catch(Exception e)
		{
			System.out.println("Execption Hnadled : " + e);
			
			System.exit(0);
		}
		
		finally  // --> in the finally block statement is **(always executed)** in the program
		{
			// When finally block contains an exception code , then finally block does not executed
			System.out.println(13/0);
			System.out.println("Finally block is always executed");
		}
		
		System.out.println("Any statement out of the block is always executed");
	}

	public static void main(String[] args) {
		int arr[] = {12,6,89};
		display(arr);

	}

}
