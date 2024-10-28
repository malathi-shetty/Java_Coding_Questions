package string_Capitalization;

public class String_Capitalization {

	public static void main(String[] args) {
		// Convert string to title case
		String a = "i love programming";
		a = capitalize(a);
		System.out.println(a); // Output: I Love Programming
	}

	// Method to capitalize the first letter of each word
	public static String capitalize(String s) {
		String[] words = s.split(" ");
		String result = "";

		for (String word : words) {
			if (word.length() > 0) {
				result += Character.toUpperCase(word.charAt(0)); // Capitalize the first letter
				result += word.substring(1); // Add the rest of the word
				result += " "; // Add a space after each word
			}
		}

		return result.trim(); // Trim the final string to remove trailing space
	}

}

/*
 * 
 * String Concatenation: In this method, the result string is built by
 * concatenating each capitalized word along with spaces.
 * 
 * Final Trim: trim() is used to remove any extra space at the end of the final
 * string.
 * 
 */