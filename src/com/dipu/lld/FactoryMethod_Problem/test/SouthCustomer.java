package com.dipu.lld.FactoryMethod_Problem.test;


import com.dipu.lld.FactoryMethod_Problem.bike.BajajBike;
import com.dipu.lld.FactoryMethod_Problem.factory.BangloreBajajFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBike bajajBike = BangloreBajajFactory.createBike("pulsor");
		bajajBike.drive();
	}
}
