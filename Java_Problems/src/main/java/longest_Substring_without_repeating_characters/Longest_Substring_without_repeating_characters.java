package longest_Substring_without_repeating_characters;

import java.util.HashSet;

public class Longest_Substring_without_repeating_characters {

	public static void main(String[] args) {
		// Longest sub string should not contain repetative characters

		String s = "abcabcabcdabcdeabcdef";

        int maxlength = 0;
        int left = 0;
        String longestSubString = "";
        HashSet<Character> set = new HashSet<>();

        // Iterate over the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Move the left pointer until the repeating character is removed
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // Check if the current window is the largest seen so far
            if (right - left + 1 > maxlength) {
                maxlength = right - left + 1;
                longestSubString = s.substring(left, right + 1);
            }
        }

        // Output the longest substring
        System.out.println("Longest substring without repeating characters: " + longestSubString);
    
	}

}

/*
 * 
 * Input string:
 * 
You have a string s = "abcabcabcdabcdeabcdef";.

Variables:

maxlength: Keeps track of the length of the longest substring without repeating characters.

left: Left pointer of the sliding window.

right: Right pointer of the sliding window (used to expand the window).

longestSubString: Holds the actual longest substring found.

set: A HashSet used to track the characters currently in the sliding window.

Algorithm:

You iterate over the string with the right pointer.

If the character at right is already in the set (meaning it's a repeat), you move the left pointer to the right, removing characters from the set until the repeating character is removed.

After ensuring no repeats in the window, you check if the length of the current window (right - left + 1) is greater than the previously found longest substring. If it is, update maxlength and store the corresponding substring.

Key Idea: This is an efficient approach for finding the longest substring without repeating characters using the sliding window technique.

Output:

For the string "abcabcabcdabcdeabcdef", the output will be:


Longest substring without repeating characters: abcde

Explanation:

The longest substring without repeating characters in "abcabcabcdabcdeabcdef" is "abcde", which has a length of 5.

The code efficiently slides the window and finds the substring with no repeated characters.

*/
