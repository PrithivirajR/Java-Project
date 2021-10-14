package com.java_july_10am_prcte;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Project_Class { // 12th toper list with name project

//		int no,mr;
//		String na, cls, grd;
//		
//		public  void students(int numbers, int mark, String name,
//										String classes,String grade) {
//			this.no = numbers;
//			this.mr = mark;
//			this.na = name;
//			this.cls = classes;
//			this.grd = grade;				}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int mark = s.nextInt();
		String name = s.nextLine();
		String classes = s.next();
		String grade = s.next();

		for (int i = 0; i < a; i++) {

			Map<Integer, String> m = new HashMap<Integer, String>();

			m.put(a, name);
			System.out.println(m);
		}
	}
}