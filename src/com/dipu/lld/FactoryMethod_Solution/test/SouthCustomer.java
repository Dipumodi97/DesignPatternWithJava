package com.dipu.lld.FactoryMethod_Solution.test;

import com.dipu.lld.FactoryMethod_Solution.bike.BajajBike;
import com.dipu.lld.FactoryMethod_Solution.factory.BangloreBajajFactory;
import com.dipu.lld.FactoryMethod_Solution.factory.method.BajajBikeFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory bajajBikeFactory = new BangloreBajajFactory();
		BajajBike bajajBike = bajajBikeFactory.orderBike("pulsor");
		bajajBike.drive();
	}
}
