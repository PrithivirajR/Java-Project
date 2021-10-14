package com.java_july_10am_class;

public class Child_Class extends Parent_Class{

	@Override
	public void car(String car) {
		super.car(car);
	}
	@Override
	public void cash(int a) {
		super.cash(a);
	}
	
	public void bike() {
		System.out.println("Honda");
	}
	
	public static void main(String[] args) {
		Child_Class c = new Child_Class();
		c.car("bmw");
		c.cash(10000);
		c.bike();
	}
}
