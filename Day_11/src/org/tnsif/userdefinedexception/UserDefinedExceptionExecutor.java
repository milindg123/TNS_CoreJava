package org.tnsif.userdefinedexception;

import java.util.Scanner;

public class UserDefinedExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the userid : ");
		String userid = sc.nextLine();
		
		System.out.println("Enter the password: ");
		String password = sc.nextLine();
		
		try {
			if(userid.equals("Milindg@123met.org") && password.equals("Pass@8081"))
			{
				System.out.println("Credentials are matched !!!");
			}
		
			else
			{
				throw new LoginCredentials("Invalid Credentials");
			}
		}
		
		catch(LoginCredentials e) {
			System.out.println("Exception Hnadled : " + e);
		}

	}

}
