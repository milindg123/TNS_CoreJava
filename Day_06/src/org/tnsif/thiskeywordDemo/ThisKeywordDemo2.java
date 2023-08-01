// This keyword is used to constructor

package org.tnsif.thiskeywordDemo;

class Bank
{
	long accountNo;
	
	Bank(long accountNo){
		
		this.accountNo = accountNo;     // This keyword is used here 
//		System.out.println(accountNo);
	}
	void display() {
		System.out.println(accountNo);
	}

}

public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		Bank b = new Bank(45236875L);
		b.display();
	}

}
