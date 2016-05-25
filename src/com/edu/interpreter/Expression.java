package com.edu.interpreter;

public interface Expression {
	/**
	 * 解析一段内容转变为数字
	 * @param line
	 * @return
	 */
	public int interpret(String line);
}
