package array_Coding_Questions_Assignment_Sort_the_Array_and_ArrayList_Using_Bubble_Sort_Mechanism;

import java.util.ArrayList;

public class Array_Coding_Questions_Assignment_Sort_the_ArrayList_Using_Bubble_Sort_Mechanism {

	// sort the Array List ….Use Bubble Sort Mechanism

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(64);
		list.add(34);
		list.add(25);
		list.add(90);
		list.add(12);
		list.add(22);
		list.add(90);
		list.add(11);

		System.out.println("Original ArrayList:");
		printArrayList(list);

		bubbleSort(list);

		System.out.println("Sorted ArrayList:");
		printArrayList(list);

	}

	public static void bubbleSort(ArrayList<Integer> b) {
		int n = b.size();
		boolean swapped;

		// Traverse through all elements in the ArrayList
		for (int i = 0; i < n - 1; i++) {
			swapped = false; // Track if a swap occurred

			// Last i elements are already sorted
			for (int j = 0; j < n - i - 1; j++) {
				// Compare adjacent elements
				if (b.get(j) > b.get(j + 1)) {

					// Swap if they are in the wrong order
					int temp = b.get(j);
					b.set(j, b.get(j + 1));
					b.set(j + 1, temp);
					swapped = true; // Set swapped to true
				}
			}

			// If no elements were swapped, break the loop
			if (!swapped) {
				break;
			}
		}

	}

	public static void printArrayList(ArrayList<Integer> list) {
		for (int value : list) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

}

/*
 * 
 * You cannot replace list.get(j) with list[j] when working with an ArrayList in
 * Java. The get() method is essential for accessing elements in an ArrayList.
 * 
 * Main Method:
 * 
 * An ArrayList named list is created and populated with integers.
 * 
 * The original list is printed using printArrayList.
 * 
 * The bubbleSort method is called to sort the list.
 * 
 * The sorted list is then printed.
 * 
 * 
 * Bubble Sort Method:
 * 
 * The method bubbleSort takes an ArrayList<Integer> as input.
 * 
 * It determines the size of the list and initializes a boolean swapped to track
 * whether any swaps were made during the sorting process..
 * 
 * The outer loop runs through the list multiple times (up to n - 1), while the
 * inner loop compares adjacent elements using list.get(j) to access elements.
 * 
 * If the current element is greater than the next one, a swap occurs using the
 * set() method to reorder them.
 * 
 * If a swap happens, swapped is set to true.
 * 
 * If the elements are in the wrong order, they are swapped using
 * list.set(index, value).
 * 
 * After each full pass, if no swaps occurred (indicating the list is sorted),
 * the loop breaks early for efficiency.
 * 
 * Print ArrayList Method:
 * 
 * 
 * 
 * The printArrayList method takes an ArrayList<Integer> as a parameter and
 * prints its contents.
 * 
 * It uses an enhanced for-loop to iterate through each element of the list,
 * printing each value followed by a space.
 * 
 * A new line is printed after the loop to format the output. The printArrayList
 * method prints all elements of the ArrayList in a single line.
 * 
 * Summary:
 * 
 * This program demonstrates how to sort an ArrayList using the Bubble Sort
 * algorithm.
 * 
 * The program begins by initializing an unsorted list, sorts it using Bubble
 * Sort, and then prints both the original and sorted lists.
 * 
 * Output:
 * 
 * Original ArrayList:
 * 
64 34 25 90 12 22 90 11 

Sorted ArrayList:

11 12 22 25 34 64 90 90 
 * 
 */
