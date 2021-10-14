package com.java_july_10am_prcte;
import java.util.Scanner;
public class Switch_Case_pt {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the total brands");
		int a = k.nextInt();
		System.out.println();
		for (int i = 0; i < a; i++) {

		//Scanner s = new Scanner(System.in);
		System.out.println("Enter the Laptop brands name");
		String name = k.nextLine();
		
		switch (name) {
		case "Hp":
			System.out.println("Hp Laptop");
			System.out.println("All type of models are available");
			System.out.println("Both touch and non-touch are available");
			break;
		case "Dell":
			System.out.println("Dell Laptop");
			System.out.println("All type of models are available");
			System.out.println("Both touch and non-touch are available");
			break;
		case "Lenovo":
			System.out.println("Lenovo Laptop");
			System.out.println("All type of models are available");
			System.out.println("Only non-touch are available");
			break;
		case "Acer" :
			System.out.println("Acer Laptop");
			System.out.println("All type of models are available");
			System.out.println("Only non-touch are available");
			break;
		case "Asus":
			System.out.println("Asus Laptop");
			System.out.println("All type of models are available");
			System.out.println("Only touch are available");
			break;
		case "Razer":
			System.out.println("Razer Laptop");
			System.out.println("All type of models are available");
			System.out.println("Only non-touch are available");
			break;
		case "Apple_mac":
			System.out.println("Apple_Mac Laptop");
			System.out.println("All type of models are available");
			System.out.println("Both touch and non-touch are available");
			break;
		default:
			System.out.println("Other brands are not available");
			break;
		}
		System.out.println();
	}
}
}
