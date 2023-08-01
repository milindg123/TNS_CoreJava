// this keyword is used as a parameter in the method

package org.tnsif.thiskeywordDemo;
class Director{
	String name;
	
	void print() {
		this.name = "Sunil Datt";
		display(name);
	}
	
	void display(String name) {
		System.out.println("Director name is: "+ name);
	}
}
public class ThisKeywordDemo4 {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();
	}

}
