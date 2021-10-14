package com.java_july_10am_prcte;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total Armstrong numbers ");
		int g = s.nextInt();
		System.out.println();

		for (int i = 0; i < g; i++) {
			System.out.println("Enter the Numbers of digits");
			int d = s.nextInt();

			System.out.println("Enter the number");
			int n = s.nextInt();

			int rem1 = 0, ans = 0;
			int t = n;

			while (n > 0) {

				rem1 = n % 10;
				rem1 = (int) Math.pow(rem1, d);
				ans = ans + rem1;
				n /= 10;
			}
			if (t == ans) {

				System.out.println("The number is Armstrong number");

			} else {

				System.out.println("The number id not Amrstrong number");
			}
		}
	}
}