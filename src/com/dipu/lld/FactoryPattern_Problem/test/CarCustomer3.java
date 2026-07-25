package com.dipu.lld.FactoryPattern_Problem.test;

import com.dipu.lld.FactoryPattern_Problem.components.Car;
import com.dipu.lld.FactoryPattern_Problem.components.SportsCar;

public class CarCustomer3 {

	public static void main(String[] args) {
		Car sCar = new SportsCar();
		sCar.assemble();
		sCar.roadTest();
		sCar.drive(); 
	}
}
