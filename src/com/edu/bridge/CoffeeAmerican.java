package com.edu.bridge;

public class CoffeeAmerican extends ACoffee{

	public CoffeeAmerican(ACupSize cupSize, AFoam foam, AMilk milk) {
		super(cupSize, foam, milk);
	}

	@Override
	public String getCoffeeName() {
		return "American";
	}

	

}
