package com.dipu.lld.FactoryPattern_Solution.test;

import com.dipu.lld.FactoryPattern_Solution.components.Car;
import com.dipu.lld.FactoryPattern_Solution.components.SportsCar;

public class CarCustomer3 {

	public static void main(String[] args) {
		Car sCar = new SportsCar();
		sCar.assemble();
		sCar.roadTest();
		sCar.drive(); 
	}
}
