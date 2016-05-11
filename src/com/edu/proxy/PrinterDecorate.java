package com.edu.proxy;

public class PrinterDecorate implements Printable{
	private Printer printer;
	private String decorate;
	public PrinterDecorate(Printer printer) {
		super();
		this.printer = printer;
	}

	public PrinterDecorate(Printer printer, String decorate) {
		super();
		this.printer = printer;
		this.decorate = decorate;
	}
	
	public PrinterDecorate(String name,String decorate) {
		super();
		this.printer = new Printer(name);
		this.decorate = decorate;
	}

	public PrinterDecorate() {
		super();
	}

	public void setPrinterName(String name) {
		
	}

	public String getPrinterName() {
		return null;
	}

	@Override
	public void print(String string) {
		for(int i=0;i<10;i++){
			System.out.print(decorate);
		}
		System.out.println();
		printer.print(string);
		for(int i=0;i<10;i++){
			System.out.print(decorate);
		}
		System.out.println();
	}
}
