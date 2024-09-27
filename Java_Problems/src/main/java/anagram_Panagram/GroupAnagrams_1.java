package anagram_Panagram;

import java.util.Arrays;

public class GroupAnagrams_1 {

	// Check the three String are anagram or not ?? String arr[] = {"run", "race",
	// "nur", "cera"};

	public static void main(String[] args) {

		String[] a = { "run", "race", "nur", "cera" };
		// a[0], a[1], a[2], a[3]

		// Check if strings are anagrams
		boolean result = areAnagrams(a[0], a[2]); // "run", "nur"
		System.out.println(a[0] + " and " + a[2] + " are anagrams: " + result);

		result = areAnagrams(a[1], a[3]); // "race", "cera"
		System.out.println(a[0] + " and " + a[3] + " are anagrams: " + result);
	}

	public static boolean areAnagrams(String s1, String s2) {

		// Converting strings to character arrays
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();

		// Sort the character arrays
		Arrays.sort(char1);
		Arrays.sort(char2);

		// Compare the sorted arrays
		return Arrays.equals(char1, char2);
	}
}

/*
 * 
 * Converting Strings to Character Arrays:
 * 
 * char[] char1 = s1.toCharArray();
 * 
 * char[] char2 = s2.toCharArray();
 * 
 * Here, s1 and s2 are the two strings you want to compare.
 * 
 * The toCharArray() method converts each string into a character array:
 * 
 * For example, if s1 is "run" and s2 is "nur", then:
 * 
 * char1 becomes {'r', 'u', 'n'}
 * 
 * char2 becomes {'n', 'u', 'r'}
 * 
 * 
 * 
 * Sorting the Character Arrays:
 * 
 * Arrays.sort(char1);
 * 
 * Arrays.sort(char2);
 * 
 * The Arrays.sort() method sorts the elements of the character arrays in
 * ascending order.
 * 
 * After sorting:
 * 
 * char1 will be {'n', 'r', 'u'}
 * 
 * char2 will also be {'n', 'r', 'u'}
 * 
 * 
 * Comparing the Sorted Arrays:
 * 
 * 
 * return Arrays.equals(char1, char2);
 * 
 * The Arrays.equals() method checks if two arrays are equal, meaning they must
 * have the same length and the same elements in the same order.
 * 
 * If char1 and char2 are equal after sorting, it confirms that s1 and s2
 * contain the same characters in the same frequency, thus they are anagrams.
 * 
 */
