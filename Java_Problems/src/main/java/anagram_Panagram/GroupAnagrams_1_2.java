package anagram_Panagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_1_2 {

	private static List<List<String>> groupAnagrams(String[] words) {
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
	private static String generateAnagramKey(String str) {
		char[] chars = str.toLowerCase().toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public static void main(String[] args) {
		String[] words = { "run", "race", "nur", "cera" };
		List<List<String>> result = groupAnagrams(words);

		// Print the result
		for (List<String> group : result) {
			System.out.println(group);
		}
	}

}

