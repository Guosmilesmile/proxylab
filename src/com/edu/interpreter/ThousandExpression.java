package com.edu.interpreter;

import java.util.List;

public class ThousandExpression implements Expression {

	@Override
	public int interpret(MoneyContext context) {
		List<String> blocks = context.getBlock();
		return 0;
	}

}
