package com.dipu.lld.AbstractFactoryPattern_Problem.test;


import com.dipu.lld.AbstractFactoryPattern_Problem.dao.IDao;
import com.dipu.lld.AbstractFactoryPattern_Problem.factory.DBDaoFactory;
import com.dipu.lld.AbstractFactoryPattern_Problem.factory.ExcelDaoFactory;

public class AppProblemTest {

	public static void main(String[] args) {
		IDao studentDao = DBDaoFactory.createDAO("student");
		IDao courseDao = ExcelDaoFactory.createDAO("course");
		
		studentDao.insert();
		System.out.println("------");
		courseDao.insert();
		
		
	}
}
