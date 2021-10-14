package com.java_july_10am_prcte;

import java.util.Scanner;

public class Array_Pt {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total number of the students:");
		int n = s.nextInt();

		int a[] = new int[n];
		
		System.out.println();
		System.out.print("Enter the Students average marks:\n");
		
		for (int i = 0; i < n; i++) {
			int marks = s.nextInt();
			a[i] = marks;
		}
		int length = a.length;
		int total = 0;
		for (int marks : a) {

			total += marks;
		}
		System.out.println();
		
		int avg = total / length;
		
		System.out.println("The total Students average marks are :"  + total);
		System.out.println();
		System.out.println("The " + n +" Students Average are :"  + avg);
		System.out.println();

}
}
