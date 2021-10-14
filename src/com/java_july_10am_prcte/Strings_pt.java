package com.java_july_10am_prcte;

public class Strings_pt {
	
public static void main(String[] args) {
		
		String s = "I am prithiviraj from Tirupur";
		
		int length = s.length();	// 1 
		System.out.println(length);
		
		boolean equals = s.equals("I am prithiviraj frOm Tirupur");	// 2
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("I Am Prithiviraj From Tirupur"); // 3
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();	// 4
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();	// 5
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("p");	// 6
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("i");	 // 7
		System.out.println(endsWith);
		
		boolean contains = s.contains("prithiviraj");	// 8
		System.out.println(contains);
		
		int indexOf = s.indexOf('o');	// 9
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('r');	// 10
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(20);	 // 11
		System.out.println(charAt);
		
		String replace = s.replace("Tirupur", "Chennai");	// 12
		System.out.println(replace);
		
		String substring = s.substring(4);	 // 13
		System.out.println(substring);
		
		boolean empty = s.isEmpty();	// 14 Weather string is empty or not
		System.out.println(empty);
		
		String[] split = s.split(" ");	  // 15
		for (String string : split) {
			System.out.println(string);
		}
		
		String a = "	Tamil nadu	";	     // 16
		String trim = a.trim();
		System.out.println(trim);
		
		String concat = s.concat(a);		// 17
		System.out.println(concat);

		}
		

}
