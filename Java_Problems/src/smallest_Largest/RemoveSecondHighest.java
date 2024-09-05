package smallest_Largest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveSecondHighest {

	public static void main(String[] args) {
		// Program Remove the second highest element from the HashMap.

		// Create and populate the HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        map.put("D", 400);
        map.put("E", 500);

        System.out.println("Original HashMap: " + map);

        // Remove the second highest element
        removeSecondHighest(map);

        System.out.println("HashMap after removing second highest element: " + map);
    }

    public static void removeSecondHighest(HashMap<String, Integer> map) {
        // Check if map is null or has less than 2 elements
        if (map == null || map.size() < 2) {
            System.out.println("The map is too small to remove the second highest element.");
            return;
        }

        // Get the values from the map and sort them in descending order
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());

        // Get the second highest value
        int secondHighestValue = values.get(1);

        // Find the key with the second highest value
        String keyToRemove = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondHighestValue) {
                keyToRemove = entry.getKey();
                break;
            }
        }

        // Remove the entry with the second highest value
        if (keyToRemove != null) {
            map.remove(keyToRemove);
            System.out.println("Removed element with key: " + keyToRemove + " and value: " + secondHighestValue);
        } else {
            System.out.println("No element with the second highest value was found.");
        }
	}

}


/*

To remove the second highest element from a HashMap, you'll need to perform the following steps:

Extract all the values from the HashMap.

Sort these values to find the second highest.

Locate the key associated with the second highest value.

Remove the key-value pair corresponding to the second highest value from the HashMap.

***

Extract Values:

Extract values from the HashMap and store them in a List.

Sort Values:

Sort the list of values in descending order using Collections.sort() with Collections.reverseOrder().

Find the Second Highest Value:

The second element in the sorted list is the second highest value.

Locate and Remove the Key-Value Pair:

Iterate through the HashMap entries to find the key associated with the second highest value and remove it.

Handle Edge Cases:

The code checks if the map is null or contains fewer than 2 elements before proceeding with the removal operation.

This code will remove the second highest element based on its value, and the output will show the HashMap before and after the removal operation.
*/