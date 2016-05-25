package com.edu.interpreter;

import java.util.HashMap;
import java.util.Map;

public class MoneyUtils {
	
	private static Map<String,Integer> storage = new HashMap<String, Integer>();
	
	static{
		storage.put("one", 1);
		storage.put("two", 2);
		storage.put("three", 3);
		storage.put("four", 4);
		storage.put("five", 5);
		storage.put("six", 6);
		storage.put("seven",7);
		storage.put("eight", 8);
		storage.put("nine",9);
		storage.put("ten", 10);
		storage.put("eleven", 11);
		storage.put("twelve", 12);
		storage.put("thirteen", 13);
		storage.put("fourteen", 14);
		storage.put("fifteen", 15);
		storage.put("sixteen", 16);
		storage.put("seventeen", 17);
		storage.put("eighteen", 18);
		storage.put("nineteen", 19);
		storage.put("twenty",20);
		storage.put("thirty", 30);
		storage.put("forty", 40);
		storage.put("fifty", 50);
		storage.put("sixty", 60);
		storage.put("seventy", 70);
		storage.put("eighty", 80);
		storage.put("ninety", 90);
	}
	
	public static int changStringToInteger(String string){
		return storage.get(string);
	}
}
