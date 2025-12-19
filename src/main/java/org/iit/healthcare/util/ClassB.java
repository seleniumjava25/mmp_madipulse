package org.iit.healthcare.util;

import java.io.IOException;
import java.util.Properties;

import org.iit.healthcare.mmp.ConfigReader;

public class ClassB  {

	public static void main(String[] args) throws IOException {
		
		Properties prop = ConfigReader.loadProperties("mmp_global.properties");
		Properties qaProp = ConfigReader.loadProperties("mmp_qa.properties");
		
		System.out.println("values" + prop);
		System.out.println(qaProp);
		
		prop.putAll(qaProp);
		
		System.out.println("Merged values" + prop);
		
	}
}
