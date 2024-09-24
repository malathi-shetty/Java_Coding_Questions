package practice_Exercise;

import java.util.HashMap;
import java.util.Map;

public class Simple_Exercise_30_HashMap {

	public static void main(String[] args) {
		/*
		 * In the main method we have local variable ‘j’ initialized to zero.
		 * 
		 * In a for loop you have the condition ‘j’ less than 10 and incrementing ‘j’ by
		 * 1
		 * 
		 * Within the for loop we are equating “j” to (j*2) and storing each “j” value
		 * in a map. (even numbers with key as “even” and odd numbers with key as “odd”)
		 * 
		 * What will be last value of “j” and store this last value also in map after
		 * checking for “even”:”odd”
		 * 
		 * Then iterate this complete Map and show the output as
		 * 
		 * Key : value
		 */

		 int j = 0; // Initialize j to 0
	        Map<String, Integer> newobj = new HashMap<>(); // Create a map to store even and odd values

	        // Loop while j is less than 10
	        for (int i = 0; j < 10; i++) { // i is used just for incrementing j
	            j++; // Increment j by 1
	            j = j * 2; // Update j to j * 2

	            // Store the current value of j based on even or odd
	            if (j % 2 == 0) {
	                newobj.put("even", j); // Store even numbers in the map
	            } else {
	                newobj.put("odd", j); // Store odd numbers in the map
	            }
	        }

	        // Last value of j after exiting the loop
	        if (j % 2 == 0) {
	            newobj.put("even", j); // Store last value of j if it's even
	        } else {
	            newobj.put("odd", j); // Store last value of j if it's odd
	        }

	        // Iterating through the map and displaying output
	        for (Map.Entry<String, Integer> entry : newobj.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + " : Value: " + entry.getValue());
	        }

	}

}


/*

Initialization: The variable j is initialized to 0.

For Loop: The loop runs while j is less than 10. In each iteration, j is updated to j * 2.

Map Storage: The current value of j is categorized as "even" or "odd" and stored in the map. Each key can have the last computed value.

Final Check: After the loop, the last value of j is added to the map based on whether it is even or odd.

Output: The map is iterated to print all key-value pairs.

Note:
Since j is doubled, its value quickly exceeds 10, and the loop condition might not behave as expected in a real-world scenario. Adjustments may be needed depending on your intended logic. For example, if you want to keep j within the bounds, you could reconsider the multiplication approach or limit the loop differently.


*/