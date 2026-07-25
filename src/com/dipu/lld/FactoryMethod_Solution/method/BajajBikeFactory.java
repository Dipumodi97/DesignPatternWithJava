package com.dipu.lld.FactoryMethod_Solution.method;

import com.dipu.lld.FactoryMethod_Solution.bike.BajajBike;

public abstract class BajajBikeFactory {

	public abstract void painting();
	public abstract void assembling();
	public abstract void engineTest();
	public abstract void roadTest();
	public abstract BajajBike createBike(String type);
	
	public BajajBike orderBike(String type) {
		BajajBike bajajBike = createBike(type);
		painting();
		assembling();
		engineTest();
		roadTest();	
		return bajajBike;
	}
	
}
