package org.iit.healthcare.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("James", 15);
		map.put("John", 20);
		map.put("Williams", 18);
		map.put("Williams", 25);

		System.out.println("Size of the map: " + map.size());

		System.out.println("Marks of Williams: " + map.get("Williams"));
		
		//fetch all the values from the map
		//fetch all the keys from the map
		//store all the keys in the set
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}

		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}
		 

		 

	}
}
