package com.dipu.lld.FactoryPattern_Solution.test;

import com.dipu.lld.FactoryPattern_Solution.components.Car;
import com.dipu.lld.FactoryPattern_Solution.components.LuxuryCar;

public class CarCustomer2 {

	public static void main(String[] args) {
		Car lCar = new LuxuryCar();
		lCar.assemble();
		lCar.roadTest();
		lCar.drive();
	}
}
