package anagram_Panagram;

import java.util.Arrays;

public class Anagram_learn {

	boolean ana(String a, String b) {

		if (a.length() == b.length()) {
			char[] x = a.toLowerCase().toCharArray();
			char[] y = b.toLowerCase().toCharArray();

			Arrays.sort(x);
			Arrays.sort(y);

			return Arrays.equals(x, y);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Anagram_learn newobj = new Anagram_learn();
		String a = "eat";
		String b = "ate";
		System.out.println(newobj.ana(a, b));
	}

}

/*
 * 
 * Remember Anagram Checking:
 * 
 * ana Method: This method checks if two strings are anagrams by converting them
 * to lowercase, sorting the characters, and then comparing the sorted arrays.
 * 
 * main Method: Creates an instance of Anagram_learn and checks if "eat" and
 * "ate" are anagrams, printing the result.
 * 
 * 
 * "Sort and Compare":
 * 
 * Sort: Convert both strings to lowercase and sort their characters.
 * 
 * Compare: Check if the sorted arrays of characters are equal.
 * 
 * Use Arrays.equals to compare the sorted character arrays.
 * 
 * Anagrams: If the sorted arrays are equal, the original strings are anagrams.
 * 
 * Example: For strings "eat" and "ate":
 * 
 * Sort: Convert to "eat" → sort to "aet" and "ate" → sort to "aet".
 * 
 * Compare: Both sorted results are "aet", so they are equal.
 * 
 * Anagrams: Hence, "eat" and "ate" are anagrams.
 * 
 */