package com.dipu.lld.AbstractFactoryPattern_Solution.test;


import com.dipu.lld.AbstractFactoryPattern_Solution.dao.IDao;
import com.dipu.lld.AbstractFactoryPattern_Solution.factory.DaoFactory;
import com.dipu.lld.AbstractFactoryPattern_Solution.factory.DaoFactoryCreator;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// get Factory through Abstract Factory(super factory)
		DaoFactory daoFactory = DaoFactoryCreator.buildDaoFactory("DB");
		// create DAO classes object
		IDao studentDao = daoFactory.createDao("Student");
		IDao courseDao = daoFactory.createDao("course");
		studentDao.insert();
		System.out.println("----");
		courseDao.insert();
		
	}
}
