package com.java_july_10am_prcte;

public class Cub_Bank_Ho implements Cub_Bank4, Cub_Bank3, Cub_Bank2, Cub_Bank1 {
	
	@Override
	public void manager1() {
		System.out.println("Total managers in Ramapuram branch are 2");
	}
	
	@Override
	public void employees1() {
		System.out.println("Total employees in Ramapuram branch are 12");
	}
	
	@Override
	public void manager2() {
		System.out.println("Total managers in covai branch are 1");
	}
	
	@Override
	public void employees2() {
		System.out.println("Total employees in covai branch are 14");
	}
	
	@Override
	public void manager3() {
		System.out.println("Total managers in selam branch are 3");
	}
	
	@Override
	public void employees3() {
		System.out.println("Total employees in selam branch are 13");
	}
	
	@Override
	public void manager4() {
		System.out.println("Total managers in Tirupur branch are 1");
	}
	
	@Override
	public void employees4() {
		System.out.println("Total employees in Tirupur branch are 10");
	}
	
	public void managar_ho() {
		System.out.println("Total maneger in Head office are 4");	
	}
	
	public void employees_ho() {
		System.out.println("Total employees in Head office are 52");
	}
	
	public static void main(String[] args) {
		Cub_Bank_Ho c = new Cub_Bank_Ho();
		c.managar_ho();c.manager1();c.manager2();c.manager3();c.manager4();
		c.employees_ho();c.employees1();c.employees2();c.employees3();c.employees4();
	}
}