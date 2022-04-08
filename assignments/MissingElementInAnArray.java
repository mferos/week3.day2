package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		
		for (int i=0; i< list.size(); i++) {
			if ((i+1) != list.get(i)) {
				System.out.println(i+1);
				break;
			}
		}

	}

}
