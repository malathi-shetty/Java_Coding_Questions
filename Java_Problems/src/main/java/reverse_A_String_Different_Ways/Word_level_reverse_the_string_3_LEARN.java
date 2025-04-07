package reverse_A_String_Different_Ways;

public class Word_level_reverse_the_string_3_LEARN {

	public static void main(String[] args) {
		// Logic: Reverse each word while maintaining spaces
        String s = "Java coding questions";
        System.out.println("s: " + s);
        String[] words = s.split(" "); // Split by spaces to get individual words
        
        String rev = ""; // Initialize empty string to hold the result

        // Loop through each word
        for (String word : words) {
            char[] a = word.toCharArray(); // Convert each word into a character array
            int len = a.length;
            
            // Reverse the characters of the word
            String reversedWord = ""; // Temporary string to hold the reversed word
            for (int i = len - 1; i >= 0; i--) {
                reversedWord += a[i]; // Reverse the characters of the current word
            }

            // Add the reversed word to the result with a space after it
            rev += reversedWord + " "; // Append space after each reversed word
        }

        // Output the final result, trimming any extra space at the end
        System.out.println("Reversed String with Space Maintained: " + rev.trim());
   

	}

}


/*
 * Output: 
 * s: Java coding questions

* Reversed String with Space Maintained: avaJ gnidoc snoitseuq
 * 
 */

/*

Splitting the string: We use split(" ") to break the string into an array of words.

Reversing the characters: For each word, we use a char[] array to store the characters of the word. Then we iterate through the array from the last character to the first and append each character to a temporary string (reversedWord).

Concatenating the result: After reversing each word, we append it to the result string (rev) along with a space.

Important Notes:

The result string rev is being constructed by concatenating individual characters and words. Keep in mind that string concatenation with + in loops may not be as efficient as StringBuilder for larger inputs, but it works fine for smaller or moderate-sized strings.
*/


/*

Splitting the String: We split the input string into an array of words using split(" ").

Reversing Each Word: For each word, we convert it to a char[] array to manipulate individual characters. We then reverse the characters by iterating from the end of the word to the beginning.

Concatenating Results: After reversing each word, we append it to the result string rev with a space.

Code Breakdown:

1. Input String:

String s = "Java coding questions";

We start by declaring a string s that contains the sentence "Java coding questions".

This string will be the input that we want to manipulate.

2. Splitting the String:

String[] words = s.split(" ");

The split(" ") method is used to break the sentence into individual words. It splits the string at each space character (" ").

Result of split(" "): It will return an array words containing the individual words:

words[0] = "Java"

words[1] = "coding"

words[2] = "questions"

3. Setting up for Word Reversal:

String rev = ""; // Initialize an empty string to hold the reversed result

We initialize an empty string rev that will hold the final result after reversing each word.

Why rev is initialized here: This is where we will accumulate the reversed words, one by one.

4. Looping through each word:

for (String word : words) {

    char[] a = word.toCharArray(); // Convert each word into a character array
    
    int len = a.length;
    
We loop through each word in the words array using an enhanced for loop (for (String word : words)).

In the first iteration, word = "Java".

In the second iteration, word = "coding".

In the third iteration, word = "questions".

For each word, we convert the word to a character array using word.toCharArray().

Why toCharArray()? It breaks down the word into an array of characters, which makes it easier to manipulate each individual character.

For example:

For word = "Java", a = ['J', 'a', 'v', 'a'].

For word = "coding", a = ['c', 'o', 'd', 'i', 'n', 'g'].

5. Reversing Each Word:

String reversedWord = ""; // Temporary string to hold the reversed word

for (int i = len - 1; i >= 0; i--) {

    reversedWord += a[i]; // Append each character in reverse order
    
}
We initialize an empty string reversedWord to build the reversed version of each word.

We then loop through the character array a backwards:

We start from the last character (len - 1) and move towards the first character (i >= 0).

Why loop backwards? By iterating in reverse order, we are essentially reversing the word.

Each character a[i] is appended to reversedWord. This builds the word from the end to the beginning.

For example:

When word = "Java", a = ['J', 'a', 'v', 'a']:

In the first loop iteration: reversedWord = "a"

In the second iteration: reversedWord = "av"

In the third iteration: reversedWord = "ava"

In the fourth iteration: reversedWord = "avaJ"

When word = "coding", a = ['c', 'o', 'd', 'i', 'n', 'g']:

In the first loop iteration: reversedWord = "g"

In the second iteration: reversedWord = "gn"

In the third iteration: reversedWord = "gni"

In the fourth iteration: reversedWord = "gnid"

In the fifth iteration: reversedWord = "gnido"

In the sixth iteration: reversedWord = "gnidoc"

6. Appending the Reversed Word to the Result:

rev += reversedWord + " "; // Append reversed word with a space to the result

After reversing the word, we append the reversed word (reversedWord) to the result string rev.

We also append a space (" ") after each word so that the final result will have proper spacing between words.

After the first iteration (word = "Java"), the rev string becomes "avaJ ".

After the second iteration (word = "coding"), the rev string becomes "avaJ gnidoc ".

After the third iteration (word = "questions"), the rev string becomes "avaJ gnidoc snoitseuq ".

7. Final Output:

System.out.println("Reversed String with Words Maintained: " + rev.trim());

Finally, we print the result string rev after trimming any leading or trailing spaces using rev.trim().

Why trim()? It removes any extra space that may be left after the last word.

In this case, "avaJ gnidoc snoitseuq " becomes "avaJ gnidoc snoitseuq" (without trailing space).

Output:

s: Java coding questions

Reversed String with Words Maintained: avaJ gnidoc snoitseuq

Summary of Key Concepts:

Splitting the string: We use split(" ") to break the string into words, creating an array of words.

Reversing each word: We convert each word to a character array and loop backward through it to reverse the characters.

String concatenation: We build the final result string by concatenating the reversed words, separating them by spaces.

Why not StringBuilder? The code works without StringBuilder but is less efficient for large strings because strings are immutable in Java (each concatenation creates a new string).

This approach gives you a solid understanding of how strings can be split and manipulated at the character level. The main takeaway here is the technique of reversing each word while maintaining the original word order.





*/