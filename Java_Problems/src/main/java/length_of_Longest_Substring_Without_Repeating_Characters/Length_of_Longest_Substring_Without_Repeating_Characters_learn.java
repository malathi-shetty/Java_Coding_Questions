package length_of_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;

public class Length_of_Longest_Substring_Without_Repeating_Characters_learn {
	// Find the length of the longest substring without repeating characters.
	public static void main(String[] args) {

		String s = "abcabcbb";
		Length_of_Longest_Substring_Without_Repeating_Characters_learn newobj = new Length_of_Longest_Substring_Without_Repeating_Characters_learn();
		int result = newobj.lengthOfLongestSubstring(s);
		System.out.println("Length of the longest substring without repeating characters: " + result);
	}

	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		int left = 0, maxLength = 0;

		for (int right = 0; right < s.length(); right++) {
			// While there is a duplicate character, move the left pointer
			while (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left)); // Remove left character
				left++; // Move left pointer
			}
			set.add(s.charAt(right)); // Add right character
			int currentLength = right - left + 1; // Calculate current length
			maxLength = Math.max(maxLength, currentLength); // Update max length
		}
		return maxLength;
	}

}

/*
 * 
 * 
 * Problem:
 * 
 * We want to find the length of the longest part of a string where no character
 * repeats. For example, if we have the string "abcabcbb", the longest part
 * without repeating characters is "abc", which has a length of 3.
 * 
 * Code Walkthrough:
 * 
 * Input String: The code starts with a string, like "abcabcbb", and wants to
 * find the longest substring that doesn't have any repeated characters.
 * 
 * HashSet:
 * 
 * A HashSet is used to store the characters we've seen so far. The key feature
 * of a HashSet is that it doesn't allow duplicate values, which helps us
 * quickly check if a character has already appeared.
 * 
 * Two Pointers:
 * 
 * We use two pointers, left and right. Think of left as pointing to the start
 * of the current substring and right as the end. These pointers will help us
 * look at different parts of the string.
 * 
 * Initially, both pointers start at the beginning of the string.
 * 
 * Expanding the Substring:
 * 
 * We move the right pointer to explore new characters in the string.
 * 
 * If the character at the right pointer is not in the set (meaning it's not a
 * duplicate), we add it to the set and update the length of the current
 * substring.
 * 
 * We also keep track of the longest substring we've found so far (maxLength).
 * 
 * Shrinking the Substring:
 * 
 * 
 * If the character at the right pointer is already in the set (meaning it's a
 * duplicate), we move the left pointer to the right to make the substring
 * smaller and remove characters from the set until there's no duplicate. This
 * ensures that the substring only contains unique characters.
 * 
 * Final Answer:
 * 
 * 
 * After processing the whole string, the variable maxLength will hold the
 * length of the longest substring without repeating characters.
 * 
 * Example Walkthrough:
 * 
 * For the string "abcabcbb":
 * 
 * Start with left = 0, right = 0:
 * 
 * The character at right is 'a', which isn't in the set, so add it. The current
 * substring is "a" (length 1).
 * 
 * Move right to 1.
 * 
 * Now, right = 1:
 * 
 * The character at right is 'b', which isn't in the set, so add it. The current
 * substring is "ab" (length 2).
 * 
 * Move right to 2.
 * 
 * Now, right = 2:
 * 
 * The character at right is 'c', which isn't in the set, so add it. The current
 * substring is "abc" (length 3).
 * 
 * Move right to 3.
 * 
 * Now, right = 3:
 * 
 * The character at right is 'a', which is already in the set. So, we move left
 * to 1 and remove 'a' from the set.
 * 
 * The substring now becomes "bca" (length 3).
 * 
 * Move right to 4.
 * 
 * Keep repeating this process until we reach the end of the string.
 * 
 * In the end, the longest substring without repeating characters is "abc", and
 * its length is 3.
 * 
 * Summary:
 * 
 * Goal: Find the longest substring where no characters repeat.
 * 
 * How: Use two pointers to explore substrings, and a set to track characters
 * we've seen. Adjust the pointers to ensure the substring contains only unique
 * characters.
 * 
 * Result: The length of the longest substring without repeating characters.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */