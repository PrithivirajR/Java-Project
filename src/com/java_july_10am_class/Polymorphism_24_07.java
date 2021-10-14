package com.java_july_10am_class;

public class Polymorphism_24_07 {
	public void method_overloaded() {
		
		System.out.println("Data type");
	}
	public void method_overloaded(int a) {
		
		System.out.println(a);
	}
	public void method_overloaded(String name) {
		
		System.out.println(name);
	}
	public void method_overloaded(int a,int b) {
		
		System.out.println(a*b);
		
	
}
	public static void main(String[] args) {
		
		Polymorphism_24_07 p = new Polymorphism_24_07();
		p.method_overloaded();
		p.method_overloaded(12);
		p.method_overloaded("Dta");
		p.method_overloaded(10,24);
	}
}
