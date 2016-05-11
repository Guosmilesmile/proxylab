package com.edu.bridge;

public class Main {
	public static void main(String[] args) {
		ACoffee coffee = new CoffeeAmerican(null, null, null);
		if(coffee instanceof CoffeeAmerican){
			System.out.println("yes");
		}else{
			System.out.println("No");
		}
	}
}
