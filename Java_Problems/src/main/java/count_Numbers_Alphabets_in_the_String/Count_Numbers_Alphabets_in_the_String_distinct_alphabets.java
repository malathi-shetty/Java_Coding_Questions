package count_Numbers_Alphabets_in_the_String;

import java.util.HashSet;
import java.util.Set;

public class Count_Numbers_Alphabets_in_the_String_distinct_alphabets {

	public static void main(String[] args) {
		String s = "23sdsdf 25sfs 24 wdsf";
		int distinctAlphabetCount = countDistinctAlphabets(s);
		System.out.println("Total number of distinct alphabetic characters in the string: " + distinctAlphabetCount);
	}

	public static int countDistinctAlphabets(String s) {
		Set<Character> distinctAlphabets = new HashSet<>();

		for (char c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				distinctAlphabets.add(Character.toLowerCase(c)); // Add lowercase version to avoid duplicates
			}
		}

		return distinctAlphabets.size(); // Return the size of the set

	}

}

/*
 * 
 * Set Usage: A HashSet is used to store distinct characters.
 * 
 * Character Check: The program checks if each character is a letter.
 * 
 * Lowercase Conversion: The Character.toLowerCase(c) is used to ensure that
 * letters are counted as distinct regardless of their case (e.g., 'A' and 'a'
 * are considered the same).
 * 
 * Count Distinct: The size of the set is returned, representing the count of
 * distinct alphabetic characters.
 * 
 * Output: For the string "23sdsdf 25sfs 24 wdsf", this code will count the
 * distinct alphabetic characters and output 5 (which are s, d, f, w).
 * 
 */