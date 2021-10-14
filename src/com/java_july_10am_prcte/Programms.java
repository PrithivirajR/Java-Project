package com.java_july_10am_prcte;

public class Programms {
	public void fun1(int a, int b, int c, int count) {
		if (b > c) {
			count = count * b;
			System.out.println(count);
		}
	}
	public void fun2(int a, int b, int c, int count) {
		if (b<c) {
			count = count*c;
			System.out.println(count);
		}
	}
	public static int fun3(int a, int b, int c, int count) {
		if (b>a) {
			count = count-a;
			System.out.println(count);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Programms p = new Programms();
		int a = 4,arr[]= {10,5,0,10},count=arr[3];
		while (a>0) {
			
			if (a==4) {
				count=fun3(arr[a-1],arr[a],arr[a+1],count);
			} else {

			}
			
		}
	}
}
