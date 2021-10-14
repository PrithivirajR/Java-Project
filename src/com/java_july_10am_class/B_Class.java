package com.java_july_10am_class;

public class B_Class extends A_Class {
	
	public static void main(String[] args) {
		
		double d =45;
		
		int a = (int) d; // Narrowing type casting  
		
		B_Class b = new B_Class(); // Child object
		
		A_Class c = new A_Class(); // Parent object
		
		A_Class cb = new B_Class(); // Upcasting 
		
	//	B_Class bc = new A_Class(); // Downcasting --> Not possible in java
		
		
	}

}
