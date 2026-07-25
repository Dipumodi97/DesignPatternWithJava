package com.dipu.lld.TemplateMethodPattern_Solution.test;

import com.dipu.lld.TemplateMethodPattern_Solution.factory.HireFresherFactory;
import com.dipu.lld.TemplateMethodPattern_Solution.recruitment.HireFresher;

public class TechnicalRecruiter {

	public static void main(String[] args) {
		HireFresher fresher  = HireFresherFactory.getInstance("java");
		
	   	boolean result = fresher.fresherRecruitmentDriver();
	
		System.out.println("Fresher Recruited :: "+result);
	}
}
