package com.edu.bridge;

public class CoffeeMocha extends ACoffee{

	public CoffeeMocha(ACupSize cupSize, AFoam foam, AMilk milk) {
		super(cupSize, foam, milk);
	}

	@Override
	public String getCoffeeName() {
		return "Mocha";
	}

}
