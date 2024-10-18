package find_duplicates_Words_In_An_Array;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_values_Using_Map {

	public static void main(String[] args) {
		// write a program to find duplicate values in a given map in java
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Chickoo", 3);
		map.put("Dragon Fruit", 2); // Duplicate value
		map.put("Grapes", 1); // Duplicate value

		// Create a map to count occurrences of each value
		Map<Integer, Integer> newobj = new HashMap<>();

		// Convert values to an array
		Integer[] a = map.values().toArray(new Integer[0]);

		// Count occurrences using a traditional for loop
		for (int i = 0; i < a.length; i++) {
			Integer value = a[i];
			if (!newobj.containsKey(value)) {
				newobj.put(value, 1); // Initialize count to 1
			} else {
				newobj.put(value, newobj.get(value) + 1); // Increment count
			}
		}

		// Print duplicates
		for (Map.Entry<Integer, Integer> entry : newobj.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate value: " + entry.getKey() + " occurs " + entry.getValue() + " times.");
			}
		}
	}
}