package com.java_july_10am_prcte;

public class Facebook {

	public static void add(String username,String password) throws Exception {
		
		if (username.equals("arun")&& password.equals("abc@123")) {
			
			System.out.println("Welcome to profile ");
			
		} else {
			
			throw new My_Exception("Invalid");

		}
		System.out.println("Facebook");
	}
	
	public static void main(String[] args) throws Exception {
		
		add("arun","abc123");
		
	}
}
