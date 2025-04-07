package reverse_A_String_Different_Ways;

public class Word_level_reverse_the_string_with_StringBuilder_1 {

	public static void main(String[] args) {
		  // Logic: Reverse each word while maintaining spaces
        String s = "Java coding questions";
        System.out.println("s: " + s);
        String[] words = s.split(" "); // Split by spaces to get individual words
        
        StringBuilder rev = new StringBuilder(); // StringBuilder to efficiently handle string concatenation

        // Loop through each word
        for (String word : words) {
            char[] a = word.toCharArray(); // Convert each word into a character array
            int len = a.length;
            
            // Reverse the characters of the word
            StringBuilder reversedWord = new StringBuilder();
            for (int i = len - 1; i >= 0; i--) {
                reversedWord.append(a[i]); // Reverse the characters of the current word
            }

            // Add the reversed word to the result
            rev.append(reversedWord.toString()).append(" "); // Append space after each reversed word
        }

        // Output the final result, trimming any extra space at the end
        System.out.println("Reversed String with Words Maintained: " + rev.toString().trim());
  

	}

}


/*

s: Java coding questions

Reversed String with Words Maintained: avaJ gnidoc snoitseuq

*/