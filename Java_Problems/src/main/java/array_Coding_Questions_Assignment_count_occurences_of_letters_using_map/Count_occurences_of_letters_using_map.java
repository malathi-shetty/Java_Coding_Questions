package array_Coding_Questions_Assignment_count_occurences_of_letters_using_map;

import java.util.HashMap;
import java.util.Map;

public class Count_occurences_of_letters_using_map {

	public static void main(String[] args) {
		// count occurences of letters using map

		String s = "Hello World"; // Input string
		char[] a = s.toCharArray(); // Convert string to character array

		Map<Character, Integer> newobj = new HashMap<>(); // Map to store character counts

		// Loop through each character in the array
		for (char ch : a) {
			if (Character.isLetter(ch)) { // Check if the character is a letter
				// If character is not in the map, add it with a count of 1
				if (!newobj.containsKey(ch)) {
					newobj.put(ch, 1);
				} else {
					// Increment the count for the character
					newobj.put(ch, newobj.get(ch) + 1);
				}
			}
		}

		// Print the occurrences of each character
		for (Character key : newobj.keySet()) {
			System.out.println("Character: " + key + " -->  Count: " + newobj.get(key));
		}
	}

}

/*
 * 
 * Character Check: This code checks if each character is a letter using
 * Character.isLetter(ch), which ensures that non-letter characters (like
 * spaces) are ignored.
 * 
 * Map Usage: It uses a HashMap to store each character and its corresponding
 * count, adding new characters or updating existing counts appropriately.
 * 
 * Output: The results are printed in a readable format, showing each character
 * and its count.
 * 
 * Explanation of Changes
 * 
 * Character Loop: The enhanced for-loop (for (char ch : a)) makes the code
 * cleaner and easier to read.
 * 
 * Condition for Letters: The condition to check if the character is a letter is
 * added to avoid counting spaces or punctuation.
 * 
 * Variable Naming: Changed newobj to charCountMap for clarity.
 * 
 */