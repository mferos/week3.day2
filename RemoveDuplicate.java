package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	
	 

	public static void main(String[] args) {

		String s="PayPal India";  
		char[] charArray = s.toCharArray();  
		
		Set<Character> set = new TreeSet<Character>();
		
		for (Character ch : charArray) {
			set.add(ch);
		}
        
        for (Character ch : set) {
			System.out.print(ch);
		}
	}

}
