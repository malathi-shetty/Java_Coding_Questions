package whiteSpace;

public class Word_Order_Reversing_a_String_with_whitespace_preserved {

	public static void main(String[] args) {
		 String s = "Java   Coding   Questions";
	        String r = reverseWords(s);
	        System.out.println("Original String: " + s);
	        System.out.println("Reversed Words String: " + r);
	    }

	    public static String reverseWords(String s) {
	        String[] words = s.split(" "); // Split based on space, preserving extra spaces
	        String r = "";

	        // Reverse words in the array
	        for (int i = words.length - 1; i >= 0; i--) {
	            r += words[i]; // Concatenate the word
	            if (i != 0) {
	                r += " "; // Add a space between words
	            }
	        }

	        return r;

	}

}

/*

Original String: Java   Coding   Questions

Reversed Words String: Questions   Coding   Java

*/