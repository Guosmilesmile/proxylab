package com.edu.bridge;

public class CoffeeCappuccion extends ACoffee{

	public CoffeeCappuccion(ACupSize cupSize, AFoam foam, AMilk milk) {
		super(cupSize, foam, milk);
	}

	@Override
	public String getCoffeeName() {
		return "Cappuccion";
	}

}
