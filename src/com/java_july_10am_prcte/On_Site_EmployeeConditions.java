package com.java_july_10am_prcte;
import java.util.Scanner;
public class On_Site_EmployeeConditions {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Employee name");
		String name = s.nextLine();
		System.out.println("Enter the passport details");
		String pp = s.next();
		System.out.println("Enter the communication details");
		String comm = s.next();
		System.out.println("Enter the training details");
		int tr = s.nextInt();
		System.err.println("Enter the experience details");
		String exp = s.next();
		System.out.println("Enter the age");
		int age = s.nextInt();
		
		if (pp.equalsIgnoreCase("yes")&&comm.equalsIgnoreCase("good")
				&& tr>=2&& exp.equalsIgnoreCase("two")&&age>=23) 
		{
			System.out.println(name+" Eligible for on site work");
			
		}else {
			
			System.out.println(name+" Not Eligible for on site work");
		}
		
	}

}
