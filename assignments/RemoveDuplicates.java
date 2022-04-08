package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "We learn java basics as part of java sessions in java week1";	
				
		char[] charArray = str.toCharArray();  
						
		Set<Character> set = new TreeSet<Character>();
		
		for (Character ch : charArray) {
			set.add(ch);
		}
        
        for (Character ch : set) {
			System.out.print(ch);
		}
	}

}
