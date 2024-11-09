package find_duplicates_Strings_In_An_Array;

public class Duplicate_STRINGS_InAnArray_with_count_learn {

	public static void main(String[] args) {
		String str = "apple is red fruit found in a tree";
		char[] newobj = str.toCharArray(); // Convert the string into a character array

		System.out.println("The string is: " + str);
		System.out.println("Duplicate Characters in the above string are: ");

		// Outer loop to iterate through each character
		for (int i = 0; i < str.length(); i++) {
			char currentChar = newobj[i];

			// Skip spaces
			if (currentChar == ' ') {
				continue;
			}

			// Count occurrences of the current character
			int count = 1; // Start with the current occurrence

			// Check for duplicates in the rest of the string
			for (int j = i + 1; j < str.length(); j++) {
				if (currentChar == newobj[j]) {
					count++; // Increment count for each duplicate found
					// Mark the duplicate character to avoid future matches
					newobj[j] = ' '; // Replace with space
				}
			}

			// If count is greater than 1, it means it's a duplicate
			if (count > 1) {
				System.out.println(currentChar + " - " + count);
				// Mark all occurrences as processed
				newobj[i] = ' '; // Mark the original character as processed
			}
		}

	}

}

/*
 * 
 * The string is: apple is red fruit found in a tree
 * 
 * Duplicate Characters in the above string are:
 * 
 * a - 2
 * 
 * p - 2
 * 
 * e - 4
 * 
 * i - 3
 * 
 * r - 3
 * 
 * d - 2
 * 
 * f - 2
 * 
 * u - 2
 * 
 * t - 2
 * 
 * n - 2
 * 
 */