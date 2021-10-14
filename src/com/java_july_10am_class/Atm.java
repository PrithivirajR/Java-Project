package com.java_july_10am_class;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert your card");
		String card = s.nextLine();
		System.out.println(card);
		
		System.out.println("Enter your pin");
		int pin = s.nextInt();
		System.out.println(pin);
		
		System.out.println("Select your Account type");
		String account = s.next();
		System.out.println(account);
	}

}
