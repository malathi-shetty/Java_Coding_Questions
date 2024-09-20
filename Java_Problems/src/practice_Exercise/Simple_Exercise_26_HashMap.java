package practice_Exercise;

import java.util.HashMap;
import java.util.Map;

public class Simple_Exercise_26_HashMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Red");
		map.put(103, "Green");
		map.put(102, "Yellow");

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(115, "Brown");
		map2.put(120, "Purple");
		map.putAll(map2);
		System.out.println(map);

	}

}

/*
 * 
 * Creating and Populating map:
 * 
 * Map<Integer, String> map = new HashMap<>();: This creates a new HashMap
 * object named map. The keys are of type Integer, and the values are of type
 * String.
 * 
 * map.put(101, "Red");: This adds an entry to map with key 101 and value "Red".
 * 
 * map.put(103, "Green");: This adds an entry to map with key 103 and value
 * "Green".
 * 
 * map.put(102, "Yellow");: This adds an entry to map with key 102 and value
 * "Yellow".
 * 
 * 
 * Creating and Populating map2:
 * 
 * Map<Integer, String> map2 = new HashMap<>();: This creates another HashMap
 * object named map2.
 * 
 * map2.put(115, "Brown");: This adds an entry to map2 with key 115 and value
 * "Brown".
 * 
 * map2.put(120, "Purple");: This adds an entry to map2 with key 120 and value
 * "Purple".
 * 
 * 
 * Combining Maps:
 * 
 * map.putAll(map2);: This method call copies all entries from map2 into map.
 * After this call, map will contain all the entries from both map and map2.
 * Printing the Map:
 * 
 * System.out.println(map);: This prints the contents of map to the console. The
 * output will show the combined entries from both map and map2.
 * 
 * 
 * Output
 * 
 * The output of this program will be:
 * 
 * {101=Red, 102=Yellow, 103=Green, 115=Brown, 120=Purple}
 * 
 * This shows that the map now contains all entries from its original set and
 * the entries from map2.
 * 
 * The order of the entries in the output may vary because HashMap does not
 * guarantee any specific order of its elements.
 * 
 * 
 */