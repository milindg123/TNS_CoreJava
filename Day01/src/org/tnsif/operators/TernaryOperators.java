// Programs to Denmonstrate Ternary Operator 
package org.tnsif.operators;
import java.util.Scanner;
public class TernaryOperators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = (num%2 == 0) ?"Even":"Odd";
		
		System.out.println("Result is:" + result);
		sc.close();

	}

}
