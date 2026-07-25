package com.dipu.lld.TemplateMethodPattern_Solution.recruitment;

public class HireDotnetFresher extends HireFresher{

	
	public boolean conductTechnicalWrittenTest() {
		System.out.println("HireDotnetFresher.conductTechnicalWrittenTest()[DotNet]");

		return true;
	}

	public boolean conductTechnicalInterviewTest() {
		System.out.println("HireDotnetFresher.conductTechnicalInterviewTest([DotNet])");

		return true;
	}
}
