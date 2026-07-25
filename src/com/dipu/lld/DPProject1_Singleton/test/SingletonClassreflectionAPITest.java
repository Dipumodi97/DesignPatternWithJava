package com.dipu.lld.DPProject1_Singleton.test;

import com.dipu.lld.DPProject1_Singleton.sdp.Printer;

import java.lang.reflect.Constructor;

public class SingletonClassreflectionAPITest {

	public static void main(String[] args) {
		try {
			// Load the singleton java class
			Class c = Class.forName("com.dipu.sdp.Printer");
			// (OR)

			// Class c = Printer.class;

			// get all the declared Constructor of the class

			Constructor cons[] = c.getDeclaredConstructors();

			// get access to private constructor(if any)

			cons[0].setAccessible(true);
			// create objects for singleton java class using access private constructor

			Printer p1 = (Printer) cons[0].newInstance();
			Printer p2 = (Printer) cons[0].newInstance();

			Printer p = Printer.getInstance();/// using static factory method
			System.out.println(p.hashCode() + " " + p1.hashCode() + " " + p2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
