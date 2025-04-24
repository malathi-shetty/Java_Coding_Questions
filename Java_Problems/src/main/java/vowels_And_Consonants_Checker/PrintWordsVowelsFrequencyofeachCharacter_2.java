package vowels_And_Consonants_Checker;

import java.util.HashMap;

public class PrintWordsVowelsFrequencyofeachCharacter_2 {

	public static void main(String[] args) {
		  // String to process
        String s = "Hello John Doe";
        
        // Counting words
        String[] words = s.split(" "); 
        int wordCount = words.length;
        
        // Counting vowels
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        String vowelDetails = ""; // For holding vowel details for each word
        
        for (String word : words) {
            String wordVowels = "";  // Store vowels for the current word
            
            // Loop through each character in the word
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                
                if (vowels.indexOf(c) != -1) {  // Check if the character is a vowel
                    vowelCount++;
                    wordVowels += c + " ";  // Add the vowel to the word's vowel list
                }
            }

            // Add the word and its vowels to the details string
            wordVowels = wordVowels.trim();  // Trim the trailing space
            vowelDetails += word + ": " + wordVowels;
            
            // Add a comma after each word except the last one
            if (!word.equals(words[words.length - 1])) {
                vowelDetails += ", ";
            }
        }
        
        // Counting frequency of each character
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {  // Ignore spaces
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Output results
        System.out.println("Word count: " + wordCount + " - " + s);
        System.out.println("Vowel count: " + vowelCount + " - " + vowelDetails);
        System.out.println("Character frequencies: " + charFrequency);

	}

}

/*

Explanation of Key Changes:
Word Count:

I split the input string by spaces (split(" ")) to count the words.

Vowel Count:

I loop through each word, check if a character is a vowel, and increment the vowel count.

I also store which vowels are in each word by concatenating them into a string (vowelDetails).

Character Frequency:

This is handled using a HashMap to track how many times each character appears in the string.

Output:

The output prints the word count, vowel count (with the vowels listed by word), and character frequencies.

Word count: 3 - Hello John Doe

Vowel count: 5 - Hello: e o, John: o, Doe: o e

Character frequencies: {D=1, e=2, H=1, h=1, J=1, l=2, n=1, o=3}

*/