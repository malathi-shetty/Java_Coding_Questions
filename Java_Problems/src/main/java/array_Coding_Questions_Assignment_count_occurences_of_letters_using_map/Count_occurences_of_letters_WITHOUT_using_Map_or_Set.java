package array_Coding_Questions_Assignment_count_occurences_of_letters_using_map;

public class Count_occurences_of_letters_WITHOUT_using_Map_or_Set {

	public static void main(String[] args) {
		String input = "aabccbaa";

		// Convert the string into a character array
		char[] chars = input.toCharArray();

		// Iterate through each character in the array
		for (int i = 0; i < chars.length; i++) {
			int count = 1; // Initialize the count for the current character

			// Check if the character is already counted
			if (chars[i] != '0') { // '0' is used as a marker
				// Count the frequency of the current character
				for (int j = i + 1; j < chars.length; j++) {
					if (chars[i] == chars[j]) {
						count++; // Increase count for duplicate
						chars[j] = '0'; // Mark as visited
					}
				}
				// Print the character and its frequency
				System.out.println("Character: " + chars[i] + " - Frequency: " + count);
			}
		}

	}

}

/*
 * 
 * '0' (zero): This is used to mark characters that have already been counted,
 * to avoid recounting them.
 * 
 * We loop through each character and check the remaining characters in the
 * array. If we find a match, we increment the count and mark the matched
 * character as counted.
 * 
 */