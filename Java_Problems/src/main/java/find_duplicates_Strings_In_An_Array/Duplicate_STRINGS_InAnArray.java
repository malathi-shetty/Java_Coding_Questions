package find_duplicates_Strings_In_An_Array;

public class Duplicate_STRINGS_InAnArray {

	public static void main(String[] args) {
		String str = "apple is red fruit found in a tree";
        char[] newobj = str.toCharArray(); // Convert the string into a character array
        
        System.out.println("The string is: " + str);
        System.out.println("Duplicate Characters in above string are: ");

        // Outer loop to iterate through each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = newobj[i];

            // Skip spaces
            if (currentChar == ' ') {
                continue;
            }
            
            

            // Check for duplicates in the rest of the string
            for (int j = i + 1; j < str.length(); j++) {
                if (currentChar == newobj[j]) {
                    // Print the character if it's the first time we're seeing it
                    // Mark the character in the array to avoid future matches
                    if (currentChar != ' ') {
                        System.out.println(currentChar + " "); // Print on a new line
                        // Mark all occurrences as processed by replacing them with a space
                        for (int k = 0; k < str.length(); k++) {
                            if (newobj[k] == currentChar) {
                            	newobj[k] = ' '; // Mark as processed
                            }
                        }
                    }
                    break; // Exit inner loop after printing the duplicate
                }
			}
		}
	}
}

/*
Outer Loop: Iterates through each character in the string.

Skip Spaces: If the current character is a space, it skips to the next iteration.

Duplicate Check: The inner loop checks for duplicates. If a duplicate is found, it prints the character.

Mark Processed: Instead of using a boolean, it replaces all occurrences of the duplicate character with a space in the character array to ensure it isn't printed again.
 */

