package com.java_july_10am_prcte;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total numbers");
		int t = s.nextInt();
		System.out.println();

		for (int i = 0; i < t; i++) {

			System.out.println("Enter the number");
			int num = s.nextInt();

			if (num % 2 == 0) {

				System.out.println("The given number id Even");

			} else {

				System.out.println("The given number id Odd");

			}
			System.out.println();

		
		}

	}
}
