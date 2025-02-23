package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Duplicates_in_the_ArrayList_Using_Frequency_Array {

	public static void main(String[] args) {
		// use a HashMap to count occurrences of each element.
		  ArrayList<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(1);
	        list.add(2);
	        list.add(6);

	        findDuplicates(list);
	    }

	    public static void findDuplicates(ArrayList<Integer> list) {
	    	 HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	         for (int num : list) {
	             // Use the get method with null check to avoid getOrDefault
	             frequencyMap.put(num, frequencyMap.get(num) == null ? 1 : frequencyMap.get(num) + 1);
	         }

	         System.out.print("Duplicates: ");
	         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	             if (entry.getValue() > 1) {
	                 System.out.print(entry.getKey() + " ");
	             }
	         }
	    }
	}

/*
 * 
 * Explicit Entry Type: Used Map.Entry<Integer, Integer> instead of var to ensure compatibility with older Java versions.

Manual Frequency Handling: Replaced getOrDefault with a null check to determine the frequency of each number.

Explanation

The frequencyMap tracks how many times each number appears in the list.

The loop checks for duplicates by looking for entries in the map with a value greater than 1.

*/
