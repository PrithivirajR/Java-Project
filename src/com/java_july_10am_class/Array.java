package com.java_july_10am_class;

public class Array {

	public static void main(String[] args) {
		
		int a[] = new int[5];
//		
//		a[0] =51;
//		a[1] =52;
//		a[2] =53;
//		a[3] =54;
//		a[3] =55;
//		a[4] =56;
		
		int b[] = {51,52,53,54,55,51,52};
		
		System.out.println(b.length);
		System.out.println(b[3]);
		
//		for (int i = 0; i < b.length; i++) {
//			
//			System.out.print(b[i]+",");
//		
		for (int arr : b) {
			
			System.out.print(arr +",");
	
		
		}
	}}
//}
