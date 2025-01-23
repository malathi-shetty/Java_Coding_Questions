package count_occurrence_of_specific_word_in_a_sentence;

import java.util.Scanner;

public class Count_occurrence_of_specific_word_in_a_sentence_2_learn {

	public static void main(String[] args) {
		// Program to count occurrence of specific word in a sentence
		Scanner scanner = new Scanner(System.in); //Java is a versatile language. Java is widely used. 

		// Input: Sentence
		System.out.println("Enter a sentence:");
		String sentence = scanner.nextLine();

		// Input: Word to count - Input the word to search for
		System.out.println("Enter the word to count:"); //Java
		String word = scanner.nextLine();

		// Close the scanner
		scanner.close();

		// Normalize case by converting both the sentence and word to lowercase
		String lowerCaseSentence = sentence.toLowerCase();
		String lowerCaseWord = word.toLowerCase();

		// Split the sentence into words (tokenize)
		String[] words = lowerCaseSentence.split("\\W+"); // Splits by non-word characters (punctuation, spaces, etc.)

		// Count occurrences of the specific word
		int count = 0;
		for (String w : words) {
			if (w.equals(lowerCaseWord)) {
				count++;
			}
		}

		// Output the result
		System.out.println("The word \"" + word + "\" appears " + count + " time(s) in the sentence.");
	}

}
