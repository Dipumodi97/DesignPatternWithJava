package com.dipu.lld.DPProject1_Singleton.test;


import com.dipu.lld.DPProject1_Singleton.sdp.Printer;

public class SingtonClassTest1 {

	public static void main(String[] args) {
		// get singleton java class object
		
		//Printer p1 = new Printer();
		
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		
		System.out.println("Hashcode ::"+p1.hashCode()+" :: "+p2.hashCode());
		
		System.out.println("p1==p2 ?"+(p1==p2));
		
		
	}
}
