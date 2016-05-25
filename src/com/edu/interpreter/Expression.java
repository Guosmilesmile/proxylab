package com.edu.interpreter;

import java.util.List;

public interface Expression {
	/**
	 * 解析一段内容转变为数字
	 * @param context
	 * @return
	 */
	public int interpret(List<String> lines);
}
