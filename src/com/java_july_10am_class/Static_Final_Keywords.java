package com.java_july_10am_class;

public final class Static_Final_Keywords {

	final static int book = 180;

	public static void books() {

		System.out.println("The book amout is" +	 book);
	}

	final static int notes = 260;

	public static void notes() {
		
		System.out.println("The notes amount is" +	 notes);
	}
	
	final static int pdf = 270;
	
	public static void pdf() {

		System.out.println("The pdfs amount is"+   pdf);
	}

	public static void main(String[] args) {
		
		books();
		notes();
		pdf();		
	}
	
}
