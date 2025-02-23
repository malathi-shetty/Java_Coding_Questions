package whiteSpace;

public class How_To_Preserve_White_Spaces_in_a_String_4 {

	public static void main(String[] args) {
		// String input = "a b c d";
		 String input = "Java Coding Questions";
	        String result = reversePreservingSpaces(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + result);
	    }

	    public static String reversePreservingSpaces(String str) {
	        // Convert the string into a character array for easy manipulation
	        char[] charArray = str.toCharArray();
	        int n = charArray.length;

	        // Create a list to store non-space characters
	        StringBuilder letters = new StringBuilder();

	        // Collect all non-space characters
	        for (char c : charArray) {
	            if (c != ' ') {
	                letters.append(c);
	            }
	        }

	        // Reverse the collected non-space characters
	        letters.reverse();

	        // Pointer for the reversed non-space characters
	        int letterIndex = 0;

	        // Build the final string
	        for (int i = 0; i < n; i++) {
	            if (charArray[i] != ' ') {
	                // Replace non-space character with the next reversed character
	                charArray[i] = letters.charAt(letterIndex);
	                letterIndex++;
	            }
	        }

	        // Return the result as a string
	        return new String(charArray);
}
}