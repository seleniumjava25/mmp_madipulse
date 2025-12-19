package org.iit.healthcare.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {

		Map<String, String> data = new HashMap<String, String>();
		data.put("username", "John");
		data.put("email", "john@example.com");
		data.put("status", "Active");
		data.put("role", "Admin");

		System.out.println(data);
		System.out.println("---- HashMap (No Order) ----");
		for (String key : data.keySet()) 
		{
			System.out.println(key + " : " + data.get(key));
		}

		data = new LinkedHashMap<String, String>();
		data.put("username", "John");
		data.put("email", "john@example.com");
		data.put("status", "Active");
		data.put("role", "Admin");

		System.out.println(data);
		System.out.println("---- LinkedHashMap (Insertion Order) ----");
		for (String key : data.keySet()) 
		{
			System.out.println(key + " : " + data.get(key));
		}
		data = new TreeMap<String, String>();
		data.put("username", "John");
		data.put("email", "john@example.com");
		data.put("status", "Active");
		data.put("role", "Admin");

		System.out.println(data);
		System.out.println("---- TreeMap (Sorted Order based on the keys) ----");
		for (String key : data.keySet()) 
		{
			System.out.println(key + " : " + data.get(key));
		}
	 
	}
}














/*
data = new LinkedHashMap<String, String>();
data.put("username", "John");
data.put("email", "john@example.com");
data.put("status", "Active");
data.put("role", "Admin");

System.out.println(data);


System.out.println("---- LinkedHashMap (Insertion Order) ----");
for (String key : data.keySet()) {
	System.out.println(key + " : " + data.get(key));
}

data = new TreeMap<String, String>();
data.put("username", "John");
data.put("email", "john@example.com");
data.put("status", "Active");
data.put("role", "Admin");
System.out.println(data);
System.out.println("---- TreeMap (Sorted by Key) ----");
for (String key : data.keySet()) 
{
	System.out.println(key + " : " + data.get(key));
}*/