package com.dipu.lld.DPProject1_Singleton.test;


import com.dipu.lld.DPProject1_Singleton.sdp.Printer;

public class SingtonClassCloningTest2 {

	public static void main(String[] args) {
		// get singleton java class object
		
		//Printer p1 = new Printer();
		
		Printer p1 = Printer.getInstance();
		
		try {
			Printer p2 = (Printer) p1.clone();
			System.out.println(p1.hashCode()+"::"+p2.hashCode());
			System.out.println("p1==p2? ->"+(p1==p2));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
