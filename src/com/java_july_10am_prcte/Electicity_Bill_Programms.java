package com.java_july_10am_prcte;

import java.util.Scanner;

public class Electicity_Bill_Programms {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no of consumer electricity details");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Entre the Consumer Service number");
			int no = s.nextInt();
			System.out.println("Entre the Consumed units");
			int u = s.nextInt();
			int amount;
			if (u>1000) {
				System.out.println("The unit charge is 10");
				amount=u*10;
				System.out.println(amount);
				
			} else if (u>500) {
				System.out.println("The unit charge is 5");
				amount=u*5;
				System.out.println(amount);
				
			}else if (u>200) {
				System.out.println("The unit charge is 2");
				amount=u*2;
				System.out.println(amount);	
			}else {
				System.out.println("The unit charge is 1");
				amount=u*1;
				System.out.println(amount);
			}
			
		}
	}

}
