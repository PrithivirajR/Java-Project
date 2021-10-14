package com.java_july_10am_class;

public class Abstraction1 extends Abstraction {

	@Override
	public void emi() {
		System.out.println("bike");
	}

	@Override
	public void cod() {
		super.cod();
	}
public static void main(String[] args) {
	Abstraction1 a = new Abstraction1();
	a.emi();
	a.cod();
}
}
