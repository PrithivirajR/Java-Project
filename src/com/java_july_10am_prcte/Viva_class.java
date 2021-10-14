package com.java_july_10am_prcte;

public class Viva_class extends Project_class {
	@Override
	public void project_name(String name) {
		super.project_name(name);
	}
	@Override
	public void project_name(int a) {
		super.project_name(a);
	}
	@Override
	public void project_name(String b, String c) {
		super.project_name(b, c);
	}
	@Override
	public void project_name(int d, int t) {
		super.project_name(d, t);
	}
	public void viva(int f) {
		System.out.println("The project conducted ate is " + f);
	}
	public void guide(String r) {
		System.out.println("The viva External name is " + r);
	}
	public void result(String s) {
		System.out.println("The project viva result is " + s);
	}
	public static void main(String[] args) {
		Viva_class v = new Viva_class();
		v.project_name("RDTCD");
		v.project_name(1);
		v.project_name("Arun","Praveen");
		v.project_name(230,270);
		v.viva(30);
		v.guide("Ashok");
		v.result("good");
	}
}
