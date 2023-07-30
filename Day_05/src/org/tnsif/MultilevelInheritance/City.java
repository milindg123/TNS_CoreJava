package org.tnsif.MultilevelInheritance;

public class City extends State{
	
	
//	Private Data Members
	private String Cityname;
	private int cityCode;
	
//	Getter and Setter Method
	public String getCityname() {
		return Cityname;
	}
	public void setCityname(String cityname) {
		Cityname = cityname;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	
//	Parametrized Constructor
	public City(String stateName, int stateCode, String natinality, int CountryCode, String Cityname, int cityCode) {
		super(stateName, stateCode, natinality, CountryCode);
		this.Cityname = Cityname;
		this.cityCode = cityCode;
	}
	
	
	@Override
	public String toString() {
		return "City [Cityname=" + Cityname + ", cityCode=" + cityCode + ", toString()=" + super.toString() + "]";
	}
	
	

}
