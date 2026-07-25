package com.dipu.lld.DPProject1_Singleton.test;

import com.dipu.lld.DPProject1_Singleton.sdp.Printer1;

public class TicketBookingOperation implements Runnable {

	@Override
	public void run() {
		System.out.println("TicketBookingOperation.run()");
		
		//Printer p1 = Printer.getInstance();
		
		Printer1 p1 = Printer1.getInstance();
		System.out.println(p1.hashCode());

	}

}
