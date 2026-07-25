package com.dipu.lld.AbstractFactoryPattern_Problem.factory;


import com.dipu.lld.AbstractFactoryPattern_Problem.dao.DBCourseDao;
import com.dipu.lld.AbstractFactoryPattern_Problem.dao.DBStudentDao;
import com.dipu.lld.AbstractFactoryPattern_Problem.dao.IDao;

public class DBDaoFactory {

	public static IDao createDAO(String type) {
		
		IDao dao = null;
		
		if(type.equalsIgnoreCase("student"))
			dao = new DBStudentDao();
		else if(type.equalsIgnoreCase("course"))
			dao = new DBCourseDao();
		else
			throw new IllegalArgumentException("Invalid Dao Type");
		
		return dao;
	}
}
