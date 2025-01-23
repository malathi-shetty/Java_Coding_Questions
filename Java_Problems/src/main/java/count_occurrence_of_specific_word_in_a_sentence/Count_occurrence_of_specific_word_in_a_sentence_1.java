package count_occurrence_of_specific_word_in_a_sentence;

import java.util.Scanner;

public class Count_occurrence_of_specific_word_in_a_sentence_1 {

	public static void main(String[] args) {
		// Program to count occurrence of specific word in a sentence.
		Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence: "); // This is a simple sentence with a simple word.
        String sentence = scanner.nextLine(); 

        // Input the word to search for
        System.out.println("Enter the word to count: "); //simple
        String wordToCount = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Initialize a counter
        int count = 0;

        // Loop through the words and count occurrences of the specific word
        for (String word : words) {
            if (word.equalsIgnoreCase(wordToCount)) {
                count++;
            }
        }

        // Output the result
        System.out.println("The word '" + wordToCount + "' appears " + count + " times in the sentence.");
        
        scanner.close();
	}

}

/*

The program uses Scanner to read the input sentence and the word to be counted.

The sentence is split into words using the split("\\s+") method, which splits the string by spaces.

It iterates over the array of words and compares each word with the specified word, using equalsIgnoreCase() to make the comparison case-insensitive.

Finally, the program prints the count of the occurrences of the word in the sentence.

*/