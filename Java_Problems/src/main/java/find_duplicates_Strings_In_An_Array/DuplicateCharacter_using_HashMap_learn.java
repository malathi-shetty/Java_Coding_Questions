package find_duplicates_Strings_In_An_Array;

import java.util.HashMap;

public class DuplicateCharacter_using_HashMap_learn {

	public static void main(String[] args) {
		// Write a Java program for Duplicate character repetition in a string.String
		// str = "How are you"

		// This program counts the frequency of each character in the given string and
		// displays the characters that are repeated.

		String s = "How are you";
		HashMap<Character, Integer> newobj = new HashMap<>();
		System.out.println("Original String: " + s);
		// Convert string to lowercase for uniformity
		s = s.toLowerCase();
		System.out.println("Lowercase String: " + s);
		
		// Count the occurrences of each character
		for (char c : s.toCharArray()) {
			if (c != ' ') { // Ignore spaces
				// Check if the character already exists in the map
				if (newobj.containsKey(c)) {
					// If it exists, increment its value by 1
					newobj.put(c, newobj.get(c) + 1);
				} else {
					// If it does not exist, add it to the map with an initial count of 1
					newobj.put(c, 1);
				}
			}
		}

		// Debugging: Print the frequency of each character to check if it's being
		// counted correctly
		System.out.println("Character Frequencies:");
		for (Character key : newobj.keySet()) {
			System.out.println(key + ": " + newobj.get(key)); // Print character and its count
		}

		System.out.println("\nRepeated Characters:");
		// Display characters that appear more than once
		for (Character key : newobj.keySet()) {
			if (newobj.get(key) > 1) {
				System.out.println(key + " appears " + newobj.get(key) + " times.");
			}
		}
	}

}

/* Output:
 * 
 * Original String: How are you
 * 
 * Lowercase String: how are you
 * 
 * Character Frequencies:
 * 
 * a: 1
 * 
 * r: 1
 * 
 * e: 1
 * 
 * u: 1
 * 
 * w: 1
 * 
 * h: 1
 * 
 * y: 1
 * 
 * o: 2
 * 
 * Repeated Characters: o appears 2 times.
 * 
 * 
 */
