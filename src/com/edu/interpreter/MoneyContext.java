package com.edu.interpreter;

import java.util.ArrayList;
import java.util.List;

public class MoneyContext {
	/**
	 * 数值
	 */
	public int money = 0;

	/**
	 * 需要转换的文字
	 */
	private String content;

	/**
	 * 依据空格切割
	 */
	private String[] lines;
	/**
	 * 单位
	 */
	private static List<String> Unit = new ArrayList<String>();
	static {
		Unit.add("trillion");
		Unit.add("billion");
		Unit.add("million");
	}

	/**
	 * 当前索引位置
	 */
	private int CurrentIndex = 0;

	public MoneyContext(String content) {
		this.content = content;
		lines = content.split(" ");
		CurrentIndex = lines.length;
	}

	/**
	 * 获取当前块、以每个单位为一块，每个单位间的三位数字为一块.
	 * 
	 * @return
	 */
	public List<String> getBlock() {
		List<String> list = new ArrayList<String>();
		if(CurrentIndex==-1){
			return list;
		}
		int LastIndex = this.CurrentIndex;
		if (Unit.contains(lines[CurrentIndex])) {
			list.add(lines[CurrentIndex]);
			CurrentIndex--;
		} else {
			int count = 0;
			while (count == 1) {
				if (Unit.contains(lines[CurrentIndex])) {
					CurrentIndex++;
					count++;
				}else{
					list.add(lines[CurrentIndex]);
					CurrentIndex--;
					if(CurrentIndex==-1)
						break;
				}
			}
		}
		return list;
	}
}
