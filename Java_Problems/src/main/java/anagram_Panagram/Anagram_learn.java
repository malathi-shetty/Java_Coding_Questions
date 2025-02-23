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
 * ****
 * 
 * Anagram_learn class step by step:
 * 
 * Class Overview
 * 
 * The Anagram_learn class checks if two strings are anagrams. An anagram is a
 * word formed by rearranging the letters of another, using all the original
 * letters exactly once.
 * 
 * Components of the Class
 * 
 * Method: ana(String a, String b)
 * 
 * Purpose: To determine if the two input strings a and b are anagrams.
 * 
 * Parameters:
 * 
 * String a: The first string to compare.
 * 
 * String b: The second string to compare.
 * 
 * Logic:
 * 
 * Length Check: First, it checks if the lengths of a and b are the same. If
 * not, they can't be anagrams, and the method returns false.
 * 
 * Character Conversion: If they are of the same length, both strings are
 * converted to lowercase and turned into character arrays.
 * 
 * Sorting: Both character arrays are sorted alphabetically.
 * 
 * Comparison: The sorted arrays are then compared using Arrays.equals(). If
 * they are equal, it means a and b are anagrams, and the method returns true;
 * otherwise, it returns false.
 * 
 * Main Method
 * 
 * Creating an Instance: An instance of the Anagram_learn class is created
 * (newobj).
 * 
 * Test Strings: Two strings, "eat" and "ate", are defined.
 * 
 * Anagram Check: The ana method is called with the test strings, and the result
 * (true or false) is printed to the console.
 * 
 * Comments Section
 * 
 * This part provides a clear explanation of how the anagram checking works:
 * 
 * Method Explanation: Describes what the ana method does.
 * 
 * Sort and Compare: Summarizes the sorting and comparison process, emphasizing
 * that if the sorted arrays are equal, the original strings are anagrams.
 * 
 * Example: Illustrates the process with the example of "eat" and "ate",
 * explaining how both are sorted to "aet".
 * 
 * Summary
 * 
 * The Anagram_learn class efficiently checks for anagrams using a
 * straightforward algorithm:
 * 
 * Check length.
 * 
 * Convert to lowercase and sort characters.
 * 
 * Compare sorted arrays.
 */