package com.dipu.lld.DPProject1_Singleton.test;

import com.dipu.lld.DPProject1_Singleton.sdp.Printer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonClassSerializationAndDesrializationTest3 {

	public static void doSerialization(Printer printer) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))){
			oos.writeObject(printer);
			oos.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Object Serialization is Done");
	}
	
	public static Printer doDeserialization() {
		Printer p = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))){
			 p = (Printer)ois.readObject();
			// System.out.println("Deserialization Done");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return p;
		
	}
	public static void main(String[] args) {
		Printer p = Printer.getInstance();
		doSerialization(p);
		
		Printer p2 = doDeserialization();
		Printer p3 = doDeserialization();
		
		System.out.println(p.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
		
	}
}
