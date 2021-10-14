package com.java_july_10am_prcte;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Map_Linkedhash {
	
	public static void main(String[] args) {
	

	Map<Integer, String> m = new LinkedHashMap<Integer, String>();
	
	m.put(1,"hello");
	m.put(2,"java");
	m.put(3,"selenium");
	m.put(3,"with");
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
	
	boolean containsValue = m.containsValue("praveen");
	System.out.println(containsValue);
	
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry);
	}
	}
}
