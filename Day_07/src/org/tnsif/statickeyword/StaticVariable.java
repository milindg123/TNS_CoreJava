package org.tnsif.statickeyword;
class Employee{
	private int empID;
	private String name;
	
	// Static variable
	private static String companyName="TNSIF";
	
	// Getters and Setters
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	//instead of these we used toString method but it will not give the static value
	void display() {
		System.out.println("EmpID: " + this.getEmpID()+" "+ "Emp name: " + this.getName()+" "+"company Name : "+ this.getCompanyName());
	}
	
	
}

//Driver class
public class StaticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpID(1);
		e.setName("Milind");
		e.display();
		
		e.setEmpID(10);
		e.setName("Mayur");
		e.display();

	}

}
