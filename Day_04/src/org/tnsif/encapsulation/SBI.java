// Program to demonstrate on encapsulation

/* Encapsulation achieves a data hiding using private access specifier*/

package org.tnsif.encapsulation;

public class SBI {
	
	// Private Data Members
	private String accType;
	private long accountNo;
	private long atmCardNo;
	private int pinNo;
	
	// Getters and Setters Method
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	@Override
	public String toString() {
		return "SBI [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo
				+ "]";
	}
	
	
	
	
	

}
