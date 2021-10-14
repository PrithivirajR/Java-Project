package com.java_july_10am_class;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_Linked_List {
	
	public static void main(String[] args) {
		
		List <Object> l = new LinkedList<Object>();
		
		l.add(50);
		l.add(51);
		l.add(51);
		l.add(20.30);
		l.add('r');
		l.add("java");
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(3);
		System.out.println(object);
		
		Object set = l.set(5,"Selenium");
		System.out.println(l);
		
		Object remove = l.remove(3);
		System.out.println(l);
		
		int indexOf = l.indexOf('r');
		System.out.println(indexOf);
		
		boolean contains = l.contains("Selenium");
		System.out.println(contains);
		
//		l.clear();
//		System.out.println(l);
		
		List <Integer> l1 = new LinkedList<Integer>();
		l1.add(55);
		l1.add(59);
		l1.add(57);
		l1.add(56);
		l.addAll(l1);
		System.out.println(l);
		
//		l.retainAll(l1);
//		System.out.println(l);
//		
//		l.removeAll(l1);
//		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		boolean equals = l.equals(l1);
		System.out.println(equals);
}

}
