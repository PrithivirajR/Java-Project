package com.java_july_10am_prcte;
import java.util.Scanner;
public class Atm_Pro_Scanner {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert your card ");
		String name = s.nextLine();
		System.out.println(name);
		
		System.out.println("Select your language");
		String lang = s.next();
		System.out.println(lang);
		
		System.out.println("Enter your pin number");
		int pin = s.nextInt();
		System.out.println(pin);
		
		System.out.println("Select your Account type");
		String account = s.next();
		System.out.println(account);
		
		System.out.println("Select your mode of your Transacation");
		String mode = s.next();
		System.out.println(mode);
		
		System.out.println("Do you want recepit in this transaction");
		String recepit = s.next();
		System.out.println(recepit);
		
		System.out.println("Collect your mode of transaction and recepit");
		String collect = s.next();
		System.out.println(collect);
		
		System.out.println("Thanking you for using this Atm");
		String thanks = s.next();
	
	}
}
