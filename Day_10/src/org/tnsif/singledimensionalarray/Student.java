package org.tnsif.singledimensionalarray;
// Program to demonstrate on arrays of objects
public class Student {
	
	// Private data members
	private int sId;
	private String name;
	private double salary;
	
	// Getters and Setters
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Parameterized Constructor
	public Student(int sId, String name, double salary) {
		super();
		this.sId = sId;
		this.name = name;
		this.salary = salary;
	}
	
	
	

}
