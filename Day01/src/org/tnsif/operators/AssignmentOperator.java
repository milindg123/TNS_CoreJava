// Program to demonstrate the Assignment Operator

package org.tnsif.operators;
import java.util.Scanner;
public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		num1 -= num2;
		System.out.println(num1);
		

	}

}
