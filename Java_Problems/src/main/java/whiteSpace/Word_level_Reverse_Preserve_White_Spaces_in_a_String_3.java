package whiteSpace;

public class Word_level_Reverse_Preserve_White_Spaces_in_a_String_3 {

	public static void main(String[] args) {
String s = "I am Not a String";
        System.out.println("input: " + s);
        // Split the input string into words
        String[] words = s.split(" ");
        
        // Reverse each word and print them in the same order
        String rev = "";
        for (String word : words) {
            String reversedWord = "";
            
            // Reverse the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            
            // Add the reversed word to the result
            rev += reversedWord + " ";
        }
        
        // Output the final result (trim to remove the trailing space)
        System.out.println("rev: " + rev.trim());

	}

}

/*

input: I am Not a String

result: I ma toN a gnirtS

*/