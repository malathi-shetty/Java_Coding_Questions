package store_each_word_separately;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store_each_word_separately {

	//Given a String “This is my framework”, use a collection and store each word separately like “This”, “is”, “my”, “framework”, and explain why you used that collection – I used HashMap
	
	public static void main(String[] args) {
		  // Given string
        String sentence = "This is my framework";

        // Split the sentence into words
        String[] wordsArray = sentence.split(" ");

        // Create a List to store words
        List<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));

        // Display the list of words
        System.out.println(wordsList);

	}

}

/*
To store each word from the string "This is my framework" separately, using a HashMap in Java is not the most appropriate choice. A HashMap is designed to store data in key-value pairs, making it ideal for scenarios where each key is associated with a specific value. For example, if you wanted to store each word along with its frequency of occurrence, a HashMap<String, Integer> would be suitable. ​


However, if your goal is simply to store each word independently without any associated values, collections like ArrayList or HashSet are more appropriate:​

ArrayList: Maintains the insertion order and allows duplicate elements.​

HashSet: Does not maintain insertion order but ensures that each element is unique.


Explanation:

String Splitting: The split(" ") method divides the sentence into an array of words based on spaces.​

Array to List Conversion: Arrays.asList(wordsArray) converts the array to a list, which is then used to initialize an ArrayList.​


Storage: The ArrayList wordsList now contains each word from the sentence as an individual element.​

Output:

[This, is, my, framework]
		
		Why Not HashMap:

			Using a HashMap in this context would require associating each word with a unique key, which is unnecessary if you're only interested in storing the words themselves without any associated data. Additionally, if you used words as keys, the HashMap would not allow duplicate words, which contradicts the goal of storing each word separately.​

			In summary, for storing individual words from a sentence without additional associations, collections like ArrayList or HashSet are more suitable than a HashMap.
			
			*/
		