package com.edu.interpreter;

import java.util.List;

public class TotalExpression implements Expression{

	@Override
	public double  interpret(MoneyContext context) throws TranslateException {
		double  total = 0;
		int index = 0;
		while(true){
			context.getNextBlock();
			if(context.getCurrentblock().size()==0)
				break;
			if(context.getCurrentblock().size()==1){
				if(context.getCurrentblock().get(0).equals("million")){
					index = 1;
					context.getNextBlock();
				}else if(context.getCurrentblock().get(0).equals("billion")){
					index = 2;
					context.getNextBlock();
				}else if(context.getCurrentblock().get(0).equals("trillion")){
					index = 3;
					context.getNextBlock();
				}
			}
			if(index == 0){
				total += new ThousandExpression().interpret(context);
				index = -1;
			}else if(index == 1 ){
				total += new MillionExpression().interpret(context);
				index = -1;
			}else if(index == 2){
				total += new BillionExpression().interpret(context);
				index = -1;
			}else if(index == 3){
				total += new TrillionExpression().interpret(context);
				index = -1;
			}
			
		}
		return total;
	}

}
