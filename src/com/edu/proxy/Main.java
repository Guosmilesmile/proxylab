package com.edu.proxy;

public class Main {
	public static void main(String[] args) {
		PrinterDecorate printable = new PrinterDecorate("No.1","#");
		PrinterDecorate printable1 = new PrinterDecorate("No.2","*");
		PrinterDecorate printable2 = new PrinterDecorate("No.3","&");
		PrinterProxy printproxy = new PrinterProxy();
		printproxy.Init(printable,printable1,printable2);
		
		printproxy.print("this is content");
	}
}
