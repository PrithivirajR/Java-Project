package com.java_july_10am_prcte;
import java.util.Scanner;
public class Tax_Programms {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Total no of employee tax details are: ");
		int n = s.nextInt();	System.out.println();
		for (int i = 0; i < n; i++) {	
			System.out.println("Enter the employee name");
			String name = s.next();
			System.out.println("Enter the employee annual salary");
			int salary = s.nextInt();
			System.out.println("Enter the " + name + " annual House Emi amount");
			int emi1 = s.nextInt();
			System.out.println("Enter the " + name + " annual Edu Emi amount");
			int emi2 = s.nextInt();

			int salary1, emi = emi1 + emi2;
			salary=salary-emi;
			if (salary>1000000) {
				System.out.println("The remaining salary is "+salary);
				System.out.println("The tax is 30%");
				salary1=salary* 30/100;
				salary=salary-salary1;
				System.out.println("The remaining salary after tax is "+salary);
				
			} else if (salary>500000) {
				System.out.println("The remaining salary is "+salary);
				System.out.println("The tax is 20%");
				salary1=salary* 20/100;
				salary=salary-salary1;
				System.out.println("The remaining salary after taxis "+salary);
			}else {
				System.out.println("The remaining salary is "+salary);
				System.out.println("The tax is 5%");
				salary1=salary* 5/100;
				salary=salary-salary1;
				System.out.println("The remaining salary after tax is "+salary);
				} 
		}System.out.println();}
	}


