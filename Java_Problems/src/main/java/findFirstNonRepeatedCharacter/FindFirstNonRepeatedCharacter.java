package findFirstNonRepeatedCharacter;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String s = "NonRepeated";  // You can change this string to test other cases
        //   String s ="aabbcc";  // Uncomment this line to test the "all characters are repeated" case
        // String s ="a";
    	
    	findNonRepeatingCharacter(s);
    }

    private static void findNonRepeatingCharacter(String s) {
        // Convert string to lowercase for case-insensitive comparison
        String lowerCaseString  = s.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character in the lowercase string
        for (int i = 0; i < lowerCaseString.length(); i++) {
            map.put(lowerCaseString.charAt(i), map.getOrDefault(lowerCaseString.charAt(i), 0) + 1);
        }

        // Flag to check if we found a non-repeating character
        boolean foundNonRepeating = false;

        // Now, check for the first character in the original string
        // to preserve the case of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (map.get(lowerCaseString.charAt(i)) == 1) {
                System.out.print(s.charAt(i));  // Print original character (case-sensitive)
                foundNonRepeating = true; // We found the first non-repeating character
                break;
            }
        }

        // If no non-repeating character is found, print the message
        if (!foundNonRepeating) {
            System.out.println("All characters are repeated.");
        }
    }
}


/*
 * 
 * 
 * 
 * Converting the string to lowercase:

First convert the input string s to lowerCaseString using s.toLowerCase() to make the comparison case-insensitive. This ensures that characters like 'N' and 'n' are treated the same when counting frequencies, but the case of the characters is preserved when printing the result.

Counting frequency:

A HashMap is used to count the frequency of each character in the lowerCaseString. For each character in lowerCaseString, the code updates its count in the map.

Identifying the first non-repeated character:

After counting the frequencies, the program iterates through the original string (s) (not the lowercase string) to find the first character whose count in map is 1. This preserves the case of the first non-repeated character in the original string. If the first non-repeated character is 'N' in the input string, it will print 'N', even if the comparison is case-insensitive during counting.

Edge Cases:

If all characters are repeated (e.g., "aabbcc"), the program prints "All characters are repeated.".

If the string consists of a single character (e.g., "a"), that character is printed since it’s non-repeating.

Flag foundNonRepeating:

The program uses a boolean flag foundNonRepeating to check if any non-repeating character is found. If no non-repeating character is found, the message "All characters are repeated." is printed.


*/
