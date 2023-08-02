package org.tnsif.statickeyword;

public class StaticVariableExecutor {
	
	/*
	 * If any variable is outside the main function and if you 
	 * want to access that variable inside the main function then,
	 * make the variable as static
	 */
	static String str = "TNS India Foundation";

	public static void main(String[] args) {
//		StaticVariableExecutor s = new StaticVariableExecutor();
//		System.out.println(s);
		System.out.println(str);

	}

}
