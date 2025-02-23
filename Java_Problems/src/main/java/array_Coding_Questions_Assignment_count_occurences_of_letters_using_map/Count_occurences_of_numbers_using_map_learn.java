package array_Coding_Questions_Assignment_count_occurences_of_letters_using_map;

import java.util.HashMap;
import java.util.Map;

public class Count_occurences_of_numbers_using_map_learn {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 2, 3, 1, 4, 3, 1, 2}; // Input string
		

		Map<Integer, Integer> newobj = new HashMap<>(); // Map to store character counts

		// Loop through each character in the array
		for (int num : numbers) {
			// Check if the character is already in the map
			if (newobj.containsKey(num)) {
				// Increment the count for the character
				newobj.put(num, newobj.get(num) + 1);
			} else {
				// Initialize the count for new character
				newobj.put(num, 1);
			}
		}

		// Print the occurrences of each character
		for (Integer key : newobj.keySet()) {
			System.out.println("Integer: " + key + " --> " + "Count: " + newobj.get(key));
		}
	}
}