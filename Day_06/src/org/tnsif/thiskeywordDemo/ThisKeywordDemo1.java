// Program to demonstrate on:

// used to refer the current class
//this keyword is used to refer current instance of the class
package org.tnsif.thiskeywordDemo;

class Account{
	long accountNo;
	
	void setData(long accountNo)
	{
		this.accountNo = accountNo;
	}
	
	void display() 
	{
		
		System.out.println(accountNo);
	}
}

// Driver Class
public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Account a = new Account();
//		a.accountNo = 4523678L;  --> This will give the accountNo directly
		a.setData(4523678L);
		a.display();

	}

}
