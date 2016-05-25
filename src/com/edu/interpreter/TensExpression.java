package com.edu.interpreter;

import java.util.List;

public class TensExpression implements Expression{

	@Override
	public double interpret(MoneyContext context) {
		List<String> blocks = context.getCurrentblock();
		double total = 0;
		for(int i=0;i<blocks.size();i++){
			total += MoneyUtils.changStringToInteger(blocks.get(i));
		}
		return total;
	}

}
