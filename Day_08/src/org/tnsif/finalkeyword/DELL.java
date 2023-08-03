package org.tnsif.finalkeyword;
// Program to demonstrate on final keyword with method

public class DELL extends Laptop {
	
	final String processor = "Intel i5";
	//final method
	
//	We can't override final method
	
//	void display() {                   --> this display method is already final in the Laptop class
//		System.out.println(processor);
//	}
	
	void display(String procesor) {
		System.out.println(processor);
	}

}
