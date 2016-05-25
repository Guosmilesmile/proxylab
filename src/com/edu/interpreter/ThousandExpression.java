package com.edu.interpreter;

import java.util.ArrayList;
import java.util.List;

import com.edu.proxy.Printable;

public class ThousandExpression implements Expression {

	@Override
	public double interpret(MoneyContext context)  throws TranslateException {
		double total = 0;
		int thousandIndex = -1;
		for(int i=0;i<context.getCurrentblock().size();i++){
			if(context.getCurrentblock().get(i).equals("thousand")){
				thousandIndex = i;
			}
		}
		List<String> list = new ArrayList<String>();
		if(thousandIndex==-1){
			list = context.getCurrentblock();
		}else{
			for(int i = thousandIndex+1 ;i<context.getCurrentblock().size();i++){
				total += MoneyUtils.changStringToInteger(context.getCurrentblock().get(i));
			}
			total = total * 1000.0; 
			for(int i = 0 ;i<thousandIndex;i++){
				list.add(context.getCurrentblock().get(i));
			}
		}
		context.setCurrentblock(list);
		total += new HundredExpression().interpret(context);
		return total;
	}



}
