package count_and_print_the_number_of_A;

import java.util.Scanner;

public class Count_and_print_the_number_of_A {

	public static void main(String[] args) {
		// write a program to count and print the number of 'A's in a given string java
		
		// counts and prints the number of occurrences of the letter 'A' (both uppercase and lowercase) in a given string.
		
		
		 // Program to count occurrence of specific word in a sentence

        // Input: Sentence
        String sentence = "Java is a versatile language. Java is widely used."; // Hardcoded sentence

        // Input: Word to count
        String word = "Java"; // Hardcoded word to search for

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


/*

Scanner Class: Used to take input from the user.

Input Prompt: The program asks the user to enter a string.

Counting Method: The countAs method iterates over each character in the string, checking if it is 'A' or 'a' and increments the count accordingly.

Output: Finally, the program prints the total count of 'A's found in the string.

*/