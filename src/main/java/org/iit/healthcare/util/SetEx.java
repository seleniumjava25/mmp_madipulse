package org.iit.healthcare.util;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	
	public static void main(String[] args) {
		
 
		
		Set<String> hSet = new HashSet<String>();
		hSet.add("Banana");
		hSet.add("Apple");
		hSet.add("Cherry");
	 
		System.out.println("------------------------------HashSet((No Order))-------------------");
 
		for(String s: hSet) 
		{
			System.out.println("Fruits : " + s);
		}
		
		hSet = new LinkedHashSet<String>();
		hSet.add("Banana");
		hSet.add("Apple");
		hSet.add("Cherry");
	 
		System.out.println("------------------------------LinkedHashSet(Insertion Order)-------------------");
 
		for(String s: hSet) 
		{
			System.out.println("Fruits : " + s);
		}
		 
		hSet = new TreeSet<String>();
		hSet.add("Banana");
		hSet.add("Apple");
		hSet.add("Cherry");
	 
		System.out.println("------------------------------TreeSet(Sorted Order)-------------------");
 
		for(String s: hSet) 
		{
			System.out.println("Fruits : " + s);
		}
	}

}




















/*
 * hSet = new LinkedHashSet<String>();
		
		hSet.add("Banana");
		hSet.add("Apple");
		hSet.add("Cherry");
		 
		System.out.println("--------------LinkedHashSet(Insertion Order)---------------------------");
 
		for(String s: hSet) 
		{
			System.out.println("Fruits : " + s);
		}
		
		hSet = new TreeSet<String>();
		hSet.add("Banana");
		hSet.add("Apple");
		hSet.add("Cherry");
		 
		System.out.println("--------------TreeSet (Sorted Order)---------------------------");
 
		for(String s: hSet) 
		{
			System.out.println("Fruits : " + s);
		}
		
		*/
