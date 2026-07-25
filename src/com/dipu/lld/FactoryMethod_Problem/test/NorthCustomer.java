package com.dipu.lld.FactoryMethod_Problem.test;

import com.dipu.lld.FactoryMethod_Problem.bike.BajajBike;
import com.dipu.lld.FactoryMethod_Problem.factory.RanchiBajajFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBike bajajBike = RanchiBajajFactory.createBike("pulsor");
		bajajBike.drive();
	}
}
