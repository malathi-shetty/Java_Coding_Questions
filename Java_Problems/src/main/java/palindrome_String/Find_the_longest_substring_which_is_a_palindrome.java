package palindrome_String;

public class Find_the_longest_substring_which_is_a_palindrome {
	// Find the longest substring which is a palindrome.
	// Example: For babad, the longest palindromic substring is bab
	public static void main(String[] args) {

		String s = "babad"; // Example input
		String longestPalindrome = findLongestPalindrome(s);
		System.out.println("The longest palindromic substring is: " + longestPalindrome);
	}

	public static String findLongestPalindrome(String s) {
		String longest = "";

		for (int i = 0; i < s.length(); i++) {
			// Check for odd-length palindromes
			String oddPalindrome = expandAroundCenter(s, i, i);
			// Check for even-length palindromes
			String evenPalindrome = expandAroundCenter(s, i, i + 1);

			// Update longest palindrome found
			if (oddPalindrome.length() > longest.length()) {
				longest = oddPalindrome;
			}
			if (evenPalindrome.length() > longest.length()) {
				longest = evenPalindrome;
			}
		}
		return longest;
	}

	private static String expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right); // Return the palindrome substring
	}

}
