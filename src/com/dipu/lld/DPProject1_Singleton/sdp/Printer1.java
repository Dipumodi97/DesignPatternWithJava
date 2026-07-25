package com.dipu.lld.DPProject1_Singleton.sdp;

public class Printer1 {
	
	private static Printer1 INSTANCE= new Printer1();
	
	private Printer1() {
		
	}
	
	public static Printer1 getInstance() {
		
		return INSTANCE;
	}

}
