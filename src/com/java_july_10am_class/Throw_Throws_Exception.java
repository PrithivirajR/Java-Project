package com.java_july_10am_class;

public class Throw_Throws_Exception {
	
	public void vote(int age) throws Exception  {
		
		if (age>=18) {
			
			System.out.println("Able to vote");
			
		} else {
			
		throw new Exception("invalid");

		}
		
	}
	public static void main(String[] args) throws Exception  {
		
		Throw_Throws_Exception t = new Throw_Throws_Exception();
		t.vote(17);
	}

}
