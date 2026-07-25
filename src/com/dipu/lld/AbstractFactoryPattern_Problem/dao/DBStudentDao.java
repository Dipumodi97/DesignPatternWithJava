package com.dipu.lld.AbstractFactoryPattern_Problem.dao;

public class DBStudentDao implements IDao {

	@Override
	public void insert() {
		System.out.println("DBStudentDao.insert():: inserting student details in DB");
	}

}
