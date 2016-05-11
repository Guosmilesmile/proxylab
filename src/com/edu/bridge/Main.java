package com.edu.bridge;

public class Main {
	public static void main(String[] args) {
		CoffeeService coffeeService = new CoffeeService();
		ACupSize cupSize = new CupsizeShort();
		AFoam foam = new FoamExtra();
		AMilk milk = new MilkLowmilk();
		ACoffee coffee = new CoffeeAmerican(cupSize, foam, milk);
		coffeeService.OrderCoffee(coffee);
		ACupSize cupSize2 = new CupsizeTall();
		AFoam foam2 = new FoamNofoam();
		AMilk milk2 = new MilkLowmilk();
		ACoffee coffee2 = new CoffeeMocha(cupSize2, foam2, milk2);
		coffeeService.OrderCoffee(coffee2);
		coffeeService.MakeCoffee();
	}
}
