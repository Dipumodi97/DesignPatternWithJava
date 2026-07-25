package com.dipu.lld.TemplateMethodPattern_Problem.test;

import com.dipu.lld.TemplateMethodPattern_Problem.recruitment.HireDotnetFresher;

public class RecruiterDotNet {

	public static void main(String[] args) {
		HireDotnetFresher hireDotNetFresher = new HireDotnetFresher();
		 boolean flag = true;
		if(!hireDotNetFresher.conductAptitudeTest())
			flag = false;
		   if(!hireDotNetFresher.conductGroupDiscussionTest())
			   flag = false;
		      if(!hireDotNetFresher.conductDotnetTechnicalTest())
		    	  flag = false;
		         if(!hireDotNetFresher.conductDotnetWrittenTest())
		        	 flag = false;
		            if(!hireDotNetFresher.conductHRTest())
		            	flag = false;
		            
		   if(flag)
			   System.out.println("DotNet Fresher Recruited");
		   else
			   System.out.println("Not Selected ");
	}
}
