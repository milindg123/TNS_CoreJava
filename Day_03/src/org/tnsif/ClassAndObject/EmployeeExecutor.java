// Driver Class :- It contains main function

// Program to demonstrate on Class and Object
package org.tnsif.ClassAndObject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		// Object creation
		Employee e = new Employee();
		e.empID = 123456;
		e.empName = "Milind Ghegadmal";
		e.salary = 20000;
		e.department = "CS";
		
		// Method call
		e.display();

	}

}
