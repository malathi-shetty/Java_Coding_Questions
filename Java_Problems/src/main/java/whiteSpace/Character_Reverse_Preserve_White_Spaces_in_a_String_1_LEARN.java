package whiteSpace;

public class Character_Reverse_Preserve_White_Spaces_in_a_String_1_LEARN {

	public static void main(String[] args) {
		reverseString("I am Not a String");

		reverseString("JAVA JSP ANDROID");

		reverseString("1 22 333 4444 55555");
	}
	
	static void reverseString(String s) {
		// Converting inputString i.e a to char array 'inputStringArray' i.e s

		char[] a = s.toCharArray(); //	Convert input string into a char array

		// Defining a new char array 'resultArray' i.e result with same size as
		// inputStringArray

		char[] r = new char[a.length]; //Create result array of same length

		// First for loop :
		// For every space in the 'inputStringArray',
		// we insert spaces in the 'resultArray' at the corresponding positions

		for (int i = 0; i < a.length; i++) { // Loop through each character
			if (a[i] == ' ') { //	If current char is space...
				r[i] = ' ';    // ...copy it to same position in result array
			}
		}

		// Initializing 'j' with length of resultArray

		int j = r.length - 1; // Start filling result from end

		// Second for loop :
		// we copy every non-space character of inputStringArray
		// from first to last at 'j' position of resultArray

		for (int i = 0; i < a.length; i++) { //Loop again to reverse non-space characters
			if (a[i] != ' ') { //Process only non-space characters
				// If resultArray already has space at index j then decrementing 'j'

				if (r[j] == ' ') { //Skip preserved spaces in result
					j--;  
				}

				r[j] = a[i];   //Assign character to the correct reversed position

				j--;           //Move backward in result array
			}
		}

		System.out.println(s + " ---> " + String.valueOf(r)); //Print the original and modified strings
	}

	
}


/*
 * 
 * I am Not a String ---> g ni rtS a toNmaI
 * 
JAVA JSP ANDROID ---> DIOR DNA PSJAVAJ

1 22 333 4444 55555 ---> 5 55 554 4443 33221

 */

