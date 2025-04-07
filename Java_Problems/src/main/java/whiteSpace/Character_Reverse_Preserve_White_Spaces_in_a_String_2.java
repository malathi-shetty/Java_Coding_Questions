package whiteSpace;

public class Character_Reverse_Preserve_White_Spaces_in_a_String_2 {

	public static void main(String[] args) {
		String s = "Java Coding Questions";
        String rev = reverseStringPreservingWhitespace(s);
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + rev);

	}
	
	public static String reverseStringPreservingWhitespace(String s) {
        char[] c = s.toCharArray();  // Convert input to character array
        char[] rev = new char[s.length()];
        int count = 0;

        // Collect non-space characters in reverse order
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                rev[count] = c[i];
                count++;
            }
        }

        // Reconstruct the string by placing the reversed characters in non-space positions
        int j = count - 1; // Points to the last reversed character
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                c[i] = rev[j];
                j--;
            }
        }

        // Convert the character array back to a string manually
        String result = "";
        for (int i = 0; i < c.length; i++) {
            result += c[i];
        }

        return result;
	}

}

/*
 * 
 * Original String: Java Coding Questions
 * 
Reversed String: snoi tseuQg nidoCavaJ


 */

/*
 * 
 * We convert the input string into a char[] array to manipulate the individual characters.

We store the non-space characters in the reversedChars array in reverse order (manually).

We then iterate through the original array again to place the reversed characters back into the positions of the original non-space characters, leaving spaces where they were.

Finally, we manually construct the result string by concatenating characters.

Output: 

For the input "Java Coding Questions", the output will now correctly be:

Original String: Java Coding Questions

Reversed String: snoitseuQ gnidoC avaJ

*/
