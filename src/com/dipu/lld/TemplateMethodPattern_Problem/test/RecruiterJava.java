package com.dipu.lld.TemplateMethodPattern_Problem.test;

import com.dipu.lld.TemplateMethodPattern_Problem.recruitment.HireJavaFresher;

public class RecruiterJava {

	public static void main(String[] args) {
		HireJavaFresher hireJavaFresher = new HireJavaFresher();
		 boolean flag = true;
		if(!hireJavaFresher.conductAptitudeTest())
			flag = false;
		   if(!hireJavaFresher.conductGroupDiscussionTest())
			   flag = false;
		      if(!hireJavaFresher.conductJavaTechnicalTest())
		    	  flag = false;
		         if(!hireJavaFresher.conductJavaWrittenTest())
		        	 flag = false;
		            if(!hireJavaFresher.conductHRTest())
		            	flag = false;
		            
		   if(flag)
			   System.out.println("Java Fresher Recruited");
		   else
			   System.out.println("Not Selected ");
	}
}
