package com.dipu.lld.AbstractFactoryPattern_Solution.factory;

import com.dipu.lld.AbstractFactoryPattern_Solution.dao.DBCourseDao;
import com.dipu.lld.AbstractFactoryPattern_Solution.dao.DBStudentDao;
import com.dipu.lld.AbstractFactoryPattern_Solution.dao.IDao;

public class DBDaoFactory implements DaoFactory{

	public IDao createDao(String type) {
		
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
