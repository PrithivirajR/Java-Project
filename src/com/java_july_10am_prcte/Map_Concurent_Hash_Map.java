package com.java_july_10am_prcte;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class Map_Concurent_Hash_Map {
	
	public static void main(String[] args) {

		Map<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		
		m.put(1,"i");
		m.put(2,"am");
		m.put(3,"prithiviraj");
		m.put(3,"from");
		m.put(4,"tirupur");
		m.put(5,"tamilnadu");
		m.put(6, "india");
		m.put(7, "country");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		String string = m.get(7);
		System.out.println(string);
		
		Set<Integer> keySet = m.keySet();  
		System.out.println(keySet);
		
		Collection<String> values = m.values();  
		System.out.println(values);
		
		boolean containsKey = m.containsKey(3);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("india");
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
	}


