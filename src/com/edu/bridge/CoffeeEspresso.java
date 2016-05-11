package com.edu.bridge;

public class CoffeeEspresso extends ACoffee{

	public CoffeeEspresso(ACupSize cupSize, AFoam foam, AMilk milk) {
		super(cupSize, foam, milk);
	}

	@Override
	public String getCoffeeName() {
		return "Espresso";
	}

}
