package com.edu.interpreter;

public class Main {
	public static void main(String[] args) {
		MoneyContext context = new MoneyContext("one million forty five thousand three hundred thirty three");
		TotalExpression expression = new TotalExpression();
		int total = expression.interpret(context);
		System.out.println("total : "+ total);
	}
}
