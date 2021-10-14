package com.java_july_10am_class;

public class Exception_Handling {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			System.out.println("java");
			System.out.println(a);
			System.out.println(b);
		}

		}
	}


