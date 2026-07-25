package com.dipu.lld.TemplateMethodPattern_Solution.factory;

import com.dipu.lld.TemplateMethodPattern_Solution.recruitment.HireDotnetFresher;
import com.dipu.lld.TemplateMethodPattern_Solution.recruitment.HireFresher;
import com.dipu.lld.TemplateMethodPattern_Solution.recruitment.HireJavaFresher;
import com.dipu.lld.TemplateMethodPattern_Solution.recruitment.HireUITechnologiesFresher;

public class HireFresherFactory {

	// Static factory Pattern
	public  static HireFresher getInstance(String type) {
		
		HireFresher fresher = null;
		
		if (type.equalsIgnoreCase("java")) {
			fresher = new HireJavaFresher();
		}else if(type.equalsIgnoreCase("DotNet")) {
			fresher = new HireDotnetFresher();
		}else if(type.equalsIgnoreCase("UI")) {
			fresher = new HireUITechnologiesFresher();
		}else {
			throw new IllegalArgumentException("Invalid Fresher Type ");
		}
		return fresher;
	}
}
