package com.java_july_10am_prcte;

public class Strings {
	
	public static void main(String[] args) {
		
		String s = "welcome to java";
			
		int length = s.length();	// 1 Returns to the string values
		System.out.println(length);
		
		boolean equals = s.equals("welcome to java");	// 2 Check the wheather the values 
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("WElcOME TO JAVA"); // 3
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();	// 4
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();	// 5
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("w");	// 6
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("j");	 // 7
		System.out.println(endsWith);
		
		boolean contains = s.contains("to java");	// 8
		System.out.println(contains);
		
		int indexOf = s.indexOf('j');	// 9
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('t');	// 10
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(11);	 // 11
		System.out.println(charAt);
		
		String replace = s.replace("to", "the");	// 12
		System.out.println(replace);
		
		String substring = s.substring(3);	 // 13
		System.out.println(substring);
		
		boolean empty = s.isEmpty();	// 14 Weather string is empty or not
		System.out.println(empty);
		
		String[] split = s.split(" ");	  // 15
		for (String string : split) {
			System.out.println(string);
		}
		
		String a = "    java	";	     // 16
		String trim = a.trim();
		System.out.println(trim);
		
		String concat = s.concat(a);		// 17
		System.out.println(concat);

		}
		
		
	}


