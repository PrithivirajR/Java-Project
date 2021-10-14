package com.java_july_10am_prcte;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Hashmap_collection {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1,"java");
		m.put(2,"hello");
		m.put(3,"welcome");
		m.put(3,"b");
		m.put(null,"frame");
		m.put(null,"work");
		m.put(4, null);
		m.put(5, null);
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		String string = m.get(3);
		System.out.println(string);
		
		Set<Integer> keySet = m.keySet(); // get the key values 
		System.out.println(keySet);
		
		Collection<String> values = m.values(); // get the values 
		System.out.println(values);
		
		boolean containsKey = m.containsKey(3);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("raja");
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
