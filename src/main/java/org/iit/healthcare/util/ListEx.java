package org.iit.healthcare.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListEx {
	//ArrayList, LinkedList, Vector, Stack
	
	public static void main(String[] args) {
		
		//add() - add elements to the list
		//get(index)-get the value from the list
		//size()-size of the list
		
		//SuperClass is able to hold the object of SubClass
		//Interface List is able to hold the object of class implementing that interface
		
		//WebDriver driver = new ChromeDriver();
		
		String s="Selenium";
		
		String s1 ="WebDriver";
		
//		String strArr[]= new String[10];
//		
//		strAr[0]="Selenium";
//		
//		return strArr;
		
		
		List<String>  alistEx = new ArrayList<String>();
		alistEx.add("Selenium");
		alistEx.add("WebDriver");
		alistEx.add("Java");
		alistEx.add("Selenium");
		alistEx.add("Selenium");
		alistEx.add("Selenium");
		alistEx.add("Selenium");
		alistEx.add("Selenium");
		alistEx.add("Selenium");
		alistEx.add("ABC");
		
	 	
		alistEx.remove(3);
		alistEx.add(4, "Hello");
		Collections.sort(alistEx);
		
		System.out.println("Size of the list: " + alistEx.size());
		
//		System.out.println("First Language: " + alistEx.get(0).length());//index 0
//		System.out.println("Trim the String"+ alistEx.get(0).trim());
		
		for(int i=0;i<alistEx.size();i++) 
		{
			System.out.println("Language " + (i+1) + ": " + alistEx.get(i));
		}
		
		
	}

}
