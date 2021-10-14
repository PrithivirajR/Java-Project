package com.java_july_10am_class;

public class Jumping_Statement {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i==3 || i==8) {
				
				break;
				//continue;
			}
			System.out.println(i);
		}
	}

}
