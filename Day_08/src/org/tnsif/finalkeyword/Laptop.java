package org.tnsif.finalkeyword;

//Program to demonstrate on final keyword with method

// Parent class

// Final class can't be inherit to child class
//public final class Laptop

public class Laptop {
	
	final String processor = "Intel i3";
	//final method
	final void display() {
		System.out.println(processor);
	}

}
