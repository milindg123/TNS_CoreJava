
//*Question : Write a java program which asks the user to enter his name and greets them with "Hello <name> have a good day


package org.tnsif.BasicJava;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		System.out.println("Hello " + name + " have a good day");
	}

}
