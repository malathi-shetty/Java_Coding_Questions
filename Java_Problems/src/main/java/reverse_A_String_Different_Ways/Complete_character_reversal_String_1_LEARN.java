package reverse_A_String_Different_Ways;

public class Complete_character_reversal_String_1_LEARN {

	public static void main(String[] args) {
		 String s = "I Am Not a String"; // Original string
		 System.out.println("Original string: " + s);
		 
	        //Step 1: Split the input string into words
	        String[] words = s.split(" ");
	        
	        // Step 2: Reverse the words and print them in reverse order
	        String result = "";
	        for (int i = words.length - 1; i >= 0; i--) {
	            String word = words[i];
	            String reversedWord = "";
	            
	            // Reverse each individual word
	            for (int j = word.length() - 1; j >= 0; j--) {
	                reversedWord += word.charAt(j);// Concatenate each character in reverse order
	            }
	            
	            // Step 3: Concatenate the reversed word to the result
	            result += reversedWord + " ";
	        }
	        
	        // Step 4: Output the final result
	        System.out.println("Reversed string: " + result.trim()); // trim() removes trailing space

	}

}

/*
Output: 

Original string: I Am Not a String
Reversed string: gnirtS a toN mA I

*/

/*

Method 1: Using String Splitting and Word Reversal
This method splits the string into individual words, reverses each word, and then concatenates the reversed words back together to form a reversed sentence.

Steps:
Split the string into words using a space as the delimiter.

Reverse each word individually.

Join the reversed words back together into a final string.

Print the result.

Split the string: We use the split(" ") method to break the original string into individual words by spaces.

For example, "I Am Not String" becomes ["I", "Am", "Not", "String"].

Reverse each word: We iterate over the characters of each word in reverse order using a for loop.

For "String", it gets reversed to "gnirtS".

Concatenate the reversed words: We concatenate the reversed word with a space to maintain the word separation in the final string.

For "gnirtS toN mA I".

Output: Finally, we print the result after trimming any extra spaces at the end.

How it works:
The original sentence is "I Am Not String".

Step 1 splits it into words: ["I", "Am", "Not", "String"].

Step 2 reverses each word:

"I" → "I"

"Am" → "mA"

"Not" → "toN"

"String" → "gnirtS"

Step 3 combines the reversed words into the final result: "gnirtS toN mA I".

*/
