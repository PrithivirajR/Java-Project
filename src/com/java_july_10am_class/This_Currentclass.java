package com.java_july_10am_class;

public class This_Currentclass extends Super_Parentclass {

	int c = 2001;

	public void income() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

	int d = 5001;

	public void total() {

		System.out.println("Total amount is" + d);
	}

	public void close() {

		super.emi();
		super.loan();
		this.income();
		this.total();
	}

	public static void main(String[] args) {
		This_Currentclass c = new This_Currentclass();
		c.close();

	}

}
