package com.java_july_10am_prcte;

import java.util.HashSet;
import java.util.Set;

public class Set_Hash_List {
	
	public static void main(String[] args) {
		
		Set<Object> d = new HashSet<Object>();
		
		d.add(null);
		d.add(91.60);
		d.add(90.50);
		d.add(99.50);
		d.add('r');
		d.add("prithivi");
		System.out.println(d);
		
		int size = d.size();
		System.out.println(size);
		
		Object remove = d.remove('r');
		System.out.println(d);
		
		boolean contains = d.contains(91.60);
		System.out.println(contains);
		
//		d.clear();
//		System.out.println(d);
		
		Set<Object> d1 = new HashSet<Object>();
		
		d1.add(56);
		d1.add(58);
		d1.add("Selenium");
		d1.add('p');
		d1.add(50);
		
//		d.addAll(d1);
//		System.out.println(d);
//	
//		d.retainAll(d1);
//		System.out.println(d);
		
		d.removeAll(d1);
		System.out.println(d);
		
		boolean empty = d.isEmpty();
		System.out.println(empty);
		
		boolean equals = d.equals(d1);
		System.out.println(equals);
		
	}

}
