package com.edu.interpreter;

import java.util.List;

public class TrillionExpression implements Expression{

	@Override
	public double interpret(MoneyContext context) throws TranslateException {
		double x  = 1.0*1000*1000000000;
		return new ThousandExpression().interpret(context)*x;
	}



}
