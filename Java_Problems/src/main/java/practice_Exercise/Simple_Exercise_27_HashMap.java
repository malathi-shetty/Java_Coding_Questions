package practice_Exercise;

import java.util.HashMap;
import java.util.Map;

public class Simple_Exercise_27_HashMap {

	public static void main(String[] args) {

		/*
		 * Map<Integer, String> map = new HashMap<>();
		 * 
		 * map.put(101, "Red");
		 * 
		 * map.put(103, "Green");
		 * 
		 * map.put(102, "Yellow");
		 * 
		 * map.remove(104);
		 * 
		 * map.remove(106,"Pink");
		 * 
		 * System.out.println(map);
		 * 
		 * 
		 */

		Map<Integer, String> map = new HashMap<>();

		// Adding elements to the map
		map.put(101, "Red");
		map.put(103, "Green");
		map.put(102, "Yellow");

		// Attempting to remove a non-existing key (should have no effect)
		map.remove(104); // No effect, key does not exist

		// Check if the value "Green" exists for key 103 before removing
		if ("Green".equals(map.get(103))) {
			map.remove(103); // Remove the key 103
			System.out.println("Removed key 103 with value 'Green'");
		} else {
			System.out.println("Value for key 103 is not 'Green'");
		}

		// Check if the value "Blue" exists for key 102 before removing
		if ("Blue".equals(map.get(102))) {
			map.remove(102); // This won't execute
			System.out.println("Removed key 102 with value 'Blue'");
		} else {
			System.out.println("Value for key 102 is not 'Blue'");
		}

		// Print the current state of the map
		System.out.println("Current map: " + map);

		System.out.println("******");

		Map<Integer, String> map1 = new HashMap<>();

		// Adding elements to the map
		map1.put(101, "Red");
		map1.put(103, "Green");
		map1.put(102, "Yellow");

		// Attempting to remove non-existing keys (no effect)
		map1.remove(104); // No effect, key does not exist
		// map1.remove(106, "Pink"); // This line will cause an error if uncommented

		// Print the current state of the map
		System.out.println(map1); // Output will be {101=Red, 102=Yellow, 103=Green}
	}

}
