package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.Arrays;

public class Duplicates_in_the_Array_Using_Sorting {

	public static void main(String[] args) {
		// This method first sorts the array, then checks adjacent elements for
		// duplicates.

		int[] a = { 1, 2, 3, 4, 5, 1, 2, 6 };

		findDuplicates(a);
	}

	public static void findDuplicates(int[] a) {
		Arrays.sort(a);
		System.out.print("Duplicates: ");

		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
