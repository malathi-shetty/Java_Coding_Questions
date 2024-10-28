package array_Coding_Questions_Assignment_Sort_the_Array_and_ArrayList_Using_Bubble_Sort_Mechanism;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Coding_Questions_Assignment_Sort_the_Array_and_ArrayList_Using_Bubble_Sort_Mechanism {

	public static void main(String[] args) {
		// Sort the Array ..sort the Array List ….Use Bubble Sort Mechanism

		// Sorting an array
		int[] array = { 64, 34, 25, 90, 12, 22, 90, 11 };
		System.out.println("Original array:");
		printArray(array);

		bubbleSort(array);

		System.out.println("Sorted array:");
		printArray(array);
		System.out.println();

		// Sorting an ArrayList

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(64, 34, 25, 90, 12, 22, 90, 11));

		System.out.println("Original ArrayList:");
		printArrayList(list);

		bubbleSort(list);

		System.out.println("Sorted ArrayList:");
		printArrayList(list);

	}

	// Bubble Sort for an array
	public static void bubbleSort(int[] a) {
		int n = a.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	// Method to print an array
	public static void printArray(int[] a) {
		for (int value : a) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	// Bubble Sort for an ArrayList
	public static void bubbleSort(ArrayList<Integer> b) {
		int n = b.size();
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (b.get(j) > b.get(j + 1)) {
					int temp = b.get(j);
					b.set(j, b.get(j + 1));
					b.set(j + 1, temp);
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}
	}

	// Method to print an ArrayList
	public static void printArrayList(ArrayList<Integer> b) {
		for (int value : b) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}

/*
 * 
 * Main Method:
 * 
 * An integer array is created and populated.
 * 
 * The original array is printed using printArray, then sorted using bubbleSort.
 * 
 * An ArrayList is created and populated with integers.
 * 
 * The original ArrayList is printed using printArrayList, then sorted using the
 * bubbleSort method specific for ArrayList.
 * 
 * 
 * Bubble Sort for Array:
 * 
 * The method bubbleSort(int[] array) sorts an integer array using the Bubble
 * Sort algorithm.
 * 
 * It uses nested loops to compare and swap elements as necessary.
 * 
 * 
 * Bubble Sort for ArrayList:
 * 
 * The method bubbleSort(ArrayList<Integer> list) sorts an ArrayList using the
 * same Bubble Sort logic but accesses elements using get() and set() methods.
 * 
 * 
 * Print Methods:
 * 
 * 
 * printArray(int[] array) prints elements of the array.
 * 
 * printArrayList(ArrayList<Integer> list) prints elements of the ArrayList.
 * 
 */
