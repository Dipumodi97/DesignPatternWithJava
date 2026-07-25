package com.dipu.lld.FactoryPattern_Solution.factory;

import com.dipu.lld.FactoryPattern_Solution.components.BudgetCar;
import com.dipu.lld.FactoryPattern_Solution.components.Car;
import com.dipu.lld.FactoryPattern_Solution.components.LuxuryCar;
import com.dipu.lld.FactoryPattern_Solution.components.SportsCar;

// This entire class is Factory Pattern
public class CarFactory {
	
	// static Factory Method
	public static Car createCar(String type) {

		Car car =  null;
		
		if(type.equalsIgnoreCase("budget")) {
			car =  new BudgetCar();
		}else if(type.equalsIgnoreCase("luxury")) {
			car =  new LuxuryCar();
		}else if(type.equalsIgnoreCase("sports")) {
			car = new SportsCar();
		}else {
			throw new IllegalArgumentException("Invalid Car Type");
		}
		car.assemble();
		car.roadTest();
		car.drive();
		return car;
	}
}
