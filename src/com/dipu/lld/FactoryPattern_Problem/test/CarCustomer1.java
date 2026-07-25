package com.dipu.lld.FactoryPattern_Problem.test;

import com.dipu.lld.FactoryPattern_Problem.components.BudgetCar;
import com.dipu.lld.FactoryPattern_Problem.components.Car;

public class CarCustomer1 {

	public static void main(String[] args) {
		
		Car bCar = new BudgetCar();
		bCar.assemble();
		bCar.roadTest();
		bCar.drive();
	}
}
