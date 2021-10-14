package com.java_july_10am_prcte;

import java.util.Set;
import java.util.TreeSet;

public class Set_Tree_Set {

	public static void main(String[] args) {
		
		Set<Object> l = new TreeSet<Object>();
		
		l.add(90);
		l.add(91);
		l.add(92);
		l.add(95);
//		l.add('n');
//		l.add("ramu");
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object remove = l.remove(90);
		System.out.println(l);
		
		boolean contains = l.contains(90);
		System.out.println(contains);
		
//		d.clear();
//		System.out.println(d);
//		
		Set<Integer> d1 = new TreeSet<Integer>();
		
		d1.add(56);
		d1.add(58);
		d1.add(50);
		
////		l.addAll(d1);
////			System.out.println(d);
////		
////		l.retainAll(d1);
////		System.out.println(d);
		
		l.removeAll(d1);
		System.out.println(l);
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		boolean equals = l.equals(d1);
		System.out.println(equals);
}
}
