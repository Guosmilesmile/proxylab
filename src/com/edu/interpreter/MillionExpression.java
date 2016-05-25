package com.edu.interpreter;

import java.util.List;

public class MillionExpression implements Expression{

	@Override
	public double  interpret(MoneyContext context) throws TranslateException{
		return new ThousandExpression().interpret(context)*1000000;
	}



}
