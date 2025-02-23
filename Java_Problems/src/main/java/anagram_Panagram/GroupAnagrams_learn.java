package anagram_Panagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_learn {

	/*
	 * Given an array of Strings a , group all the anagrams together
	 * 
	 * Input: a = ["eat","tea","tan","ate","nat","bat"]
	 * 
	 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	 * 
	 */
	public static List<List<String>> groupAnagrams(String[] words) {
		// Handle null or empty input
		if (words == null || words.length == 0) {
			return new ArrayList<>();
		}

		// Create a HashMap to store the anagrams
		Map<String, List<String>> anagramMap = new HashMap<>();

		// Process each string in the input array
		for (String word : words) {
			// Find a representative key for the anagram group
			String key = generateAnagramKey(word);
			// Use the key to group the strings
			List<String> anagramList = anagramMap.get(key);
			if (anagramList == null) {
				anagramList = new ArrayList<>();
				anagramMap.put(key, anagramList);
			}
			anagramList.add(word);
		}
		// Convert the map values to a list of lists
		return new ArrayList<>(anagramMap.values());
	}
	// Helper method to generate a key for an anagram group
	public static String generateAnagramKey(String str) {
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
 * 
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
 * ArrayList: A resizable array implementation of the List interface.
 * 
 * Arrays: Contains utility methods for working with arrays, such as sorting.
 * 
 * HashMap: A hash table-based implementation of the Map interface, used for
 * key-value pairs.
 * 
 * public static void main(String[] args) {
 * 
 * String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
 * 
 * List<List<String>> result = groupAnagrams(words);
 * 
 * // Print the result
 * 
 * for (List<String> group : result) {
 * 
 * System.out.println(group); } }
 * 
 * 
 * The main method is the entry point of the program. It defines an array of
 * strings (words) and calls the groupAnagrams method to group the anagrams.
 * 
 * It then prints each group of anagrams.
 * 
 * 
 * 
 * private static List<List<String>> groupAnagrams(String[] words) {
 * 
 * // Handle null or empty input
 * 
 * if (words == null || words.length == 0) {
 * 
 * return new ArrayList<>();
 * 
 * } // Create a HashMap to store the anagrams
 * 
 * Map<String, List<String>> anagramMap = new HashMap<>();
 * 
 * // Process each string in the input array
 * 
 * for (String word : words) {
 * 
 * // Find a representative key for the anagram group
 * 
 * String key = generateAnagramKey(word);
 * 
 * // Use the key to group the strings
 * 
 * List<String> anagramList = anagramMap.get(key);
 * 
 * if (anagramList == null) {
 * 
 * anagramList = new ArrayList<>();
 * 
 * anagramMap.put(key, anagramList); }
 * 
 * anagramList.add(word); }
 * 
 * // Convert the map values to a list of lists return new
 * ArrayList<>(anagramMap.values()); }
 * 
 * 
 * 
 * Input Handling: Checks if the input array is null or empty. If so, it returns
 * an empty list.
 * 
 * HashMap Creation: A HashMap named anagramMap is created to store groups of
 * anagrams, where the key is the sorted version of the word and the value is a
 * list of words that are anagrams.
 * 
 * Processing Each Word: The method iterates through each word in the words
 * array:
 * 
 * It generates a key by calling the generateAnagramKey method.
 * 
 * It retrieves the current list of anagrams associated with that key.
 * 
 * If the list is null (meaning no anagrams have been added yet), it creates a
 * new ArrayList, adds it to the map, and then adds the word to that list.
 * 
 * 
 * public static String generateAnagramKey(String str) {
 * 
 * char[] chars = str.toLowerCase().toCharArray();
 * 
 * Arrays.sort(chars);
 * 
 * return new String(chars); }
 * 
 * 
 * This method generates a key for each word:
 * 
 * It converts the word to lowercase and splits it into a character array.
 * 
 * It sorts the character array, ensuring that all anagrams yield the same
 * sorted string.
 * 
 * Finally, it returns the sorted characters as a new string.
 * 
 * 
 */
