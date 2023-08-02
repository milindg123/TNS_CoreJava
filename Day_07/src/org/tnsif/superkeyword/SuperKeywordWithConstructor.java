package org.tnsif.superkeyword;
// Program to demonstrate on super constructor

// Parent class
class Google{
	String ceo;
//	Default Constructor
	public Google(String ceo) {
		System.out.println("Default Constructor : "+ ceo);
	}
	
	
}

// Child class
class Gmail extends Google{
	
	String userId;
//	Parameterized Constructor
	public Gmail(String ceo, String userId) {
		// Calling to parent class parameterized constructor
		super(ceo);
		this.userId = userId;
		System.out.println(userId);
	}
	
	
	
	
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail g = new Gmail("Sundar Pichai","abc@gmail.com");
		

	}

}
