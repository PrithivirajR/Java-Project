package com.java_july_10am_class;

public class Variables {

	static int b = 20; // class variables 

	public void add() {
		int a = 10; // local variables
		System.out.println(a);
	}

	public static void sub() {
		
		System.out.println(b);
	}

	public static void divi() {
		int c = 10;	//static variable
		System.out.println(c);
	}
	public static void main(String[] args) {
		Variables v = new Variables();
		v.add();
		sub();
		divi();
		
	}
}
