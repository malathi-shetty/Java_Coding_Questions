package indexed_Characters;

public class Odd_indexed_characters {

	public static String oddIndexedCharacters(String s) {

		// To store odd-indexed characters
		StringBuilder oddIndices = new StringBuilder();

		// Loop through the string and collect odd-indexed characters
		for (int i = 1; i < s.length(); i += 2) { // Start at index 1 and increment by 2
			oddIndices.append(s.charAt(i));// Append odd indexed character
		}
		// Return the odd indexed characters as a string
		return oddIndices.toString();
	}

	public static void main(String[] args) {
		String input = "Hello, World!";
		String result = oddIndexedCharacters(input);

		System.out.println("Odd-Indexed Characters: " + result);
		// Output: el,Wrd
	}
}