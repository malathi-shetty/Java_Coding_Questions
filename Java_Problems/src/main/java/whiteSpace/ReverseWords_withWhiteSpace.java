package whiteSpace;

public class ReverseWords_withWhiteSpace {

	public static void main(String[] args) {
		/*Reverse Each Word in a Sentence:
		
		Given "abc de f", reverse each word individually while keeping spaces in place. The expected output is "fed cb a". (No explanation was given, so I had to interpret and solve it myself.)
*/
		  // Input sentence
        String sentence = "abc de f";

        // Reverse each word in the sentence
        String result = reverseWords(sentence);

        // Print the result
        System.out.println("Reversed Sentence: " + result);
    }

    public static String reverseWords(String sentence) {
        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");

        // StringBuilder to store the final result
        StringBuilder reversedSentence = new StringBuilder();

        // Loop through each word in the array
        for (String word : words) {
            // Reverse each word and append it to the result
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" "); // Add a space after each word
        }

        // Remove the last extra space at the end
        return reversedSentence.toString().trim();
		
	}

}

/*

To reverse each word in a sentence individually while maintaining the spaces in place, you can follow this approach:

Steps:

Split the sentence into individual words based on spaces.

Reverse each word.

Rebuild the sentence by joining the reversed words back together while preserving the spaces.

Input Sentence: The sentence "abc de f" is the input.

Splitting the Sentence: The sentence is split into words using the split(" ") method, which divides the string by spaces.

Reversing Each Word: For each word, we reverse it using StringBuilder's reverse() method.

Rebuilding the Sentence: The reversed words are appended back into a StringBuilder, with spaces added between each reversed word.

Trimming Extra Space: After the loop, we remove the trailing space using trim() before returning the final sentence.

Example:

For the input string "abc de f":

Splitting the Sentence:

The sentence will be split into words: ["abc", "de", "f"].

Reversing Each Word:

Reverse "abc" → "cba"

Reverse "de" → "ed"

Reverse "f" → "f"

Rebuilding the Sentence:

Join the reversed words with spaces: "cba ed f"

Output:

Reversed Sentence: cba ed f

This approach successfully reverses each word individually while keeping spaces intact.


*/