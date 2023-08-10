package org.tnsif.uncheckedexception;

public class ArrayIndexOutOfBoundExceptionExecutor {
	static void display(int arr[])
	{
		try {
		System.out.println(arr[3]);
		}
		
		catch(Exception e)
		{
			System.out.println("Execption Hnadled : " + e);
		}
		
		finally  // --> in the finally block statement is **(always executed)** in the program
		{
			System.out.println("Finally block is always executed");
		}
		
		System.out.println("Any statement out of the block is always executed");
	}
	
	public static void main(String[] args) {
		int arr[] = {12,6,89};
		display(arr);


	}

}
