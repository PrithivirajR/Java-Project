package com.java_july_10am_prcte;
import java.util.Scanner;
public class Loan_Employee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no of Loan Details");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i+" Enter the marriage details ");
			String marriage = s.next();
			System.out.println("Enter the job role ");
			String role = s.next();
			System.out.println("Enter the experience");
			int exp = s.nextInt();
			
			if (marriage.equals("unmarried")&&role.equals("permanent")&&exp>=30) {
				System.out.println("You elegible for loan and your loan amount is 50000");
				
			}else if(marriage.equals("unmarried")&&role.equals("permanent")&&exp<=30) 
			{
				System.out.println("You elegible for loan and your loan amount is 25000");
				
			}else if (marriage.equals("married")&&role.equals("permanent")&&exp>=30) {
				System.out.println("You elegible for loan and your loan amount is 60000");
				
			}else if (marriage.equals("married")&&role.equals("permanent")&&exp<=30) {
				System.out.println("You elegible for loan and your loan amount is 35000");
				
			}else if (marriage.equals("unmarried")||marriage.equals("married")
					&&role.equals("temporary")&&exp>=0) {
				System.out.println("You elegible for loan and your loan amount is 10000");
				
			}else {
				System.out.println("Yor loan not eligible");
			}
			}
		}	
	}
	