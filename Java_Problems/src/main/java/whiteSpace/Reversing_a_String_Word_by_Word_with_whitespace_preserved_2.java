package whiteSpace;

public class Reversing_a_String_Word_by_Word_with_whitespace_preserved_2 {

	public static void main(String[] args) {
		 String s = "I Am Not String";
	        
	        // Split the input string into words
	        String[] words = s.split(" ");
	        
	        // Reverse the words and print them in reverse order
	        String result = "";
	        for (int i = words.length - 1; i >= 0; i--) {
	            String word = words[i];
	            String reversedWord = "";
	            
	            // Reverse the current word
	            for (int j = word.length() - 1; j >= 0; j--) {
	                reversedWord += word.charAt(j);
	            }
	            
	            // Concatenate the reversed word to the result
	            result += reversedWord + " ";
	        }
	        
	        // Output the final result
	        System.out.println(result.trim());

	}

}
