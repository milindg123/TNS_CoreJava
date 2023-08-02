package org.tnsif.superkeyword;
// Parent class
class MET{
	
	String ownerName="Chagan Bhujbal";
	void displayName() {
		System.out.println("Owner is : "+ ownerName);
	}
	
}

// child class
class BKC extends MET{
	String ownerName="Shefali Bhujbal";
	void displayName(){
		/*
		 * If parent class and child class method name has same,
		 *  and if you want to access that method inside child class
		 *  then use super.methodname
		 */
		super.displayName(); 
		System.out.println("Owner is : "+ ownerName);
	}
}

//Driver Class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b = new BKC();
		b.displayName();

	}

}
