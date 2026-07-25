// Singleton Java class with minimum standards
package com.dipu.lld.DPProject1_Singleton.sdp;


import com.dipu.lld.DPProject1_Singleton.common.CommonUtils;

public class Printer extends CommonUtils {

	private static final long serialVersionUID = 1L;
	// private static ref variable
	private static Printer INSTANCE;

	// Private Constructor
	private Printer() {
		System.out.println("Zero-Param Constructor");
	}

	// public static factory method having singleton logic
	/*public static Printer getInstance() {
		
		if(INSTANCE==null) 
			INSTANCE= new Printer();
			return INSTANCE;
		
	}*/
	// public synchronized static factory method having singleton logic
	/*public synchronized static Printer getInstance() {
	
		if (INSTANCE == null)
		try {
		Thread.sleep(5000);
		}//end of try-block
		catch(Exception e) {
			e.printStackTrace();
		}//end of catch-block
		
		INSTANCE = new Printer();
		return INSTANCE;
	}*/
	// public static factory method having singleton logic in synchronized block
	/*public static Printer getInstance() {
	
		synchronized(Printer.class) {// class level locking(static properties will be locked)
		if (INSTANCE == null)
	
		try {
		Thread.sleep(5000);
		}//end of try-block
		catch(Exception e) {
			e.printStackTrace();
		}//end of catch-block
		
		INSTANCE = new Printer();
		return INSTANCE;
		}
	}*/
	// public synchronized static factory method having singleton logic
	public static Printer getInstance() 
	{

		if(INSTANCE==null) {// 1st null check
			
			System.out.println("Printer.getInstance()(outside sync block)::"+Thread.currentThread().getName());
			synchronized (Printer.class) {// class level locking(static properties will be locked)
				System.out.println("Printer.getInstance()(inside sync block)::"+Thread.currentThread().getName());
				if(INSTANCE==null) { // 2nd null check
					try { 
						Thread.sleep(5000);
					}catch (Exception e) {
						e.printStackTrace();
					}
					
					INSTANCE = new Printer();
				}
			}
		}
		return INSTANCE;
	}
	
	/*@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}*/
	/*@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return INSTANCE;
	}*/
	
	@Override// this is the best solution
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException("In this Singleton class is Restricted");
	}
	
	public Object readResolve() {
		return INSTANCE;
	}

	// to add business method
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
