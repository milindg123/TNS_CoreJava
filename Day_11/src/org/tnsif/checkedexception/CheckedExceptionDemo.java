package org.tnsif.checkedexception;
import java.io.*;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream f = new FileInputStream("C:\\Users\\Admin\\Downloads\\Hello.txt");
		
			System.out.println("File is exists !!");
		}
		
		catch(Exception e) {
			System.out.println("Exception Handle : " + e);
		}

	}

}
