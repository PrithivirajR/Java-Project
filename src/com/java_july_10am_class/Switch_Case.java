package com.java_july_10am_class;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = s.nextInt();
		switch (n) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Invalied number");
			break;
		}
	}
}
