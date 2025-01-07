package length_of_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;

public class Length_of_Longest_Substring_Without_Repeating_Characters_1 {

	public static String lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;  // Left pointer of the window
        int maxLength = 0;  // Variable to store the maximum length
        int start = 0;  // Variable to store the start index of the longest substring
        
        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, move the left pointer
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the set
            set.add(s.charAt(right));
            
            // Update the maximum length of the substring and its starting index
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                start = left;  // Update the start index of the longest substring
            }
        }
        
        // Extract the longest substring from the original string using the start index and maxLength
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String longestSubstring = lengthOfLongestSubstring(s);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        System.out.println("Length of longest substring: " + longestSubstring.length());
    }
	

}
