package array_Coding_Questions_Assignment_count_occurences_of_letters_using_map;

import java.util.HashMap;
import java.util.Map;

public class Count_occurences_of_letters_using_map_learn {

	public static void main(String[] args) {

		// count occurences of letters using map

		String s = "Hello World"; // Input string
		char[] a = s.toCharArray(); // Convert string to character array

		Map<Character, Integer> newobj = new HashMap<>(); // Map to store character counts

		// Loop through each character in the array
		for (char ch : a) {
			// Check if the character is already in the map
			if (newobj.containsKey(ch)) {
				// Increment the count for the character
				newobj.put(ch, newobj.get(ch) + 1);
			} else {
				// Initialize the count for new character
				newobj.put(ch, 1);
			}
		}

		// Print the occurrences of each character
		for (Character key : newobj.keySet()) {
			System.out.println("Character: '" + key + "' Count: " + newobj.get(key));
		}

	}

}

/*
 * 
 * Loop Through Characters: The code loops through each character in the string
 * converted to a character array.
 * 
 * Check for Existing Character: Instead of using getOrDefault, it checks if the
 * character is already a key in the map using containsKey.
 * 
 * Update Counts: If the character exists, it increments the count; otherwise,
 * it initializes the count to 1.
 * 
 * Output: Finally, it prints each character and its count.
 * 
 */