package org.tnsif.superkeyword;
// Program to demonstrate on super keyword with variable
class Building
{
	int floors = 23;
	String name = "Rajghruh";
}

class Flat extends Building{
	String name = "Milind Ghegadmal";
	
	void print() {
		
//		If parent class and child class variable name are same 
//		and if you want to access parent class variable inside child class used super.variable name
		System.out.println(super.name);
		System.out.println(name);
	}
	
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f = new Flat();
//		System.out.println(f.name);
		f.print();

	}

}
