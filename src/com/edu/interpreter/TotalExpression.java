package com.edu.interpreter;

import java.util.List;

public class TotalExpression {

	public int interpret(MoneyContext context) {
		int index = 0;
		while(true){
			List<String> list = context.getBlock();
			if(list.size()==0)
				break;
			if(index == 0){
				int total = new ThousandExpression().interpret(list);
			}else if(index == 1 ){
				int total = new BillionExpression().interpret(list);
			}else if(index == 2){
				int total = new TrillionExpression().interpret(list);
			}
			if(list.size()==1){
				if(list.get(0).equals("million")){
					index = 1;
				}else if(list.get(0).equals("billion")){
					index = 2;
				}else if(list.get(0).equals("trillion")){
					index = 3;
				}
				
			}
		}
		return 0;
	}

}
