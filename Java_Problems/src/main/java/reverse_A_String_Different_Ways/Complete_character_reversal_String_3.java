package reverse_A_String_Different_Ways;

import java.util.Scanner;

public class Complete_character_reversal_String_3 {

	public static void main(String[] args) {
		 // Create a Scanner object for input
		String s = "Java coding questions";
		System.out.println("s: " + s);
        
        // Convert the string to a character array
        char[] a = s.toCharArray();
        
        // Initialize pointers for start and end
        int start = 0;
        int end = a.length - 1;
        
        // Loop to reverse the string
        while (start < end) {
            // Swap characters at start and end
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
            // Move pointers towards the center
            start++;
            end--;
        }
        
        // Convert the character array back to a string
        String reversedString = new String(a);
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
        
      

	}

}

/*output:
 * 
 * s: Java coding questions
Reversed string: snoitseuq gnidoc avaJ


 */

/*

The program takes a string input from the user.

It converts the string to a character array so that we can manipulate each character individually.

It uses a while loop to swap the characters from the start and end of the array until the middle of the string is reached.

Finally, the reversed array is converted back to a string and printed.

*/