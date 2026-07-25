package com.dipu.lld.FactoryMethod_Problem.bike;

public class BajajPulsorBike implements BajajBike{

	private String power;

	@Override
	public void painting() {
		System.out.println("BajajPulsorBike.painting()");
	}

	@Override
	public void assembling() {
		System.out.println("BajajPulsorBike.assembling()");
	}

	@Override
	public void engineTest() {
		System.out.println("BajajPulsorBike.engineTest()");
	}

	@Override
	public void roadTest() {
		System.out.println("BajajPulsorBike.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("BajajPulsorBike.drive()");
		
	}
}
