package org.tnsif.interfaceexecutor;

public interface Sony {
	
	//By default all the variable inside an interface is (public static final)
	int noOfChannelis = 20;
//	by default all the method inside an interface is an abstract method
	void display();
	
//	Java 8 provides static and default method inside an interface 
	
	// Static method
	static void accept() {
		System.out.println("Static Method");
	}
	
	// Default Method
	default void show()
	{
		System.out.println("Default Method");
	}

}
