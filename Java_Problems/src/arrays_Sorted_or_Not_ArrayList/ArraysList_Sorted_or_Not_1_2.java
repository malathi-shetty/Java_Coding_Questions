package arrays_Sorted_or_Not_ArrayList;

import java.util.ArrayList;

public class ArraysList_Sorted_or_Not_1_2 {

	public static void main(String[] args) {
		// Create and populate the ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		// Check if ArrayList is sorted
		if (isSorted(list)) {
			System.out.println("The ArrayList is sorted.");
		} else {
			System.out.println("The ArrayList is not sorted.");
		}
	}

	// Method to check if the ArrayList is sorted
	public static boolean isSorted(ArrayList<String> list) {
		// Handle edge cases
		if (list == null || list.size() <= 1) {
			return true; // Empty or single-element list is considered sorted
		}

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0) {
				return false; // List is not sorted
			}
		}
		return true; // List is sorted
	}
}

/*
 * Refactored the sorting check into a separate method: This improves
 * readability and reusability.
 * 
 * Handled edge cases: Added checks for null and lists with 1 or 0 elements.
 * 
 * Used compareToIgnoreCase: For a case-insensitive check.
 */