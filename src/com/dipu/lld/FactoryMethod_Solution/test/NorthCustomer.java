package com.dipu.lld.FactoryMethod_Solution.test;

import com.dipu.lld.FactoryMethod_Solution.bike.BajajBike;
import com.dipu.lld.FactoryMethod_Solution.factory.RanchiBajajFactory;
import com.dipu.lld.FactoryMethod_Solution.method.BajajBikeFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory bajajBikeFactory = new RanchiBajajFactory();
		BajajBike bajajBike = bajajBikeFactory.orderBike("discover");
		bajajBike.drive();
	}
}
