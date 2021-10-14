package com.java_july_10am_class;

public class Bank {


public void bank_details(int id) {
		
		System.out.println(id);
	}
public void bank_details(String name) {
	
	System.out.println(name);
}
public void bank_details(char loc) {
	
	System.out.println(loc);
}
public void bank_details(long b) {
		
		System.out.println(b);
	
	
}

public static void main(String[] args) {
	Bank b = new Bank();
	b.bank_details(741);
	b.bank_details("Arun");
	b.bank_details("a");
	b.bank_details(354534);
}
}
