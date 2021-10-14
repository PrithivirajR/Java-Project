package com.java_july_10am_class;

import java.util.Scanner;

public class If_Condition {

	public static void main(String[] args) {
		
		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your mark");
		int mark = s.nextInt();

		if (mark < 50) {
			System.out.println(" Failed");
		} else if (mark >= 50 && mark < 70) {
			System.out.println(" C Grade");
		} else if (mark >= 70 && mark < 90) {
			System.out.println(" B Grade");
		} else if (mark >= 90 && mark <= 100) {
			System.out.println(" A Grade");
		} else {
			System.out.println( "Absent");
		}
	
  }
}
