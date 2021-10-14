package com.java_july_10am_prcte;

import java.util.Scanner;

public class num {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("number");
	int num = s.nextInt();
	
	int count=0;
	while (num!=0) {
		num/=10;
		++count;
	}
	System.out.println("number of digits"+ count);
}
}
