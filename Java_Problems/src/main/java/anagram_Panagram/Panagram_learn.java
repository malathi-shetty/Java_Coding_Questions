
package anagram_Panagram;

public class Panagram_learn {

	// The code will determine if the provided sentence is a pangram by checking if
	// it contains every letter of the alphabet. -- All 26 letters of the alphabet

	// Method to check if a string is a pangram
	boolean isPanagram(String sentence) {
		// Convert the sentence to lowercase to handle case insensitivity
		sentence = sentence.toLowerCase();

		// Create a boolean array to keep track of each letter
		boolean[] alphabet = new boolean[26];
		int index = 0;

		// Traverse the string and mark each letter in the boolean array
		for (char c : sentence.toCharArray()) {
			// Check if the character is a letter
			if (Character.isLetter(c)) {
				index = c - 'a'; // Calculate the index in the boolean array
				alphabet[index] = true;
			}
		}

		// Check if all letters are present
		for (boolean letterPresent : alphabet) {
			if (!letterPresent) {
				return false; // Return false if any letter is missing
			}
		}
		return true; // All letters are present
	}

	public static void main(String[] args) {
		Panagram_learn checker = new Panagram_learn();
		String testSentence = "The quick brown fox jumps over the lazy dog";
		System.out.println(checker.isPanagram(testSentence)); // Output: true
	}
}

