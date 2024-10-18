package reverse_A_String_Different_Ways;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reverse_a_list_without_using_in_built_methods_4 {
	// write a program to reverse a list without using in built methods

	public static void main(String[] args) {
		// Create and initialize the map
		Map<Integer, String> newobj = new HashMap<>();
		newobj.put(1, "Apple");
		newobj.put(2, "Banana");
		newobj.put(3, "Chickoo");
		newobj.put(4, "Dragon Fruit");
		newobj.put(5, "Grapes");

		// Create a list to hold the reversed entries
		List<String> reversedList = new ArrayList<>();

		// Manually reverse the map entries
		for (int i = newobj.size(); i >= 1; i--) {
			if (newobj.containsKey(i)) {
				reversedList.add(newobj.get(i)); // Add values in reverse order
			}
		}

		// Print the reversed list
		System.out.println("Reversed List: " + reversedList);
	}
}