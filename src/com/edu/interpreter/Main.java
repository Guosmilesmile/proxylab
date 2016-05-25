package com.edu.interpreter;

public class Main {
	public static void main(String[] args) {
		MoneyContext context = new MoneyContext("one thousand trillion one billion one million forty five thousand three hundred thirty three");
		//MoneyContext context = new MoneyContext("one thousand");
		TotalExpression expression = new TotalExpression();
		long total = 0;
		try {
			total = (long) expression.interpret(context);
			System.out.println("total : "+ total);
		} catch (TranslateException e) {
			e.printStackTrace();
		}
		
	}
}
