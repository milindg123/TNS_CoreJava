package org.tnsif.BasicJava;
import java.util.Scanner;
public class SumOfThreeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first No : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second No : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the Third No : ");
		int num3 = sc.nextInt();
		
		System.out.println("Sum of three no is : ");
		int sum = (num1 + num2 + num3);
		System.out.println(sum);
		
	}

}
