package anagram_Panagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	/*
	 * Given an array of Strings a , group all the anagrams together
	 * 
	 * Input: a = ["eat","tea","tan","ate","nat","bat"]
	 * 
	 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	 * 
	 */

	private static List<List<String>> groupAnagrams(String[] words) {
		// Create a HashMap to store the anagrams
		Map<String, List<String>> anagramMap = new HashMap<>();

		// Process each string in the input array
		for (String word : words) {
			// Find a representative key for the anagram group
			String key = generateAnagramKey(word);

			// Use the key to group the strings
			anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
		}

		// Convert the map values to a list of lists
		return new ArrayList<>(anagramMap.values());
	}

	// Helper method to generate a key for an anagram group
	private static String generateAnagramKey(String str) {
		char[] chars = str.toLowerCase().toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public static void main(String[] args) {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = groupAnagrams(words);

		// Print the result
		for (List<String> group : result) {
			System.out.println(group);
		}
	}

}

/*
 * Use of computeIfAbsent: Simplified the code using computeIfAbsent to handle
 * the case where the key is not yet in the map - GroupAnagrams method, where
 * the genius lies in grouping anagrams.
 * 
 * GroupAnagrams: The method name - Refers to the HashMap used to store and
 * group the anagrams.
 * 
 * HashMap: Used to store groups - Represents the sorting of characters in the
 * string to generate a key for the anagram group.
 * 
 * Alphabetically Sort: The way keys are generated.
 * 
 * Group: The main operation performed - Refers to the process of grouping
 * strings based on their sorted character key.
 * 
 * Strings: The type of data handled - Indicates the input and output are lists
 * of strings.
 * 
 * Efficiently: How the data is managed and retrieved.- Highlights the use of
 * computeIfAbsent to manage the anagram groups efficiently
 * 
 * 
 */
