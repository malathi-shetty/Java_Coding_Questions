package indexed_Characters_Even_Odd;

public class Even_Odd_indexed_characters {

	public static String[] evenoddIndexedCharacters(String s) {
		StringBuilder evenIndices = new StringBuilder(); // To store even-indexed characters
		StringBuilder oddIndices = new StringBuilder(); // To store odd-indexed characters

		// Loop through the string and categorize characters
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				evenIndices.append(s.charAt(i));// Even indexed
			} else {
				oddIndices.append(s.charAt(i));// Odd indexed
			}
		}

		// Return an array containing both strings
		return new String[] { evenIndices.toString(), oddIndices.toString() };
	}

	public static void main(String[] args) {
		String input = "Hello, World!";
		String[] result = evenoddIndexedCharacters(input);

		// Output Results
		System.out.println("Even-indexed characters: " + result[0]);// Output: Hlo ol!
		System.out.println("Odd-indexed characters: " + result[1]); // Output: el,Wrd
	}
}