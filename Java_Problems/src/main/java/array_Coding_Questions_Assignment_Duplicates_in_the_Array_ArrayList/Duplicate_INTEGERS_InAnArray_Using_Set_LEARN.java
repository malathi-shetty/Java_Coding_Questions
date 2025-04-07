package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_INTEGERS_InAnArray_Using_Set_LEARN {

	public static void main(String[] args) {
		int[] a = { 10, 2, 3, 3, 4, 5, 5, 5, 6 };

		Set<Integer> duplicates = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					{
						// If the element is already in the duplicates set, skip it
						if (!duplicates.contains(a[i])) {
							duplicates.add(a[i]);
						}
					}
				}
			}
		}
		System.out.println("Duplicates: " + duplicates);
	}
}

/*
 * Outer Loop: The outer for loop iterates through each element in the array.
 * 
 * Inner Loop: The inner for loop checks each subsequent element in the array
 * against the current element of the outer loop.
 * 
 * Duplicate Check: If two elements are the same (a[i] == a[j]), we then check
 * if this element is already in the duplicates set. If not, we add it to the
 * duplicates set.
 * 
 * Print Duplicates: Finally, we print out the duplicates found.
 * 
 * Key Points: Avoid Duplicates in Results: We use the HashSet to ensure that
 * duplicates are not added multiple times.
 */