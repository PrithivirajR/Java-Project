package com.java_july_10am_class;

public class Immutable_String {

	public static void main(String[] args) {

		String s = "java";
		String s1 = "java";
		


		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));

		s = s + s1;
		
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

	}

}
