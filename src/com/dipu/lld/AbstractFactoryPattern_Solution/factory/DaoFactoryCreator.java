package com.dipu.lld.AbstractFactoryPattern_Solution.factory;

// abstract Factory pattern one of the several Factory classes
public class DaoFactoryCreator {

	public static DaoFactory buildDaoFactory(String type) {
		DaoFactory factory = null;
		
		if(type.equalsIgnoreCase("DB"))
			factory = new DBDaoFactory();
		else if(type.equalsIgnoreCase("Excel"))
			factory = new ExcelDaoFactory();
		else 
			throw new IllegalArgumentException("Invalid Factory Type");
		
		return factory;
	}
}
