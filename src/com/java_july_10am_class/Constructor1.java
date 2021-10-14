package com.java_july_10am_class;

public class Constructor1 {

	public Constructor1() {	//Default or non parameter
		System.out.println("Data");
	}
	
	public Constructor1(int age) { //parameter 
		System.out.println(age);
	}
	public Constructor1(String name) {
		System.out.println("Java");
	}
	
	public static void main(String[] args) {
		Constructor1 c = new Constructor1();
		Constructor1 c1 = new Constructor1(25);
		Constructor1 c2 = new Constructor1("java");
			
	}
}
