package com.dipu.lld.DPProject1_Singleton.test;

public class SingletonTest_MultiThreaded {

	public static void main(String[] args) {
		
		// Create threads with 
		TicketBookingOperation operation = new TicketBookingOperation();
		Thread t1 = new Thread(operation);
		Thread t2 = new Thread(operation);
		Thread t3 = new Thread(operation);
		
		// Start thread
		t1.run();
		t2.run(); 
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		t3.run();
	}
}