/*
 * "Preserving the position of spaces" refers to maintaining the exact placement
 * of spaces within a text when performing a task, like copying, formatting, or
 * modifying the text. This means that the number and location of spaces between
 * words, sentences, and paragraphs stay unchanged, even if the content is
 * altered or restructured in some way.
 * 
 * 
 * 
 * The goal is to reverse the string, but the spaces in the string should remain
 * at the same positions as in the original string. The characters that are not
 * spaces should be reversed.
 * 
 * Explanation:
 * 
 * 1. Convert Input String to Char Array
 * 
 * char[] a = s.toCharArray();
 * 
 * The input string s is converted into a character array a. This allows for
 * easier manipulation of each character in the string.
 * 
 * 2. Initialize the Result Array
 * 
 * char[] r = new char[a.length];
 * 
 * A new character array r is created, with the same length as the input array
 * a. This will store the final result after processing. Initially, it will be
 * empty and hold the reversed characters.
 * 
 * 3. Preserve Spaces in the Result Array (First Loop)
 * 
 * for (int i = 0; i < a.length; i++) {
 * 
 * if (a[i] == ' ') {
 * 
 * r[i] = ' ';
 * 
 * }
 * 
 * }
 * 
 * This loop iterates over the input character array a.
 * 
 * If a space (' ') is found at any position, the same position in the result
 * array r is set to a space.
 * 
 * This ensures that all spaces are in the same position in the result array,
 * without modifying them.
 * 
 * 4. Initialize the j Variable
 * 
 * int j = r.length - 1; A variable j is initialized to the last index of the
 * result array r. This will be used to place the non-space characters in
 * reverse order.
 * 
 * 5. Copy Non-Space Characters in Reverse Order (Second Loop)
 * 
 * for (int i = 0; i < a.length; i++) {
 * 
 * if (a[i] != ' ') {
 * 
 * if (r[j] == ' ') {
 * 
 * j--;
 * 
 * }
 * 
 * r[j] = a[i];
 * 
 * j--;
 * 
 * } }
 * 
 * The second loop iterates through the input array a again.
 * 
 * If the character is not a space, it is placed into the result array r at the
 * current position j.
 * 
 * If the position j in r is already a space (because we preserved spaces in the
 * first loop), we decrement j to find the next available position.
 * 
 * After each non-space character is placed into the result array, j is
 * decremented to fill the next position for the next non-space character.
 * 
 * 6. Print the Result
 * 
 * System.out.println(s + " ---> " + String.valueOf(r));
 * 
 * After both loops have completed, the original string s and the modified
 * string (with reversed non-space characters) are printed.
 * 
 * The String.valueOf(r) converts the char[] array back into a string so that it
 * can be displayed.
 * 
 * Example Walkthrough
 * 
 * Let’s walk through the first example: "I Am Not String"
 * 
 * Step 1: Convert to Character Array
 * 
 * a = ['I', ' ', 'A', 'm', ' ', 'N', 'o', 't', ' ', 'S', 't', 'r', 'i', 'n',
 * 'g']
 * 
 * Step 2: Preserve Spaces in r
 * 
 * After the first loop, the r array becomes:
 * 
 * r = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '
 * ']
 * 
 * At this point, all the spaces are in the correct positions.
 * 
 * Step 3: Reverse Non-Space Characters
 * 
 * Now, we copy the non-space characters from a into r in reverse order:
 * 
 * The first non-space character is 'I', which gets placed in the last position
 * of r.
 * 
 * The second non-space character is 'A', placed in the second-to-last position,
 * and so on.
 * 
 * After the second loop, r becomes:
 * 
 * 
 * r = ['s', 't', 'r', 'i', 'n', 'g', ' ', 't', 'o', 'N', ' ', 'm', 'A', ' ',
 * 'I']
 * 
 * Step 4: Print the Final Result
 * 
 * Finally, the program prints the original and reversed strings:
 * 
 * 
 * I Am Not String ---> sgnirtS toN mA I --> g ni rtS toNmAI
 * 
 * Summary of the Approach
 * 
 * Spaces are preserved: In the first loop, all spaces are copied to the same
 * positions in the result array.
 * 
 * Reversing characters: In the second loop, all non-space characters are
 * reversed, and placed in the appropriate positions, leaving the spaces where
 * they were.
 * 
 * Efficiency: The process uses two loops over the input string, and the
 * operations are linear in time complexity, i.e., O(n), where n is the length
 * of the input string.
 * 
 * When to Use This Approach?
 * 
 * This approach is useful when you need to reverse a string while maintaining
 * the exact positions of spaces. It's particularly useful for string
 * manipulation problems where preserving formatting (such as spaces or specific
 * characters) is crucial.
 *
 * 
 * I Am Not String ---> g ni rtS toNmAI
 *
 * JAVA JSP ANDROID ---> DIOR DNA PSJAVAJ
 * 
 * 1 22 333 4444 55555 ---> 5 55 554 4443 33221
 *
 *
 *******
 
 This Java program reverses the non-space characters in a string while preserving the positions of spaces.
 
 1. Convert Input String to Character Array

char[] a = s.toCharArray();

The method toCharArray() is used to convert the input string s into a character array a. This makes it easier to manipulate individual characters in the string.

2. Initialize Result Array
 
 char[] result = new char[a.length];

A new character array result is created with the same length as the input string a. This array will hold the final result, which will be the string with reversed characters but spaces in their original positions.

3. Preserve Spaces in the Result Array (First Loop)
 
 for (int i = 0; i < a.length; i++) {
 
    if (a[i] == ' ') {
    
        result[i] = ' ';
        
    }
    
}

This loop iterates through each character in the input array a. If a space ' ' is encountered, it is directly placed in the same position in the result array.

This ensures that the spaces are preserved in the same positions as in the original string.

4. Initialize the j Variable
 
 int j = result.length - 1;

A variable j is initialized to the last index of the result array (i.e., result.length - 1). This variable will be used to place the non-space characters in reverse order.

5. Reverse Non-Space Characters (Second Loop)
 
for (int i = 0; i < a.length; i++) {

    if (a[i] != ' ') {
    
        if (result[j] == ' ') {
        
            j--;
            
        }
        
        result[j] = a[i];
        
        j--;
        
    }
    
} 
 
The second loop iterates through each character in the input string a again. If a character is not a space, it is placed in the result array at position j.

If result[j] is a space (which we preserved earlier), j is decremented to find the next available position.

After each non-space character is placed in result, j is decremented to continue placing characters in reverse order.

6. Print the Final Result

System.out.println(s + " ---> " + String.valueOf(result));

After both loops are complete, the program prints the original string (s) and the modified string, which is obtained by converting the result array back into a string using String.valueOf(result).

Example Walkthrough

Let's walk through the first example: "I Am Not String"

Step 1: Convert to Character Array

a = ['I', ' ', 'A', 'm', ' ', 'N', 'o', 't', ' ', 'S', 't', 'r', 'i', 'n', 'g']

The input string is converted into a character array a where each character (including spaces) is stored as an individual element.

Step 2: Preserve Spaces in result

result = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']

In the first loop, spaces from the input array a are copied into the same positions in the result array.

Step 3: Reverse Non-Space Characters

The non-space characters in a are placed into result in reverse order:

result = ['s', 't', 'r', 'i', 'n', 'g', ' ', 't', 'o', 'N', ' ', 'm', 'A', ' ', 'I']

The first non-space character I is placed in the last position of result, the second non-space character A goes in the second-to-last position, and so on.

The spaces are left unchanged in their positions.

Step 4: Print the Final Result

I Am Not String ---> sgnirtS toN mA I

Finally, the program prints both the original string and the modified string with the reversed characters but preserved spaces.

Output for Other Examples

"JAVA JSP ANDROID" ---> DIOR DNA PSJAVAJ

"1 22 333 4444 55555" ---> 5 55 554 4443 33221

Summary of the Approach

Spaces are preserved: In the first loop, all spaces are copied to the result array at the same indices.

Characters are reversed: In the second loop, all non-space characters are placed in reverse order in the result array.

Efficiency: The process runs in linear time, i.e., O(n), where n is the length of the input string. Each character is processed exactly once.

When to Use This Approach

This approach is useful when you need to reverse a string but must maintain the exact positions of spaces or other special characters. This can be useful for formatting problems, string manipulation challenges, or certain text processing tasks.
 
 
 
 
 
 
 *
 */
