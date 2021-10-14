
package com.java_july_10am_class;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		int rem = 0, ans = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int t = n;
		while (0 < n) {
			rem = n % 10;
			ans = ans + (rem*rem*rem);
			n /= 10;
		}
		if (t == ans) {

			System.out.println("This is a Armstrong number");

		} else {

			System.out.println("This is not a Armstrong number ");
		}
	}

}
