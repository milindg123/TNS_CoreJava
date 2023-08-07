package org.tnsif.interfaceexecutor;

public class Human implements ColdDrink, AlcoholDrinks{

	@Override
	public void showDrink() {
		System.out.println(colddrinkName + " " + alcohotype + " " + brand);
		
	}
	

}
