package com.edu.bridge;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService {
	private  List<ACoffee> aCoffees = new ArrayList<ACoffee>();
	public void OrderCoffee(ACoffee coffee){
		aCoffees.add(coffee);
	}
	
	public void MakeCoffee(){
		System.out.println("start making coffee");
		for (int i = 0; i < aCoffees.size(); i++) {
			ACoffee coffee = aCoffees.get(i);
			System.out.println(coffee.makeCoffee());
		}
		aCoffees.removeAll(aCoffees);
	}
}
