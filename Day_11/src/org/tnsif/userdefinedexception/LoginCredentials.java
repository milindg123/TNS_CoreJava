package org.tnsif.userdefinedexception;

import java.util.Arrays;

// Program to demonstrate on user defined exception 
// To used custom/ UserDefined exception extends an exception class (parent)
public class LoginCredentials extends Exception {
	
	private String str;
	
	// Getters and Setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	
	// Parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}

	

	

}
