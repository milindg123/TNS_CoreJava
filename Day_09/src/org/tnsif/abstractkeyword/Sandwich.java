package org.tnsif.abstractkeyword;

public abstract class Sandwich {
	
//	Concrete method --> the method in which the body is implemented is called concrete method
	void showReceipe()
	{
		System.out.println("I don't know how to" + " Prepare sandwich");
	}
	
//	 Abstract method  --> The method which does not contain implementation body is called Abstract method 
	abstract void prepare();

}
