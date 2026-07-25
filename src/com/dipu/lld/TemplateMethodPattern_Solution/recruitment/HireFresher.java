package com.dipu.lld.TemplateMethodPattern_Solution.recruitment;

public abstract class HireFresher {

	public boolean conductAptitudeTest() {
		System.out.println("HireFresher.conductAptitudeTest()");
		return true;
	}
	
	public boolean conductGroupDiscussionTest() {
		System.out.println("HireFresher.conductGroupDiscussionTest()");
		return true;
	}
	
	public abstract boolean conductTechnicalWrittenTest();
	public abstract boolean conductTechnicalInterviewTest();
	
	public boolean conductHRTest() {
		System.out.println("HireFresher.conductHRTest()");
		return true;
	}
	
	// Template method  DP defining the algorithm/Skeleton to complete the task.
	public boolean fresherRecruitmentDriver() {
		boolean result = conductAptitudeTest();
		
		if(result)
			result = conductGroupDiscussionTest();
		if(result)
			result = conductTechnicalInterviewTest();
		if(result)
			result = conductTechnicalWrittenTest();
		if(result)
			result = conductHRTest();
		
		return result;
	}
}
