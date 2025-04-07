package whiteSpace;

public class Word_Order_Reversing_a_String_with_whitespace_preserved_StringBuilder {

	public static void main(String[] args) {
		String s = "Java   Coding   Questions";
		String r = reverseWords(s);
		System.out.println("Original String: " + s);
		System.out.println("Reversed Words String: " + r);

	}

	public static String reverseWords(String s) {
		String[] words = s.split(" "); // Split based on space, preserving extra spaces
		StringBuilder r = new StringBuilder();

		// Reverse words in the array
		for (int i = words.length - 1; i >= 0; i--) {
			r.append(words[i]);
			if (i != 0) {
				r.append(" "); // Add a space between words
			}
		}

		return r.toString();
	}

}

/*
 * 
 * Original String: Java   Coding   Questions
 * 
Reversed Words String: Questions   Coding   Java

 */

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
