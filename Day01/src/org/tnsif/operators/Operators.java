package org.tnsif.operators;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First No: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter the Second No: ");
		int num2 = sc.nextInt();
		System.out.println("Addition :" +(num1 + num2));
		System.out.println("Substraction:" + (num1 - num2));
		System.out.println("Multiplication : " +(num1 * num2));
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

}
