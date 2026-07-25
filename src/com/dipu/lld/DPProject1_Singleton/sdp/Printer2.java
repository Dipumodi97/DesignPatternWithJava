package com.dipu.lld.DPProject1_Singleton.sdp;

public class Printer2 {

	// private constructor
	private Printer2() {
		// TODO Auto-generated constructor stub
	}

	// static inner class/ nested class/ nested inner class
	private static class Printer2Inner {
		// Inner class Based eager Instantiation,
		// Front outer is a lazy instantiation
		private static Printer2 INSTANCE = new Printer2();

	}
	
	// static factory method 
	public static Printer2  getInstance() {
		return Printer2Inner.INSTANCE;
	}
}
