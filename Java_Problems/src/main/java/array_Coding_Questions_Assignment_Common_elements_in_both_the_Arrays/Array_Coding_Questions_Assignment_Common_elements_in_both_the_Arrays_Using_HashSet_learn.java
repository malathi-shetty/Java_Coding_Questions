package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays_Using_HashSet_learn {

	public static void main(String[] args) {
		// Common elements in both the Arrays
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 4, 5, 6, 7, 8 };

		Set<Integer> set = new HashSet<>();
		Set<Integer> dup = new HashSet<>();

		// Add all elements from the first array to the set
		for (int num : a1) {
			set.add(num);
		}

		// Check if elements from the second array are in the set
		for (int num : a2) {
			if (set.contains(num)) {
				dup.add(num);
			}
		}

		System.out.println("Common elements: " + dup); // Output: [4, 5]

	}

}

/*
 * 
 * Create a HashSet: We use a HashSet to store elements from the first array,
 * 
 * Add Elements: Loop through array1 and add each element to the set.
 * 
 * Check for Common Elements: Loop through array2 and check if each element is
 * present in the set. If it is, add it to the commonElements set.
 * 
 * Output: Finally, we print the common elements.
 * 
 * Summary
 * 
 * The HashSet method is more efficient and generally preferred for performance,
 * especially with larger arrays.
 * 
 */