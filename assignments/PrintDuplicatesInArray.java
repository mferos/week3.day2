package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		Collections.sort(list);
		Set<Integer> s = new HashSet<Integer>();
		for (Integer integer : list) {
			if (!s.add(integer)) {
				System.out.println(integer + " is duplicate");
			}
		}
	}

}
