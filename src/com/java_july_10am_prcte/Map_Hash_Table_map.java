package com.java_july_10am_prcte;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Map_Hash_Table_map {
	
	public static void main(String[] args) {
		

		Map<Integer, String> m = new Hashtable<Integer, String>();
		
		m.put(1,"ramu");
		m.put(2,"padma");
		m.put(3,"prithivi");
		m.put(3,"viji");
		m.put(4,"fam");
		m.put(5,"together");
		m.put(6, "we");
		m.put(7, "won");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		String string = m.get(3);
		System.out.println(string);
		
		Set<Integer> keySet = m.keySet();  
		System.out.println(keySet);
		
		Collection<String> values = m.values();  
		System.out.println(values);
		
		boolean containsKey = m.containsKey(3);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("arun");
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
