package anagram_Panagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GA {

	public static void main(String[] args) {

		// Given an array of strings, group the anagrams together.

		GA ga = new GA(); // Create an instance of GA
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" }; // Example input
		List<List<String>> result = ga.groupAnagrams(input); // Call the groupAnagrams method
		System.out.println(result); // Print the result
	}

	public List<List<String>> groupAnagrams(String[] s) {
		HashMap<String, List<String>> map = new HashMap<>();

		for (String str : s) {
			char[] a = str.toCharArray();
			Arrays.sort(a); // Sort characters in the string
			String sortedStr = new String(a);

			// Add to the map
			if (!map.containsKey(sortedStr)) {
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(str);
		}
		return new ArrayList<List<String>>(map.values()); // Return the list of grouped anagrams

	}
}

/*
 * public List<List<String>> groupAnagrams(String[] strs) {
 * 
 * HashMap<String, List<String>> map = new HashMap<>();
 * 
 * This method groupAnagrams takes an array of strings (s) as input and returns
 * a list of lists containing grouped anagrams.
 * 
 * It initializes a HashMap called map, where the key is a string (the sorted
 * version of the anagram) and the value is a list of strings (the actual
 * anagrams).
 * 
 * Processing Each String:
 * 
 * for (String str : s) {
 * 
 * char[] a = str.toCharArray();
 * 
 * Arrays.sort(a); // Sort characters in the string
 * 
 * String sortedStr = new String(a);
 * 
 * The method iterates through each string in the strs array.
 * 
 * Each string is converted to a character array, which is then sorted using
 * Arrays.sort(a). Sorting the characters ensures that all anagrams will have
 * the same sorted representation.
 * 
 * The sorted character array is then converted back into a string (sortedStr).
 * 
 * Adding to the Map:
 * 
 * if (!map.containsKey(sortedStr))
 * 
 * map.put(sortedStr, new ArrayList<>());
 * 
 * }
 * 
 * map.get(sortedStr).add(str);
 * 
 * If the map does not already contain the sorted string as a key, it creates a
 * new entry with an empty ArrayList.
 * 
 * It then adds the original string (str) to the list associated with the sorted
 * key.
 * 
 * Returning the Result:
 * 
 * return new ArrayList<>(map.values()); // Return the list of grouped anagrams
 * 
 * Finally, the method returns a new ArrayList created from the values of the
 * map, which contains all the grouped anagrams.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
