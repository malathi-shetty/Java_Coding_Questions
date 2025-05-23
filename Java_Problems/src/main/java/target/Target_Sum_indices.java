package target;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Target_Sum_indices {

	public static void main(String[] args) {
		//return the indices of the two numbers
		/*
		 * Given an array of integer nums and an integer target, return the indices of
		 * the two numbers such that they add up to the target. 
		 * 
		 * Example: Input: nums =
		 * [3, 2, 4] target = 6 Output: [1, 2] Explanation: Because nums[1] + nums[2] ==
		 * 6, we return [1, 2].
		 */
		// Create an instance of TwoSum class
		Target_Sum_indices ai = new Target_Sum_indices(); // We create an instance solution of
																		// Array_Of_integer_numbers.

		int[] a = { 3, 2, 4 }; // Example input - Define example input nums = { 3, 2, 4 } and target = 6.
		int target = 6; // Example target

		// Call the Array_Of_integer_numbers method to find the indices of two numbers
		int[] result = ai.twoSum(a, target);
		// Call ai.twoSum(a, target) to find the indices of two numbers that add up
		// to target.

		// Print the result
		System.out.println(Arrays.toString(result));
		// Print the result using System.out.println(Arrays.toString(result)), which
		// prints [1, 2] indicating that a[1] + a[2] = 6.

	}

	public int[] twoSum(int[] a, int target) { // twoSum method takes an array of integers nums and an integer target
													// as parameters.

		// Create a HashMap to store each number's index
		Map<Integer, Integer> newobj = new HashMap<>();
		// We create a HashMap<Integer, Integer> named map to store numbers (nums[i]) as
		// keys and their indices (i) as values.

		// Iterate through array
		for (int i = 0; i < a.length; i++) // We start a for loop to go through each element of the nums array.
		{
			// Calculate the complement needed to reach the target
			int c = target - a[i];
			// For each element nums[i], calculate complement as target - nums[i].
			// This complement is the number we need to find in the array to reach the
			// target.

			// Check if complement exists in the HashMap - We check if map already contains
			// complement as a key using map.containsKey(complement).
			if (newobj.containsKey(c)) {
				// If found, return the indices of the two numbers
				return new int[] { newobj.get(c), i };
				// If complement exists in map, it means we've found the two numbers (nums[i]
				// and complement) that add up to target.
				// So, we return their indices [map.get(complement), i].
			}

			// Add the current number and its index o the Hashmap
			newobj.put(a[i], i);
			// If complement doesn't exist in map, we add nums[i] to map with its index i
			// using map.put(nums[i], i).
			// This allows us to potentially find this number's complement later in the
			// array.

		}

		// If no solution is found, return an empty array
		return null;
		// If the loop completes without finding a solution (no pair of numbers adding
		// up to target), we return an empty array new int[0].
	}

}


/* Output: [1, 2] */