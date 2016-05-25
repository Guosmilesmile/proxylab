package com.edu.interpreter;

import java.util.ArrayList;
import java.util.List;

public class HundredExpression implements Expression{

	@Override
	public double  interpret(MoneyContext context) {
		int total = 0;
		int hundredIndex = -1;
		for(int i=0;i<context.getCurrentblock().size();i++){
			if(context.getCurrentblock().get(i).equals("hundred")){
				hundredIndex = i;
			}
		}
		List<String> list = new ArrayList<String>();
		if(hundredIndex==-1){
			list = context.getCurrentblock();
		}else{
			for(int i = hundredIndex+1 ;i<context.getCurrentblock().size();i++){
				total += MoneyUtils.changStringToInteger(context.getCurrentblock().get(i));
			}
			total *= 100; 
			for(int i = 0 ;i<hundredIndex;i++){
				list.add(context.getCurrentblock().get(i));
			}
		}
		
		
		context.setCurrentblock(list);
		total += new TensExpression().interpret(context);
		return total;
	}

}
