package array_Coding_Questions_Assignment;

public class Check_Array_Sorted_or_not {

	public static void main(String[] args) {
		// Check Array sorted or not

		int[] sort = { 1, 2, 3, 4, 5 };
		int[] unsort = { 5, 3, 4, 1, 2 };

		System.out.println("Is sortedArray sorted? " + isSorted(sort)); // true
		System.out.println("Is unsortedArray sorted? " + isSorted(unsort)); // false

	}

	public static boolean isSorted(int[] a) {
		if (a == null || a.length < 2) {
			return true; // An empty array or an array with one element is considered sorted
		}

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false; // Found an element greater than the next one
			}
		}

		return true; // The array is sorted
	}

}

/*
 * To check if an array is sorted in Java, you can create a method that compares
 * each element to the next one.
 * 
 * isSorted Method: This method checks whether the array is sorted in
 * non-decreasing order. It iterates through the array and compares each element
 * to the next one.
 * 
 * Main Method: The main method tests the isSorted method with both sorted and
 * unsorted arrays.
 * 
 * Notes:
 * 
 * If you want to check for descending order, simply change the comparison from
 * a[i] > a[i + 1] to a[i] < a[i + 1].
 * 
 * The method handles null arrays and arrays with one element by returning true,
 * as they can be considered sorted by default.
 *************
 * 
 * 
 * 
 * walk through the logic of checking if the two example arrays (sort and
 * unsort) are sorted, using the detailed steps you provided.
 * 
 * Arrays Sorted Array: int[] sort = {1, 2, 3, 4, 5}; Unsorted Array: int[]
 * unsort = {5, 3, 4, 1, 2}; Step-by-Step Explanation 1. Initial Checks For both
 * arrays, the method first checks:
 * 
 * If the array is null: Neither of the arrays is null, so we continue. If the
 * length of the array is less than 2: Both arrays have 5 elements, so this
 * condition is also false. Since both arrays pass the initial checks, we
 * proceed to the next step.
 * 
 * 2. Iterating Through the Elements For the sort array:
 * 
 * The loop will iterate from index 0 to 3 (the second-to-last index, which is
 * length - 2). In each iteration, it compares the current element with the next
 * one. Iteration Details:
 * 
 * Iteration 1 (i = 0): Compare sort[0] (1) and sort[1] (2):
 * 
 * 1 <= 2 → continue. Iteration 2 (i = 1): Compare sort[1] (2) and sort[2] (3):
 * 
 * 2 <= 3 → continue. Iteration 3 (i = 2): Compare sort[2] (3) and sort[3] (4):
 * 
 * 3 <= 4 → continue. Iteration 4 (i = 3): Compare sort[3] (4) and sort[4] (5):
 * 
 * 4 <= 5 → continue. After completing all iterations without finding any
 * unsorted elements, the method concludes that the sort array is sorted and
 * returns true.
 * 
 * For the unsort array:
 * 
 * The same loop iterates from index 0 to 3. Iteration Details:
 * 
 * Iteration 1 (i = 0): Compare unsort[0] (5) and unsort[1] (3): 5 > 3 → found
 * an unsorted pair! The method immediately returns false. Since the method
 * returns false during the first iteration, it does not continue checking the
 * remaining elements in the unsort array.
 * 
 * Summary of Results For the sort array, the method returns true because all
 * elements were found to be in non-decreasing order. For the unsort array, the
 * method returns false because it found an element (5) that was greater than
 * the next element (3), indicating that the order is not maintained. Final
 * Output When you run the program, you will see:
 * 
 * c Copy code Is 'sort' array sorted? true Is 'unsort' array sorted? false This
 * illustrates how the logic of iterating through the elements and checking
 * their order works for both sorted and unsorted arrays.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */