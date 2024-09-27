package anagram_Panagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_2 {

	public static void main(String[] args) {

		String[] a = { "eat", "tea", "tan", "ate", "nat", "bat" };

		Map<String, List<String>> anagramGroups = new HashMap<>();

		for (String str : a) {
			String sortedStr = sortString(str);
			// anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str); //
			// JDK issue

			// Less than java-8 way to check and add to the map
			List<String> group = anagramGroups.get(sortedStr);
			if (group == null) {
				group = new ArrayList<>(); // Create a new list if it doesn't exist
				anagramGroups.put(sortedStr, group); // Add it to the map
			}
			group.add(str); // Add the original string to the list
		}

		// Print grouped anagrams
		for (List<String> group : anagramGroups.values()) {
			System.out.println(group);
		}
	}

	// Method to sort characters in a string
	private static String sortString(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
}
