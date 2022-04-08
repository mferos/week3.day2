package week3.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 =  "potss";
		boolean isAnagram = true;
		
		if (text1.length() == text2.length()) {
		
			char[] text1Array = text1.toLowerCase().toCharArray();
			char[] text2Array = text2.toLowerCase().toCharArray();
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			
			for (int i=0; i < text1.length(); i++) {
				if (text1Array[i] == text2Array[i]) {
					continue;
				} else {
					isAnagram = false;
					break;
				}
			}
		} else {
			isAnagram = false;
		}
		
		if (isAnagram) {
			System.out.println(text1 + " & " + text2 + " are Anagram");
		} else {
			System.out.println(text1 + " & " + text2 + " are not Anagram");
		}
	}

}
