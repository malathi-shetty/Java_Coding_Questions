package arrays_Sorted_or_Not;

import java.util.Arrays;

public class Arrays_Sorted_or_Not_1 {

	public static void main(String[] args) {

		int a[] = { 2, 1, 1, 3, 4, 5, 4, 2 }; // 1,2,3,4,5

		// Sort the array
		 Arrays.sort(a);
		 System.out.println("Sorted array: " + Arrays.toString(a));

		// Check if the array is sorted
		boolean flag = true; // Assume the array is sorted
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				flag = false; // Array is not sorted
				break; // Exit the loop
			}
		}

		// Print sorting status based on the result of the loop
		if (flag == true) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted");
		}

	}

}
