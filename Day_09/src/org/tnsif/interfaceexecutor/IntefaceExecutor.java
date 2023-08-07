// Program to demonstrate of an Interface
package org.tnsif.interfaceexecutor;

public class IntefaceExecutor {

	public static void main(String[] args) {
//		we can't instantiate an interface
//		Sony s = new Sony()
		
		SonyTV s = new SonyTV();
		s.display();
		s.show();
		Sony.accept();  // We must write the interface name
		
		System.out.println("\n\n******* Functional Interface ***************");
		ISRO i = new ISRO();
		i.status();
		
		
		System.out.println("\n\n*********** Multiple Inheritance by using Interface");
		Human h = new Human();
		h.showDrink();

	}

}
