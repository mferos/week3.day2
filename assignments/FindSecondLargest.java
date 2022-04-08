package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		Collections.sort(intArrayList);
		System.out.println(intArrayList.get(intArrayList.size()-2));

	}

}
