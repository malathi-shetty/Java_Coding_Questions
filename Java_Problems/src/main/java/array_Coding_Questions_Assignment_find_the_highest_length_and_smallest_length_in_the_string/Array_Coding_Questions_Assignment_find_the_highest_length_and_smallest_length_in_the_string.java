package array_Coding_Questions_Assignment_find_the_highest_length_and_smallest_length_in_the_string;

public class Array_Coding_Questions_Assignment_find_the_highest_length_and_smallest_length_in_the_string {

	public static void main(String[] args) {
		// Can you find the highest length and smallest length in the string = "Priyanka
		// is a trainer";

		String a = "Priyanka is a trainer";

		// Split the sentence into words
		String[] words = a.split(" ");

		// Initialize variables to hold the longest and shortest words
		String longestWord = "";
		String shortestWord = words[0]; // Start with the first word as the shortest

		// Iterate through the words
		for (String word : words) {
			// Check for the longest word
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
			// Check for the shortest word
			if (word.length() < shortestWord.length()) {
				shortestWord = word;
			}
		}

		// Output the results
		System.out.println("Longest word: " + longestWord);
		System.out.println("Shortest word: " + shortestWord);
	}
}

/*
 * 
 * 
 * Split the string into individual words.
 * 
 * Iterate through the words to determine the longest and shortest ones.
 ****
 * 
 * 
 * Splitting the Sentence:
 * 
 * The split(" ") method breaks the sentence into an array of words based on
 * spaces.
 * 
 * Initialization:
 * 
 * longestWord is initialized to an empty string, and shortestWord is
 * initialized to the first word in the array.
 * 
 * Iteration:
 * 
 * The for loop checks each word's length:
 * 
 * If a word is longer than longestWord, it updates longestWord.
 * 
 * If a word is shorter than shortestWord, it updates shortestWord.
 * 
 * Output:
 * 
 * Finally, it prints the longest and shortest words found.
 * 
 * Result
 * 
 * When you run this code, it will output:
 * 
 * Longest word: Priyanka
 * 
 * Shortest word: a
 * 
 */