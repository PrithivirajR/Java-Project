package com.java_july_10am_prcte;

public class Pattern3 {
	public static void main(String[] args) {

		for (int i = 0; i <= 8; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = 0; i <= 8; i++) {

			for (int j = 8; j >= i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <= 8; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = 0; i <= 8; i++) {

			for (int j = 8; j >= i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
