package org.iit.healthcare.mmp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties loadProperties(String fileName) throws IOException {
		
		
		String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\"+fileName; 
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("baseUrl"));
		 
		return prop;
	}
	 

}
