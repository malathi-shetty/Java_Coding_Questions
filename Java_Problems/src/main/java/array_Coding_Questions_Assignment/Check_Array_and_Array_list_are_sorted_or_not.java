package array_Coding_Questions_Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Check_Array_and_Array_list_are_sorted_or_not {

	public static void main(String[] args) {
		// Check Array sorted or not ..check array list sorted or not ?

		// Test with an array
		int[] sort = { 1, 2, 3, 4, 5 };
		int[] unsort = { 5, 3, 4, 1, 2 };

		System.out.println("Is sortedArray sorted? " + isArraySorted(sort)); // true
		System.out.println("Is unsortedArray sorted? " + isArraySorted(unsort)); // false
		System.out.println("");
		
		
		// Test with an ArrayList
		ArrayList<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		ArrayList<Integer> unsortedList = new ArrayList<>(Arrays.asList(5, 3, 4, 1, 2));

		System.out.println("Is sortedList sorted? " + isArrayListSorted(sortedList)); // true
		System.out.println("Is unsortedList sorted? " + isArrayListSorted(unsortedList)); // false

	}

	// Check if an array is sorted
	public static boolean isArraySorted(int[] a) {
		if (a == null || a.length < 2) {
			return true; // An empty array or a single-element array is considered sorted
		}

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false; // Found an element greater than the next one
			}
		}
		return true; // The array is sorted
	}

	// Check if an ArrayList is sorted
	public static boolean isArrayListSorted(ArrayList<Integer> list) {
		if (list == null || list.size() < 2) {
			return true; // An empty list or a single-element list is considered sorted
		}

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				return false; // Found an element greater than the next one
			}
		}
		return true; // The list is sorted
	}

}


/*

The SortedChecker class contains two methods: isArraySorted for checking an integer array and 
isArrayListSorted for checking an ArrayList<Integer>


Method Breakdown
-------

isArraySorted(int[] array)

Purpose: To determine if a given array of integers is sorted in non-decreasing order.

Parameters: Takes an integer array as input.

Return Value: Returns true if the array is sorted, false otherwise.

Logic:

First, it checks if the array is null or has fewer than two elements. If so, it returns true because an empty array or one with a single element is considered sorted.

It then iterates through the array, comparing each element with the next one. If it finds any element that is greater than the next, it returns false.

If the loop completes without finding any unsorted elements, it returns true.

-------

isArrayListSorted(ArrayList<Integer> list)

Purpose: To check if a given ArrayList of integers is sorted in non-decreasing order.

Parameters: Takes an ArrayList<Integer> as input.

Return Value: Returns true if the list is sorted, false otherwise.

Logic: Similar to isArraySorted:

It checks if the list is null or has fewer than two elements, returning true in such cases.

It iterates through the list and compares each element to the next. If any element is found to be greater than the next, it returns false.

If all elements are in order, it returns true.

-------

Main Method

The main method serves as a test harness for the two sorting-check methods:

----

Testing with an Array:

It creates a sorted array (sortedArray) and an unsorted array (unsortedArray).

It calls isArraySorted for both arrays and prints the results:

For sortedArray, it prints true since the elements are in order.

For unsortedArray, it prints false since the elements are not in order.

--------

Testing with an ArrayList:

It creates a sorted ArrayList (sortedList) and an unsorted ArrayList (unsortedList).

It calls isArrayListSorted for both lists and prints the results:

For sortedList, it prints true since the elements are in order.

For unsortedList, it prints false since the elements are not in order.

Key Points

Input Validation: Both methods include input validation to handle edge cases such as null values or single-element collections.

Iteration: Both methods use a simple loop to compare elements, making the solution straightforward and efficient for small to moderate-sized collections.

 n is the number of elements in the array or list.

This program demonstrates how to check if a collection of integers is sorted, and reusable methods for both arrays and ArrayLists

******************

Logic Explanation

**********

Initial Checks:

Null Check: The first step is to check if the input (array or list) is null. A null value means that there is no data to check, so it can be considered sorted by default.

Length Check: Next, the program checks if the length of the array or size of the list is less than two. This is because:

An empty array (length 0) has no elements to compare, and thus is considered sorted.

An array or list with one element (length 1) also doesn't require any comparisons, as there’s nothing to compare it against. Thus, it is also considered sorted.

Conclusion: If either of these conditions is true, the method immediately returns true.



Iterating Through the Elements:

After the initial checks, the method enters a loop that iterates through the array or list from the first element to the second-to-last element (using the index).

For each iteration, it compares the current element (let's call it array[i] or list.get(i)) with the next element (array[i + 1] or list.get(i + 1)).


Finding Unsorted Elements:

If during any iteration, the current element is found to be greater than the next element (i.e., array[i] > array[i + 1] or list.get(i) > list.get(i + 1)), this indicates that the order is not maintained (the array or list is not sorted).

In such a case, the method immediately returns false.


Completing the Loop:

If the loop completes without finding any pairs where the first element is greater than the second, it means all elements are in the correct order (sorted).

Therefore, after exiting the loop, the method returns true.


Summary
The method effectively checks for sorted order by ensuring:

It handles edge cases where the collection is empty or has only one element.
It iterates through the collection, comparing adjacent elements.

If any adjacent elements are out of order, it reports that the collection is not sorted.

If all comparisons pass, it confirms that the collection is sorted.

**********





*/