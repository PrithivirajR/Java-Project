package com.java_july_10am_prcte;

public class Student extends Teacher {

	@Override
	public void books() {
		System.out.println("All subject books");
	}

	@Override
	public void pdfs() {
		System.out.println("All subject pdfs");
	}

	@Override
	public void notes() {
		System.out.println("All subject notes"); 
	}

	@Override
	public void ppts() {
		super.ppts();
	}

	public void my_notes() {
		System.out.println("All subject my hand written notes");

	}

	public static void main(String[] args) {
		Student s = new Student();
		s.books();
		s.pdfs();
		s.notes();
		s.ppts();
		s.my_notes();

	}

}
