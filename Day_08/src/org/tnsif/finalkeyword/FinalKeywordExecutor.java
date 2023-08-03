package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
//		when we declare a variable as final we can't change it in the main method also
		
		// f.SALARY = 56000.00f;
		
		f.print();
		
		DELL d = new DELL();
		d.display();
		d.display(d.processor);

	}

}
