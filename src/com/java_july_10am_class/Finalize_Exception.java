package com.java_july_10am_class;

public class Finalize_Exception {

	public Finalize_Exception() {
		
		System.out.println("java");
		System.out.println("Selenium");
	}
	public Finalize_Exception(int a, int b) {
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) throws Throwable {
		
		Finalize_Exception f = new Finalize_Exception();
		f.finalize();
		Finalize_Exception f1 = new Finalize_Exception(10,20);
		f1.finalize();
	}
	
	
}
