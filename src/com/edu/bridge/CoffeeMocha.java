package com.edu.bridge;

public class CoffeeMocha extends ACoffee{

	public CoffeeMocha(ACupSize cupSize, AFoam foam, AMilk milk) {
		super(cupSize, foam, milk);
	}

	@Override
	public String getCoffeeName() {
		return "Mocha";
	}

	@Override
	public String makeCoffee() {
		String result = "coffeename is"+getCoffeeName()+",";
		result+= " size is "+ getCupSize().getSize()+",";
		result+=" foam is "+getFoam().getFoamWeight()+",";
		result+= " milk is "+getMilk().getMilkWeight();
		return result;
	}
}
