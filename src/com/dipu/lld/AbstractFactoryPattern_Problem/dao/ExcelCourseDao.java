package com.dipu.lld.AbstractFactoryPattern_Problem.dao;

public class ExcelCourseDao implements IDao {

	@Override
	public void insert() {
		System.out.println("ExcelCourseDao.insert():: inserting course details in Excel");
	}

}
