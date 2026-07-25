package com.dipu.lld.FactoryPattern_Solution.components;

public abstract class Car {

	private Integer engineId;
	private String registrationNo;
	
	// when we have to take a car then public will assemble
	
	public abstract void assemble();
	public abstract void roadTest();
	public abstract void drive(); 
}
