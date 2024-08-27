package arrays_Sorted_or_Not_ArrayList;

import java.util.ArrayList;

public class ArraysList_Sorted_or_Not_1_learn {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		// list.add("Mango"); // uncomment to check unsorted
		// list.add("StrawBerry");
		// list.add("Kiwi");
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

//Check if ArrayList is Sorted
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0) {
				// if (list.get(i).compareToIgnoreCase(list.get(i + 1)) < 0) { //not sorted
				System.out.println("The ArrayList is not sorted.." + list);
				return; // Exit the method if list is not sorted
			}
		}
		System.out.println("The ArrayList is sorted.." + list);
	}
}

/*
 * Initialize the ArrayList: You create an ArrayList of strings and add a few
 * items to it. Check if the ArrayList is sorted: You iterate through the list
 * and compare each element with the next one using compareTo. Output the
 * result: You print whether the list is sorted or not based on the comparison.
 * 
 * Case Sensitivity: The compareTo method is case-sensitive. If the list might
 * contain mixed-case elements and you want a case-insensitive comparison,
 * consider using compareToIgnoreCase.
 * 
 * Edge Cases: If the list is empty or contains only one element, it's
 * technically sorted. Your current code works fine for lists with 2 or more
 * elements, but it doesn't explicitly handle empty or single-element lists.
 * Adding a check for these cases might be helpful.
 * 
 * Generics: The use of generics (ArrayList<String>) is good and follows best
 * practices.
 * 
 * 
 * for (int i = 0; i < list.size() - 1; i++) {
 * "Loop through List but Stop Before the Last Element." - Start a for loop that
 * iterates from the first element up to the second-to-last element. This
 * ensures each element is compared with the next one.
 * 
 * if (list.get(i).compareTo(list.get(i + 1)) > 0) {
 * "Compare Each Item: Check If Out of Order." - Compare the current element
 * (list.get(i)) with the next element (list.get(i + 1)). If the current element
 * is greater than the next one, the list is not sorted in ascending order.
 * 
 * 
 * 
 * List Creation: "Create Empty Fruit List." Add Items: "Add Fruits in Order."
 * Loop Through: "Check Order of Items." Comparison:
 * "Determine if Out of Order." Output and Exit: "Notify Not Sorted & Exit."
 * Completion: "Confirm Sorted if No Issues."
 * 
 * 
 * 
 * 
 */