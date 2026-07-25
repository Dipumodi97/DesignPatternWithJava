package com.dipu.lld.FactoryMethod_Problem.factory;

import com.dipu.lld.FactoryMethod_Problem.bike.BajajBike;
import com.dipu.lld.FactoryMethod_Problem.bike.BajajDiscoverBike;
import com.dipu.lld.FactoryMethod_Problem.bike.BajajPlatinaBike;
import com.dipu.lld.FactoryMethod_Problem.bike.BajajPulsorBike;

// Factory Pattern-1
public class BangloreBajajFactory {

	public static BajajBike createBike(String type) {
		
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
		
		bajajBike.assembling();
		bajajBike.painting();
		bajajBike.engineTest();
		bajajBike.roadTest();
		bajajBike.drive();
		return bajajBike;				
	}
}
