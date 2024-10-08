package minimum_Window_Substring;

import java.util.HashMap;

public class Minimum_Window_Substring {

	public static void main(String[] args) {
		// Consider a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
		// Two strings S and T, find the minimum window in S which will contain all the characters in T in complexity better than O(n^2).

		 String s = "ADOBECODEBANC";
	        String t = "ABC";
	        Minimum_Window_Substring mws = new Minimum_Window_Substring();
	        String result = mws.minWindow(s, t);
	        System.out.println("Minimum window substring: " + result);
	    }

	    public String minWindow(String s, String t) {
	        if (s.length() < t.length()) return ""; // Edge case

	        HashMap<Character, Integer> charCount = new HashMap<>();
	        for (char c : t.toCharArray()) {
	            charCount.put(c, charCount.get(c) == null ? 1 : charCount.get(c) + 1);
	        }

	        String result = "";
	        int left = 0, right = 0, required = charCount.size(), formed = 0;
	        HashMap<Character, Integer> windowCounts = new HashMap<>();

	        while (right < s.length()) {
	            char c = s.charAt(right);
	            windowCounts.put(c, windowCounts.get(c) == null ? 1 : windowCounts.get(c) + 1);

	            if (charCount.containsKey(c) && windowCounts.get(c).equals(charCount.get(c))) {
	                formed++;
	            }

	            while (left <= right && formed == required) {
	                if (result.isEmpty() || right - left + 1 < result.length()) {
	                    result = s.substring(left, right + 1);
	                }

	                char leftChar = s.charAt(left);
	                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
	                if (charCount.containsKey(leftChar) && windowCounts.get(leftChar) < charCount.get(leftChar)) {
	                    formed--;
	                }
	                left++;
	            }
	            right++;
	        }
	        return result; // Return the minimum window substring
	}

}
