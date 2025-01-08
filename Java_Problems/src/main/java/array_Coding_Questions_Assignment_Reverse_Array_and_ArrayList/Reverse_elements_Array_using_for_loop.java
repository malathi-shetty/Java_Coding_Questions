package array_Coding_Questions_Assignment_Reverse_Array_and_ArrayList;

import java.util.ArrayList;

public class Reverse_elements_Array_using_for_loop {

	public static void main(String[] args) {
		// Create an ArrayList of numbers
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(35);
		list.add(1);
		list.add(10);
		list.add(34);
		list.add(1);

		// Print the ArrayList elements in reverse order
		System.out.print("ArrayList in reverse order: ");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " "); // Print each element from last to first
		}

	}

}
/*
 * 
 * ArrayList Initialization: We create an ArrayList<Integer> and add some
 * integer values to it.
 * 
 * Reverse Iteration: We use a for loop to iterate over the ArrayList starting
 * from the last index (list.size() - 1) and decrementing the index down to 0.
 * 
 * Print Elements: Inside the loop, we use the list.get(i) method to retrieve
 * and print the elements in reverse order.
 * 
 */