package com.java_july_10am_prcte;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Repeated_Programms {
	// Find the how many words are reoccur in the particular string
	public static void main(String[] args) {

		String s = "For the people by the people of the people";
		String[] split = s.split(" ");
		for (String sp : split) {
			System.out.println(sp);
		}
		System.out.println();
		// Declear the empty map
		
		Map<String, Integer> map = new HashMap<String, Integer>();// the =2,people=2
		
		for (String str : split) {			

			if (map.containsKey(str)) {	//at starting hashmap is empty so its go to else block

				Integer i = map.get(str);

				map.put(str, i + 1);	//the i=1,people i=1,the i=2,people i=2
			} else {
				map.put(str, 1);	//for=1,the=1,people=1,by=1,of=1
			}
		}
		System.out.println(map);
		System.out.println();
		// Print thr grater than 1 values

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {

				System.out.println(entry);
			}
		}

	}

}
