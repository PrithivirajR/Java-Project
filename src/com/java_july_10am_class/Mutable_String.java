package com.java_july_10am_class;

public class Mutable_String {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Java");
		StringBuffer s1 = new StringBuffer("Java");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		s1.append(s);
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));


	}

}
