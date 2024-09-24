package practice_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simple_Exercise_16 {

	public static void main(String[] args) {
		/*
		 * Given an unsorted array of integers, find the third largest number in the
		 * array. If the array has less than three distinct numbers, return the largest
		 * number. Example: Input: arr = [2, 4, 1, 5, 3, 6] Output: 4 Explanation: The
		 * sorted array in descending order is [6, 5, 4, 3, 2, 1]. The third largest
		 * number is 4.
		 * 
		 */

		int[] a = { 2, 4, 1, 5, 3, 6 };
		System.out.println(findThirdLargest(a)); // Output: 4
	}

	private static int findThirdLargest(int[] a) {
		// Step 1: Use a HashMap to store unique numbers - Hash all values
		Map<Integer, Boolean> map = new HashMap<>();

		for (int num : a) {
			map.put(num, true); // Value can be any placeholder, here we use 'true'
		}

		// Step 2: Extract keys from the HashMap and sort them - Collect only unique
		// objects, List
		List<Integer> distinctNumbers = new ArrayList<>(map.keySet());

		// Descend sort, And check
		Collections.sort(distinctNumbers, Collections.reverseOrder());

		// Step 3: Return the third largest number if it exists, otherwise return the
		// largest
		if (distinctNumbers.size() >= 3) {
			return distinctNumbers.get(2); // Third largest
		} else {
			return distinctNumbers.get(0); // Largest
		}

	}

}

/*
 * HashMap for Unique Values:
 * 
 * The HashMap is used to store numbers where each number is a key. Since keys
 * in a HashMap are unique, duplicates are automatically removed.
 * 
 * Extract and Sort Keys:
 * 
 * Convert the keys of the HashMap to a List and sort this list in descending
 * order using Collections.sort with Collections.reverseOrder().
 * 
 * Determine the Result:
 * 
 * If the list contains three or more elements, return the third element (which
 * is the third largest due to sorting in descending order).
 * 
 * If the list has fewer than three elements, return the largest element (the
 * first element in the sorted list).
 * 
 * 
 * 
 * 
 * 
 * HashAll values, ValueExtract:
 * 
 * HashMap: Use a HashMap to store each unique integer from the array. - Create
 * a HashMap to ensure all numbers are unique.
 * 
 * 
 * Collect Only unique Objects, List:
 * 
 * Collect keys: Extract the keys from the HashMap into a List. - Convert the
 * unique keys from the HashMap into a List.
 * 
 * Descend, All sort Third largest And check:
 * 
 * Descend sort: Sort the List in descending order.
 * 
 * And: After sorting, check:
 * 
 * Third largest: Return the third element if there are at least three elements.
 * 
 * And: If there are fewer than three elements, return the largest. - Check the
 * size of the list and return the appropriate value (third largest if possible,
 * otherwise the largest).
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
