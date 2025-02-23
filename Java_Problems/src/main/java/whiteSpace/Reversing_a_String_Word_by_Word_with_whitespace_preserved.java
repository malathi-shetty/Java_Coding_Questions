package whiteSpace;

public class Reversing_a_String_Word_by_Word_with_whitespace_preserved {

	public static void main(String[] args) {
		String input = "Java   Coding   Questions";
		String result = reverseWords(input);
		System.out.println("Original String: " + input);
		System.out.println("Reversed Words String: " + result);

	}

	public static String reverseWords(String input) {
		String[] words = input.split(" "); // Split based on space, preserving extra spaces
		StringBuilder result = new StringBuilder();

		// Reverse words in the array
		for (int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]);
			if (i != 0) {
				result.append(" "); // Add a space between words
			}
		}

		return result.toString();
	}

}

/*
 * 
 * The split(" ") method splits the input string into words based on spaces.
 * This way, multiple consecutive spaces are preserved as empty strings in the
 * array.
 * 
 * The words are then reversed and concatenated back together with a space in
 * between.
 * 
 * Output: For the input "Java Coding Questions", the output would be
 * "Questions Coding Java".
 * 
 */
