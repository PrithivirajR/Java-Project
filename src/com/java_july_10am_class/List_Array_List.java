package com.java_july_10am_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Array_List {
	
	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<Object>();
		
		l.add(56);
		l.add(57);
		l.add(56);
		l.add(25.56);
		l.add('n');
		l.add("java");
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(5);
		System.out.println(object);
		
		Object set = l.set(5,"selenium" );
		System.out.println(l);
		
		
		Object remove = l.remove(3);
		System.out.println(l);
		
		int indexOf = l.indexOf(57);
		System.out.println(indexOf);
		
		boolean contains = l.contains("selenium");
		System.out.println(contains);
		
//		l.clear();
//		System.out.println(l);
//		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(56);
		l1.add(57);
		l1.add(56);
		l1.add(25);
//		l.addAll(l1);
//		System.out.println(l1);
//		
//		l.retainAll(l1);
//		System.out.println(l1);
		
		l.removeAll(l1);
		System.out.println(l);
		
		//ascending 
		Collections.sort(l1);
		System.out.println(l1);
		//Descending
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		boolean equals = l.equals(l1);
		System.out.println(equals);

	}
}
