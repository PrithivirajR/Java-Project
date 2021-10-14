package com.java_july_10am_prcte;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Linkedhash_set {

		
		public static void main(String[] args) {
			
			Set<Object> d = new LinkedHashSet<Object>();
			
			d.add(90);
			d.add(91);
			d.add(92.50);
			d.add(95);
			d.add('n');
			d.add("ramu");
			System.out.println(d);
			
			int size = d.size();
			System.out.println(size);
			
			Object remove = d.remove('n');
			System.out.println(d);
			
			boolean contains = d.contains(92.5);
			System.out.println(contains);
			
//			d.clear();
//			System.out.println(d);
			
			Set<Object> d1 = new LinkedHashSet<Object>();
			
			d1.add(56);
			d1.add(58);
			d1.add("Ragul");
			d1.add('r');
			d1.add(50);
			
//			d.addAll(d1);
// 			System.out.println(d);
//			
//			d.retainAll(d1);
//			System.out.println(d);
			
			d.removeAll(d1);
			System.out.println(d);
			
			boolean empty = d.isEmpty();
			System.out.println(empty);
			
			boolean equals = d.equals(d1);
			System.out.println(equals);
			
		}

	}


