package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	 String str;
	 static int rollID;
	 
	 /*Static Block is used to initialized static variable
 	and we can not initialized any non-static variable inside the static block
 * 
 */
	 static {
		 rollID = 24;
//		 str = Milind;
		 System.out.println(rollID);
		 
	 }
	 
	 /* We have another 
	  *
	  */
	  
//	 static void print() {
//		 System.out.println(rollID);
//	 }
	public static void main(String[] args) {
		
		/* main function is static and hence it call static block ,
		 * method and variable by default
		 * 
		 */
//		print();

	}

}
