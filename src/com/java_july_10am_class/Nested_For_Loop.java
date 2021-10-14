package com.java_july_10am_class;

public class Nested_For_Loop {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 3; i++) { //  outer loop
			
			for (int j = 0; j <= 3; j++) { // Inner loop

				System.out.print(i + "" + j);
			}
			System.out.println();
		}
	}

}
