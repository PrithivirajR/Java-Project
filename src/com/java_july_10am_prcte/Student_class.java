package com.java_july_10am_prcte;

public class Student_class extends Teacher_Class {
	
	@Override
	public void name(String ss) {
		super.name(ss);
	}
	@Override
	public void books(int a) {
		super.books(a);
	}
	@Override
	public void pdfs(int b) {
		super.pdfs(b);
	}
	@Override
	public void guides(int c) {
		super.guides(c);
	}
	@Override
	public void online_web(String web) {
		super.online_web(web);
	}
	
	public void notes(int d) {
		System.out.println(d);
	}
	public void name1(String rr) {
		System.out.println("The student name  " + rr);
	}
	public void exam1(String exam) {
		System.out.println("The exam name is " + exam);
	}
	public static void main(String[] args) {
		Student_class s = new Student_class();
		s.name("Arun");
		s.books(6);
		s.pdfs(24);
		s.guides(6);
		s.online_web("youtube");
		s.notes(12);
		s.name1("Prithivi");
		s.exam1("State board");
	}
}
