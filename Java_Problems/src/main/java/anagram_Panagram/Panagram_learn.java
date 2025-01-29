
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
 * **********
 * 
 * ASCII values of characters
 * 
 * Each character in a string is represented by a unique number, known as its
 * ASCII value. For example:
 * 
 * The ASCII value of 'a' is 97.
 * 
 * The ASCII value of 'b' is 98.
 * 
 * The ASCII value of 'c' is 99, and so on.
 * 
 * So when we subtract the ASCII value of 'a' from any lowercase letter, we get
 * the position of that letter in the alphabet, starting from 0 for 'a'.
 * 
 * Breaking it down step by step:
 * 
 * Consider this line of code:
 * 
 * index = c - 'a';
 * 
 * c is a character (say, 'b').
 * 
 * 'a' is also a character, and its ASCII value is 97.
 * 
 * Now, let’s calculate the result of c - 'a':
 * 
 * If c is 'b', the ASCII value of 'b' is 98.
 * 
 * So, index = 98 - 97 = 1.
 * 
 * This means that the letter 'b' corresponds to index 1 in the alphabet (since
 * 'a' is at index 0, 'b' is at index 1, 'c' is at index 2, and so on).
 * 
 * More examples:
 * 
 * If c is 'a':
 * 
 * index = 'a' - 'a' = 97 - 97 = 0
 * 
 * So 'a' maps to index 0.
 * 
 * If c is 'c':
 * 
 * index = 'c' - 'a' = 99 - 97 = 2
 * 
 * So 'c' maps to index 2.
 * 
 * Why subtract 'a'?
 * 
 * By subtracting the ASCII value of 'a' from the character, we are
 * "normalizing" the letter to a number starting from 0 (for 'a'), 1 (for 'b'),
 * and so on, all the way up to 25 (for 'z').
 * 
 * How does this help?
 * 
 * This helps us map each letter to a position in a boolean array (which has 26
 * elements for the 26 letters of the alphabet).
 * 
 * For example:
 * 
 * 'a' will correspond to index 0 in the boolean array.
 * 
 * 'b' will correspond to index 1.
 * 
 * 'c' will correspond to index 2.
 * 
 * The boolean array (alphabet) will be updated to true at the corresponding
 * index for each letter encountered in the string.
 ********
 *
 * 
 * 
 * What Are ASCII Values?
 * 
 * Every character in the alphabet, as well as other characters like
 * punctuation, digits, and special symbols, is represented by a number. This
 * number is part of the ASCII table. ASCII (American Standard Code for
 * Information Interchange) is a standard way of encoding characters into
 * numbers.
 * 
 * For example:
 * 
 * The letter 'a' has an ASCII value of 97.
 * 
 * The letter 'b' has an ASCII value of 98.
 * 
 * The letter 'c' has an ASCII value of 99, and so on.
 * 
 * You can see how each letter has a unique number. This is important because it
 * allows us to manipulate characters mathematically.
 * 
 * The Key Operation: c - 'a'
 * 
 * Now, in the code index = c - 'a';, here’s what happens:
 * 
 * c is a character in the string (for example, 'b').
 * 
 * 'a' is also a character, and it’s used as a reference point because we want
 * to map the letters of the alphabet to the numbers 0, 1, 2, ..., 25.
 * 
 * When you subtract the ASCII value of 'a' (97) from the ASCII value of any
 * other lowercase letter, you get the relative position of that letter in the
 * alphabet. This makes it easy to map any letter to an index in an array that
 * will represent the alphabet.
 * 
 * Here's the breakdown with an example:
 * 
 * Let’s say c is the character 'b'.
 * 
 * The ASCII value of 'b' is 98.
 * 
 * The ASCII value of 'a' is 97.
 * 
 * So when you do this calculation:
 * 
 * index = c - 'a';
 * 
 * You’re doing:
 * 
 * index = 98 - 97;
 * 
 * Which gives you:
 * 
 * index = 1;
 * 
 * Why is that useful?
 * 
 * Now, we know that 'a' will map to index 0, 'b' maps to index 1, 'c' maps to
 * index 2, and so on.
 * 
 * This lets us map any letter of the alphabet to a specific position in an
 * array.
 * 
 * How Does This Work in Your Code?
 * 
 * In the code, there is a boolean array of size 26, called alphabet, that’s
 * used to track whether each letter of the alphabet has been seen in the
 * sentence or not.
 * 
 * Here’s what’s happening step-by-step:
 * 
 * Initialization: You start with an array of size 26 (boolean[] alphabet = new
 * boolean[26];). All values in this array are initially set to false.
 * 
 * Each index in the array corresponds to a letter of the alphabet:
 * 
 * Index 0 corresponds to 'a'
 * 
 * Index 1 corresponds to 'b'
 * 
 * Index 2 corresponds to 'c'
 * 
 * ... up to index 25, which corresponds to 'z'.
 * 
 * For each character in the sentence:
 * 
 * If the character is a letter (using Character.isLetter(c)), we calculate the
 * index of that letter in the alphabet using index = c - 'a'.
 * 
 * Marking the Letter as Present:
 * 
 * We then set the corresponding index in the alphabet array to true:
 * 
 * alphabet[index] = true;
 * 
 * For example, if we encounter the letter 'b', the index calculated is 1 (as
 * shown earlier). So, the code does:
 * 
 * alphabet[1] = true;
 * 
 * Final Check:
 * 
 * After processing the entire sentence, we check if every position in the
 * alphabet array is true. If all positions are true, it means all 26 letters
 * were found in the sentence, and the sentence is a pangram.
 * 
 * 
 * Let’s walk through an example with the sentence
 * "The quick brown fox jumps over the lazy dog".
 * 
 * Initialization:
 * 
 * The array alphabet starts with all false values:
 * 
 * alphabet = [false, false, false, false, ..., false] (26 elements)
 * 
 * Process each character:
 * 
 * The sentence is "The quick brown fox jumps over the lazy dog". We go through
 * each character:
 * 
 * 'T' → 't' (after converting to lowercase), which corresponds to index 19. So,
 * alphabet[19] = true.
 * 
 * 'h' → index 7. So, alphabet[7] = true.
 * 
 * 'e' → index 4. So, alphabet[4] = true.
 * 
 * ' ' (space) → ignore.
 * 
 * 'q' → index 16. So, alphabet[16] = true.
 * 
 * 'u' → index 20. So, alphabet[20] = true.
 * 
 * 'i' → index 8. So, alphabet[8] = true.
 * 
 * 'c' → index 2. So, alphabet[2] = true.
 * 
 * And so on for the entire sentence.
 * 
 * After processing the sentence, the alphabet array will look like this:
 * 
 * alphabet = [true, true, true, true, true, true, true, true, true, true, true,
 * true, true, true, true, true, true, true, true, true, true, true, true, true,
 * true, true]
 * 
 * Every index from 0 to 25 is true, meaning every letter from 'a' to 'z' was
 * found at least once in the sentence.
 * 
 * Final Check:
 * 
 * Since every index in the alphabet array is true, the program will return
 * true, indicating that the sentence is indeed a pangram.
 * 
 * Summary:
 * 
 * The key operation c - 'a' converts the character c into its position in the
 * alphabet (starting from 0 for 'a').
 * 
 * This allows us to track which letters appear in the sentence using the
 * alphabet array.
 * 
 * At the end, if all positions in the array are true, the sentence is a
 * pangram.
 * 
 */