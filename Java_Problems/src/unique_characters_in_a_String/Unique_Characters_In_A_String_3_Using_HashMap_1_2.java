package unique_characters_in_a_String;

import java.util.HashMap;

public class Unique_Characters_In_A_String_3_Using_HashMap_1_2 {

	public static void main(String[] args) {
		 String s = "hello world!";
	        findUniqueAndRepeatedCharacters(s);
	    }

	    public static void findUniqueAndRepeatedCharacters(String str) {
	        HashMap<Character, Integer> charCount = new HashMap<>();

	        // Count occurrences of each character
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i); // Get the character at index i
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        // Build strings for unique and repeated characters
	        StringBuilder uniqueChars = new StringBuilder();
	        StringBuilder repeatedChars = new StringBuilder();

	        for (Character c : charCount.keySet()) {
	            int count = charCount.get(c);
	            if (count == 1) {
	                uniqueChars.append(c);
	            } else {
	                repeatedChars.append(c).append(": ").append(count).append(" times\n");
	            }
	        }

	        // Print results
	        System.out.println("Unique Characters: " + uniqueChars.toString());
	        System.out.println("Repeated Characters:\n" + repeatedChars.toString());
	    }
	}

/*
 * Two StringBuilder objects are used: uniqueChars for unique characters and repeatedChars for repeated characters.
The method checks the count_Number_of_Words_in_a_String of each character. If the count_Number_of_Words_in_a_String is 1, the character is appended to uniqueChars. 
If the count_Number_of_Words_in_a_String is greater than 1, the character and its count_Number_of_Words_in_a_String are appended to repeatedChars.
The method prints both unique characters and repeated characters with their counts.

Unique Characters: The output shows the characters that appear exactly once in the string.
Repeated Characters: The output also lists characters that appear more than once, along with their respective counts.
*/
