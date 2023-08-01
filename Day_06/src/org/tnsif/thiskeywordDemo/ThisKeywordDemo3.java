// We can passed a this keyword as parameterized constructor

package org.tnsif.thiskeywordDemo;
class Team
{
	int size;
	
	// 1. Default Constructor --> No any Parameter there
	Team()
	{
		// Calling to parameterized Constructor
		this(7);  //--> Here we called first Parameterized constructor so it will give the output parameterized constructor first
		System.out.println("Default Constructor");
	}
	
	// 2. Parameterized Constructor --> We have to passed the parameter in the parameterized constructor
	Team(int size)
	{
		System.out.println("Parameterized Constructor: " + size);
	}
}
public class ThisKeywordDemo3 {

	public static void main(String[] args) {
		Team t = new Team();

	}

}


/*
 */