/*
 * Remember:
 *
 * Convert to Lowercase: This ensures that the check is case-insensitive.
 * 
 * Boolean Array: A boolean array alphabet of size 26 is used to track the
 * presence of each letter ('a' to 'z').
 * 
 * Character Processing: Each character in the string is checked. If it's a
 * letter, the corresponding index in the boolean array is marked as true.
 * 
 * Check Completeness: After processing the string, the boolean array is checked
 * to ensure that all letters are present.
 * 
 * main Method:
 * 
 * Creates an instance of PangramCheck.
 * 
 * Defines a test sentence.
 * 
 * Calls isPangram and prints the result.
 * 
 * To test with different sentences, simply change the value of testSentence in
 * the main method.
 * 
 * The code will determine if the provided sentence is a pangram by checking if
 * it contains every letter of the alphabet.
 * 
 * Code line by line:
 * 
 * boolean isPangram(String sentence) {
 * 
 * isPangram: This is a method that checks if the provided string is a pangram.
 * It returns true if it is, and false otherwise.
 * 
 * String sentence: This is the input parameter, which is the string to be
 * checked.
 * 
 * sentence = sentence.toLowerCase();
 * 
 * toLowerCase(): This converts the entire string to lowercase to ensure the
 * method is case-insensitive (i.e., 'A' and 'a' are treated the same).
 * 
 * boolean[] alphabet = new boolean[26];
 * 
 * boolean[] alphabet: An array of 26 boolean values (one for each letter of the
 * alphabet). Initially, all values are false.
 * 
 * alphabet[index] = true;: Marks that a particular letter (indexed by index) is
 * present in the string.
 * 
 * 
 * for (char c : sentence.toCharArray()) { if (Character.isLetter(c)) { index =
 * c - 'a'; // Calculate the index in the boolean array alphabet[index] = true;
 * } }
 * 
 * toCharArray(): Converts the string to an array of characters.
 * 
 * Character.isLetter(c): Checks if the character c is a letter.
 * 
 * c - 'a': Calculates the position of the letter c in the alphabet (e.g., 'a'
 * becomes 0, 'b' becomes 1, etc.).
 * 
 * alphabet[index] = true;: Marks the corresponding index in the boolean array
 * as true.
 * 
 * 
 * 
 * for (boolean letterPresent : alphabet) { if (!letterPresent) { return false;
 * // Return false if any letter is missing } }
 * 
 * for (boolean letterPresent : alphabet): Iterates over the boolean array.
 * 
 * if (!letterPresent): Checks if any letter is missing (i.e., if any value in
 * the array is false).
 * 
 * return false;: If any letter is missing, return false.
 * 
 * 
 * return true; // All letters are present
 * 
 * return true;: If all letters are present, return true.
 * 
 * public static void main(String[] args) { PangramCheck checker = new
 * PangramCheck(); String testSentence =
 * "The quick brown fox jumps over the lazy dog";
 * System.out.println(checker.isPangram(testSentence)); // Output: true }
 * 
 * main Method: The entry point of the program. It’s where the program starts
 * execution.
 * 
 * PangramCheck checker = new PangramCheck();: Creates an instance of the
 * PangramCheck class.
 * 
 * String testSentence = "The quick brown fox jumps over the lazy dog";: Defines
 * a test sentence.
 * 
 * System.out.println(checker.isPangram(testSentence));: Calls the isPangram
 * method with the test sentence and prints the result.
 * 
 * 
 * The Panagram_learn class contains a method to determine if a given string is
 * a pangram by using a boolean array to track the presence of each letter of
 * the alphabet.
 * 
 * The main method tests this functionality with a sample sentence.
 * 
 * ************
 * 
 * 
 * 
 * 
 * Panagram_learn class step by step, focusing on its structure and
 * functionality.
 * 
 * Class Overview
 * 
 * The Panagram_learn class is designed to determine if a given sentence is a
 * pangram. A pangram is a sentence that contains every letter of the alphabet
 * at least once.
 * 
 * 
 * Components of the Class
 * 
 * Method: isPangram(String sentence)
 * 
 * Purpose: To check if the provided string sentence contains every letter of
 * the English alphabet.
 * 
 * Parameters:
 * 
 * String sentence: The input string to check for pangram status.
 * 
 * 
 * Logic:
 * 
 * Convert to Lowercase: The input string is converted to lowercase using
 * sentence.toLowerCase(). This ensures that the check is case-insensitive,
 * meaning 'A' and 'a' are treated the same.
 * 
 * Boolean Array: A boolean array of size 26 (for each letter from 'a' to 'z')
 * is created. Initially, all values are set to false.
 * 
 * Character Traversal: The method then iterates through each character in the
 * string:
 * 
 * Check for Letters: It checks if each character is a letter using
 * Character.isLetter(c).
 * 
 * Mark Presence: If a character is a letter, its corresponding index in the
 * boolean array is marked as true. The index is calculated by index = c - 'a',
 * which maps 'a' to 0, 'b' to 1, and so on.
 * 
 * Check Completeness: After processing the string, the method iterates through
 * the boolean array:
 * 
 * If any index is false, it means that at least one letter is missing from the
 * input sentence, and the method returns false.
 * 
 * If all indices are true, the method returns true, indicating that the
 * sentence is a pangram.
 * 
 * 
 * Main Method
 * 
 * Creating an Instance: The main method creates an instance of the
 * Panagram_learn class, named checker.
 * 
 * Test Sentence: It defines a test sentence,
 * "The quick brown fox jumps over the lazy dog", which is a well-known pangram.
 * 
 * Pangram Check: The method calls isPangram with the test sentence and prints
 * the result to the console. In this case, it will output true since the
 * sentence contains every letter of the alphabet.
 * 
 * 
 * Comments Section
 * 
 * The comments throughout the code are detailed and helpful, providing
 * explanations of each part of the logic:
 * 
 * Conversion to Lowercase: Emphasizes the importance of handling case
 * insensitivity.
 * 
 * Boolean Array: Explains the purpose of the boolean array and how it tracks
 * each letter's presence.
 * 
 * Character Processing: Describes how each character is checked and marked.
 * 
 * Completeness Check: Outlines how the final check is performed to confirm that
 * all letters are present.
 * 
 * Main Method: Details what the main method does, including the process of
 * creating an instance, defining a test sentence, and printing the results.
 * 
 * Summary
 * 
 * The Panagram_learn class efficiently determines if a given string is a
 * pangram by using a boolean array to track the presence of each letter of the
 * alphabet.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */