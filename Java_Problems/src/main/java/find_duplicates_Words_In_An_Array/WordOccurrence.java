package find_duplicates_Words_In_An_Array;

import java.util.HashMap;

public class WordOccurrence {

	public static void main(String[] args) {
		 String sentence = "my name is Rohan Rohan";
	        countWordOccurrences(sentence);
	    }

	    public static void countWordOccurrences(String sentence) {
	        // Use a HashMap to store the words and their counts
	        HashMap<String, Integer> wordCount = new HashMap<>();

	        // Split the sentence into words using space as delimiter
	        String[] words = sentence.split(" ");

	        // Iterate through each word in the array
	        for (String word : words) {
	            // Remove leading and trailing spaces and convert to lowercase to handle case sensitivity
	            word = word.trim();

	            // Check if the word is already in the map
	            if (wordCount.containsKey(word)) {
	                // If it exists, increment the count
	                wordCount.put(word, wordCount.get(word) + 1);
	            } else {
	                // If it doesn't exist, add the word with count 1
	                wordCount.put(word, 1);
	            }
	        }

	        // Print the words and their counts
	        for (String word : wordCount.keySet()) {
	            System.out.println(word + " → " + wordCount.get(word) + " time(s)");
	        }
	    
}
}


/*
 * 
 * Count Word Occurrences in a Sentence:
 * 
Given a string like "my name is Rohan Rohan", the goal is to print each word along with how many times it appears.

"Rohan" → 2 times

Other words → 1 time each
 
To count the occurrences of each word in a sentence, you can follow these steps:

Split the sentence into individual words.

Use a data structure (like a HashMap in Java) to store each word and its corresponding count.

Traverse the sentence, updating the count for each word.

Finally, print out each word along with its occurrence.

HashMap<String, Integer> wordCount:

We use a HashMap to store each word (as the key) and its count (as the value). This allows us to efficiently look up and update the count for each word.

String[] words = sentence.split(" "):

We split the input sentence into words using the split(" ") method. This creates an array of words where each element is a word from the sentence.

Looping through words:

We loop through each word in the array. For each word:

We check if it's already in the HashMap. If it is, we increment its count.

If it's not in the map, we add it with an initial count of 1.

Printing results:

Finally, we loop through the HashMap and print each word along with its count.

Example:

For the input "my name is Rohan Rohan", the output will be:

my → 1 time(s)

name → 1 time(s)

is → 1 time(s)

Rohan → 2 time(s)

Key Considerations:

Whitespace Handling: If the sentence contains extra spaces (like multiple spaces between words), split(" ") will still correctly split the sentence into words.

Case Sensitivity: The words are case-sensitive. If you want to count "Rohan" and "rohan" as the same word, you can convert all words to lowercase using word = word.toLowerCase(); inside the loop.

*/