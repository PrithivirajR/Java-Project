package com.java_july_10am_prcte;

public class Bank {
	

	public Bank(String name, String name1) {
		
		System.out.println("The bank name is " + name 
				+ "The location of the bank is" + name1);
	}

	public Bank(int id) {
		System.out.println("The bank id is " + id);
	}

	public Bank(int b, int c) {
		
		System.out.println("Total employers in the bank are " + b 
				+ " Total manegar in the bank is" + c);
	}

	public Bank(String name, long d) {
		
		System.out.println("Total Accounts in the " + name + "Bank is " + d);
	}

	public static void main(String[] args) {
		
		Bank b1 = new Bank("City union bank","Tirupur");
		Bank b2 = new Bank(15002147);
		Bank b3 = new Bank(25, 2);
		Bank b4 = new Bank("City union bank", 2502);

	}
}
