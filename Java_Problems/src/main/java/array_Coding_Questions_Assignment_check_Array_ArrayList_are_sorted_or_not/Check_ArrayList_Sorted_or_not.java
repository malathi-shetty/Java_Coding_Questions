package array_Coding_Questions_Assignment_check_Array_ArrayList_are_sorted_or_not;

import java.util.ArrayList;

public class Check_ArrayList_Sorted_or_not {
	// check array list sorted or not ?

	public static void main(String[] args) {
		ArrayList<Integer> sortedList = new ArrayList<>();
		sortedList.add(1);
		sortedList.add(2);
		sortedList.add(3);
		sortedList.add(4);
		sortedList.add(5);

		// ArrayList<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4,
		// 5));

		ArrayList<Integer> unsortedList = new ArrayList<>();
		unsortedList.add(5);
		unsortedList.add(3);
		unsortedList.add(4);
		unsortedList.add(1);
		unsortedList.add(2);
		// ArrayList<Integer> unsortedList = new ArrayList<>(Arrays.asList(5, 3, 4, 1,
		// 2));

		System.out.println("Is sortedList sorted? " + isSorted(sortedList)); // true
		System.out.println("Is unsortedList sorted? " + isSorted(unsortedList)); // false

	}

	public static boolean isSorted(ArrayList<Integer> list) {
		if (list == null || list.size() < 2) {
			return true; // An empty list or a list with one element is considered sorted
		}
		for (int i = 0; i < list.size() - 1; i++) {
			return false; // Found an element greater than the next one
		}

		return true; // The list is sorted
	}

}

/*
 * 
 * To check if an ArrayList is sorted in Java, you can follow a similar approach
 * as with an array.
 * 
 * Here’s an implementation that checks if an ArrayList<Integer> is sorted in
 * non-decreasing order
 * 
 * isSorted Method: This method checks whether the ArrayList is sorted by
 * iterating through the list and comparing each element with the next one.
 * 
 * Main Method: It tests the isSorted method with both a sorted and an unsorted
 * ArrayList.
 * 
 * Notes:
 * 
 * If you want to check for descending order, you can change the comparison to
 * list.get(i) < list.get(i + 1).
 * 
 * This implementation assumes the list contains Integer objects. You can adapt
 * it for other types by changing the type parameter in ArrayList<T>.
 * 
 * ********
 * 
 * 
 * for (int i = 0; i < array.length - 1; i++)
 * 
 * is indeed referring to the loop iterating from index 0 to the second-to-last
 * index of the array. Here's a breakdown of how it works:
 * 
 * Understanding the Loop Condition
 * 
 * array.length: This gives you the total number of elements in the array.
 * 
 * array.length - 1: This represents the last index of the array. For an array
 * of size n, the indices range from 0 to n - 1. So, array.length - 1 is the
 * index of the last element.
 * 
 * Iteration Details
 * 
 * When the loop condition is i < array.length - 1:
 * 
 * The loop will iterate from i = 0 up to i = array.length - 2.
 * 
 * This means the last value of i will be array.length - 2.
 * 
 * Example
 * 
 * For an array of size 5:
 * 
 * Indices: 0, 1, 2, 3, 4
 * 
 * array.length: 5
 * 
 * array.length - 1: 4 (last index)
 * 
 * Loop Iteration: The loop will iterate with i taking values 0, 1, 2, and 3.
 * 
 * During these iterations:
 * 
 * Example for Size 5
 * 
 * If the size of the list is 5, the iterations will be as follows:
 * 
 * Iteration 1 (i = 0): Compare index 0 (first element) with index 1 (second
 * element).
 * 
 * Iteration 2 (i = 1): Compare index 1 (second element) with index 2 (third
 * element).
 * 
 * 
 * Iteration 3 (i = 2): Compare index 2 (third element) with index 3 (fourth
 * element).
 * 
 * Iteration 4 (i = 3): Compare index 3 (fourth element) with index 4 (fifth
 * element).
 * 
 * At this point, if we were to set i to 4, we would try to access i + 1, which
 * is index 5. Since index 5 is out of bounds (there's no sixth element), this
 * would lead to an ArrayIndexOutOfBoundsException.
 * 
 * Conclusion
 * 
 * So, when you see size - 2 in the loop condition:
 * 
 * It ensures that the loop stops before the last index (size - 1), allowing
 * safe access to the next element in each iteration.
 * 
 * That's why the loop runs from 0 to size - 2, allowing comparisons to be made
 * without going out of bounds.
 * 
 * Conclusion
 * 
 * So, to summarize, the loop iterates from 0 to array.length - 2, which
 * effectively allows you to compare each element with its subsequent neighbor
 * without running into an ArrayIndexOutOfBoundsException. This is why you will
 * see the loop condition as i < array.length - 1 in the code.
 *******
 *
 * 
 * Sorted ArrayList:
 * 
 * ArrayList<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4,
 * 5));
 * 
 * Unsorted ArrayList:
 * 
 * ArrayList<Integer> unsortedList = new ArrayList<>(Arrays.asList(5, 3, 4, 1,
 * 2));
 * 
 * 1. Initial Checks
 * 
 * For both ArrayLists, the method first checks:
 * 
 * If the list is null: Neither of the lists is null, so we continue.
 * 
 * If the size of the list is less than 2: Both lists have 5 elements, so this
 * condition is also false.
 * 
 * Since both lists pass the initial checks, we move to the next step.
 * 
 * 2. Iterating Through the Elements
 * 
 * For the sortedList:
 * 
 * The loop will iterate from index 0 to 3 (the second-to-last index, which is
 * size - 2).
 * 
 * In each iteration, it compares the current element with the next one.
 * 
 * 
 * Iteration Details:
 * 
 * Iteration 1 (i = 0): Compare sortedList.get(0) (1) and sortedList.get(1) (2):
 * 
 * 1 <= 2 → continue.
 * 
 * Iteration 2 (i = 1): Compare sortedList.get(1) (2) and sortedList.get(2) (3):
 * 
 * 2 <= 3 → continue.
 * 
 * Iteration 3 (i = 2): Compare sortedList.get(2) (3) and sortedList.get(3) (4):
 * 
 * 3 <= 4 → continue.
 * 
 * Iteration 4 (i = 3): Compare sortedList.get(3) (4) and sortedList.get(4) (5):
 * 
 * 4 <= 5 → continue.
 * 
 * After completing all iterations without finding any unsorted elements, the
 * method concludes that the sortedList is sorted and returns true.
 * 
 * For the unsortedList:
 * 
 * The same loop iterates from index 0 to 3.
 * 
 * Iteration Details:
 * 
 * Iteration 1 (i = 0): Compare unsortedList.get(0) (5) and unsortedList.get(1)
 * (3):
 * 
 * 5 > 3 → found an unsorted pair! The method immediately returns false.
 * 
 * Since the method returns false during the first iteration, it does not
 * continue checking the remaining elements in the unsortedList.
 * 
 * Summary of Results
 * 
 * For the sortedList, the method returns true because all elements are in
 * non-decreasing order.
 * 
 * For the unsortedList, the method returns false because it found an element
 * (5) that was greater than the next element (3), indicating that the order is
 * not maintained.
 * 
 * Final Output
 * 
 * When you run the program with these ArrayLists, you would see:
 * 
 * Is 'sortedList' sorted? true
 * 
 * Is 'unsortedList' sorted? false
 * 
 * This demonstrates how the logic for checking if an ArrayList is sorted
 * follows the same principles as for an array, using the get method to access
 * elements and iterating through the list to compare adjacent values.
 * 

 * 
 */