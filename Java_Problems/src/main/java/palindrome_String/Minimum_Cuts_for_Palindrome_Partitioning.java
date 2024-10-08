package palindrome_String;

public class Minimum_Cuts_for_Palindrome_Partitioning {

	// Given a string s, partition s such that every substring of the partition is a
	// palindrome.
	// Return the minimum cuts needed for a palindrome partitioning.

	public static void main(String[] args) {
		String s = "aab"; // Example input
		Minimum_Cuts_for_Palindrome_Partitioning min = new Minimum_Cuts_for_Palindrome_Partitioning();
		int result = min.minCut(s);
		System.out.println("Minimum cuts needed: " + result);
	}

	public int minCut(String s) {
		int n = s.length();
		int[] cuts = new int[n];
		boolean[][] dp = new boolean[n][n];

		// Initialize cuts array
		for (int i = 0; i < n; i++) {
			cuts[i] = i; // Max cuts: each character can be a separate palindrome
			for (int j = 0; j <= i; j++) {
				// Check if s[j...i] is a palindrome
				if (s.charAt(i) == s.charAt(j) && (i - j < 2 || dp[j + 1][i - 1])) {
					dp[j][i] = true; // Mark as palindrome
					cuts[i] = (j == 0) ? 0 : Math.min(cuts[i], cuts[j - 1] + 1);
				}
			}
		}
		return cuts[n - 1]; // Return the minimum cuts needed
	}
}
