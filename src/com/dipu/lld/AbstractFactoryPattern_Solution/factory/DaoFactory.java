package com.dipu.lld.AbstractFactoryPattern_Solution.factory;

import com.dipu.lld.AbstractFactoryPattern_Solution.dao.IDao;

public interface DaoFactory {

	public IDao createDao(String type);
}
