package whiteSpace;

public class How_To_Preserve_White_Spaces_in_a_String_3 {

	public static void main(String[] args) {
String input = "I Am Not String";
        
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Reverse each word and print them in the same order
        String result = "";
        for (String word : words) {
            String reversedWord = "";
            
            // Reverse the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            
            // Add the reversed word to the result
            result += reversedWord + " ";
        }
        
        // Output the final result (trim to remove the trailing space)
        System.out.println(result.trim());

	}

}

// Output: I mA toN gnirtS