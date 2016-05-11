package com.edu.proxy;

import java.util.ArrayList;
import java.util.List;

public class PrinterProxy implements Printable{
	private List<PrinterDecorate> list = new ArrayList<PrinterDecorate>();
	
	/**
	 * 获取可以连接的打印机
	 */
	@SuppressWarnings("unused")
	public void Init(PrinterDecorate... printerDecorates){
		for(PrinterDecorate temp : printerDecorates){
			list.add(temp);
		}
	}

	@Override
	public void setPrinterName(String name) {
		for(int i=0;i<list.size();i++){
			PrinterDecorate printerDecorate= list.get(i);
			printerDecorate.setPrinterName(name);
		}
	}

	@Override
	public String getPrinterName() {
		String resutl = "";
		for(int i=0;i<list.size();i++){
			PrinterDecorate printerDecorate= list.get(i);
			resutl+=printerDecorate.getPrinterName()+",";
		}
		return resutl;
	}

	@Override
	public void print(String string) {
		for(int i=0;i<list.size();i++){
			PrinterDecorate printerDecorate= list.get(i);
			printerDecorate.print(string);
		}
	}
	
}
