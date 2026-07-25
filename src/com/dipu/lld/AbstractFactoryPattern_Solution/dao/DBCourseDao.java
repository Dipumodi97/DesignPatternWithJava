package com.dipu.lld.AbstractFactoryPattern_Solution.dao;

public class DBCourseDao implements IDao {

	@Override
	public void insert() {
		System.out.println("DBCourseDao.insert():: inserting course details in DB");
	}

}
