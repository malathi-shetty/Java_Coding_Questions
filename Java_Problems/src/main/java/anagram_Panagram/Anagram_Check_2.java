package anagram_Panagram;

import java.util.Arrays;

public class Anagram_Check_2 {
	
// Write a Java Program for given Strings are anagram or not str1 = "tomato", str2 = "matoto" ?
	
	boolean ana(String s1, String s2) {

		if (s1.length() == s2.length()) {
			char[] x = s1.toLowerCase().toCharArray();
			char[] y = s2.toLowerCase().toCharArray();

			Arrays.sort(x);
			Arrays.sort(y);

			return Arrays.equals(x, y);
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Anagram_Check_2 newobj = new Anagram_Check_2();
		String s1 = "tomato";
		String s2 = "matoto";

		System.out.println(newobj.ana(s1, s2));
		 if (newobj.ana(s1, s2)) {
	            System.out.println(s1 + " and " + s2 + " are anagrams.");
	        } else {
	            System.out.println(s1 + " and " + s2 + " are not anagrams.");
	        }
	}

}
