package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Common_Numbers_in_both_the_Arrays_Using_Nested_Loops {

	public static void main(String[] args) {
		// Common elements in both the Arrays

		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 4, 5, 6, 7, 8 };

		List<Integer> commonElements = new ArrayList<>();

		// Check each element in array1 against each element in array2
		for (int i : a1) {
			for (int j : a2) {
				if (i == j && !commonElements.contains(i)) {
					commonElements.add(i);
				}
			}
		}
		System.out.println("Common elements: " + commonElements); // Output: [4, 5]
	}
}

/*
The nested loop method is simple but less efficient for larger datasets.

*/