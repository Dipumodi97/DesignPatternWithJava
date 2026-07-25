package com.dipu.lld.AbstractFactoryPattern_Solution.factory;

import com.dipu.lld.AbstractFactoryPattern_Solution.dao.ExcelCourseDao;
import com.dipu.lld.AbstractFactoryPattern_Solution.dao.ExcelStudentDao;
import com.dipu.lld.AbstractFactoryPattern_Solution.dao.IDao;

// Factory pattern / Simple Factory Pattern
public class ExcelDaoFactory implements DaoFactory{

	public IDao createDao(String type) {
		
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
