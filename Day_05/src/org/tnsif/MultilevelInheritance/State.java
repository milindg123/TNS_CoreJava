package org.tnsif.MultilevelInheritance;

public class State extends Country{
	
	// Private Data Members
	private String StateName;
	private int StateCode;
	
	// Getter and Setter
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public int getStateCode() {
		return StateCode;
	}
	public void setStateCode(int stateCode) {
		StateCode = stateCode;
	}
	
	//Default Constructor
	public State() {
		super();
		System.out.println("Default Constructor of state class");
	}
	
	//Parameterized constructor
	public State(String stateName, int stateCode, String natinality, int CountryCode) {
		super(natinality,CountryCode);
		this.StateName = stateName;
		this.StateCode = stateCode;
	}
	
	
	@Override
	public String toString() {
		return "State [StateName=" + StateName + ", StateCode=" + StateCode + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
