package com.java_july_10am_prcte;

import java.util.Scanner;

public class If_Condition {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.println("Enter the total no of students");
		int a = k.nextInt();

		for (int i =0 ; i < a; i++) {

			//Scanner s = new Scanner(System.in);
			System.out.println("Enter the Average mark of the students");
			int mark = k.nextInt();
			
			if (0 < mark && mark < 50) {
				System.out.println("The student was Failed");
			} else if (mark >= 50 && mark < 70) {
				System.out.println("The student got C Grade");
			} else if (mark >= 70 && mark < 90) {
				System.out.println("The student got B Grade");
			} else if (mark >= 90 && mark <= 100) {
				System.out.println("The student got A Grade");
			} else {
				System.out.println("Its un pritictaed");
			}
		}
	}
}
