package length_of_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;

public class Length_of_Longest_Substring_Without_Repeating_Characters {
	// Find the length of the longest substring without repeating characters.
	public static void main(String[] args) {

		String s = "abcabcbb";
		Length_of_Longest_Substring_Without_Repeating_Characters solution = new Length_of_Longest_Substring_Without_Repeating_Characters();
		int result = solution.lengthOfLongestSubstring(s);
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
