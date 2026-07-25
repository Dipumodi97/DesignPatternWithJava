package com.dipu.lld.AbstractFactoryPattern_Problem.factory;


import com.dipu.lld.AbstractFactoryPattern_Problem.dao.ExcelCourseDao;
import com.dipu.lld.AbstractFactoryPattern_Problem.dao.ExcelStudentDao;
import com.dipu.lld.AbstractFactoryPattern_Problem.dao.IDao;

// Factory pattern / Simple Factory Pattern
public class ExcelDaoFactory {

	public static IDao createDAO(String type) {
		
		IDao dao = null;
		
		if(type.equalsIgnoreCase("student"))
			dao = new ExcelStudentDao();
		else if(type.equalsIgnoreCase("course"))
			dao = new ExcelCourseDao();
		else
			throw new IllegalArgumentException("Invalid Dao Type");
		
		return dao;
	}
}
