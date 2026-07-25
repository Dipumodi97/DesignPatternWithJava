package com.dipu.lld.FactoryPattern_Problem.test;

import com.dipu.lld.FactoryPattern_Problem.components.Car;
import com.dipu.lld.FactoryPattern_Problem.components.LuxuryCar;

public class CarCustomer2 {

	public static void main(String[] args) {
		Car lCar = new LuxuryCar();
		lCar.assemble();
		lCar.roadTest();
		lCar.drive();
	}
}
