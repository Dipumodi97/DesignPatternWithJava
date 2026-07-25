package com.dipu.lld.AbstractFactoryPattern_Problem.dao;

public class ExcelStudentDao implements IDao {

	@Override
	public void insert() {
		System.out.println("ExcelStudentDao.insert():: inserting studentDetails details in Excel");
	}

}
