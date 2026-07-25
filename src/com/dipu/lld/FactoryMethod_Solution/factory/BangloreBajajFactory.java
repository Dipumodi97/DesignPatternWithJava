package com.dipu.lld.FactoryMethod_Solution.factory;

import com.dipu.lld.FactoryMethod_Solution.bike.BajajBike;
import com.dipu.lld.FactoryMethod_Solution.bike.BajajDiscoverBike;
import com.dipu.lld.FactoryMethod_Solution.bike.BajajPlatinaBike;
import com.dipu.lld.FactoryMethod_Solution.bike.BajajPulsorBike;
import com.dipu.lld.FactoryMethod_Solution.factory.method.BajajBikeFactory;

// Factory Pattern-2
public class BangloreBajajFactory extends BajajBikeFactory {

	public BajajBike createBike(String type) {
		
		BajajBike bajajBike = null;
		if(type.equalsIgnoreCase("pulsor")) {
			bajajBike = new BajajPulsorBike();
		}else if(type.equalsIgnoreCase("discover")) {
			bajajBike = new BajajDiscoverBike();
		}else if(type.equalsIgnoreCase("platina")){
			bajajBike = new BajajPlatinaBike();
		}else {
			throw new IllegalArgumentException("invalid Bike type");
		}
		bajajBike.drive();
		return bajajBike;				
	}

	@Override
	public void painting() {
		System.out.println("BangloreBajajFactory.painting()");
		
	}

	@Override
	public void assembling() {
		System.out.println("BangloreBajajFactory.assembling()");
		
	}

	@Override
	public void engineTest() {
	
		System.out.println("BangloreBajajFactory.engineTest()");
	}

	@Override
	public void roadTest() {

		System.out.println("BangloreBajajFactory.roadTest()");
	}
}
