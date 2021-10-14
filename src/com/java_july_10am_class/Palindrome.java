package com.java_july_10am_class;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total numbers ");
		int g = s.nextInt();
		System.out.println();
		for (int i = 0; i < g; i++) {
			
			int rem = 0, ans = 0;
			System.out.println("Enter the number");
			int num = s.nextInt();

			int t = num;
			while (num > 0) {
				rem = num % 10;
				ans = (ans * 10) + rem;
				num /= 10;
			}
			if (t == ans) {

				System.out.println("The number is Palindrome");

			} else {

				System.out.println("The number is not Palindrome");

			}
			System.out.println();
		}
	}
}