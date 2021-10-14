package com.java_july_10am_prcte;

public class Vaiables_project {
	
	static int a = 30;
	static int e = 40;

	public void add() {
		int b = 10;
		System.out.println(b);
	}

	public void sub() {
		int c = 20;
		System.out.println(c);
	}

	public void multi() {
		int d = 25;
		System.out.println(d);
	}

	public static void divi() {
		System.out.println(a);
	}

	public static void dec() {
		System.out.println(e);
	}
	public static void main(String[] args) {
		
		Vaiables_project v = new Vaiables_project();
		v.add();
		v.sub();
		v.multi();
		divi();
		dec();
}}