package nthHighest;

import java.util.Arrays;

public class NthHighest {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6 };
		int n = 3;

	Arrays.sort(a);
	  // Print the sorted array
    System.out.println("Sorted array: " + Arrays.toString(a));
		int count = 1;
		int nthLargest = a[a.length - 1];

	
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] < nthLargest) {
				nthLargest = a[i];
				count++;
			}

			if (count == n) {
				break;
			}
		}

		if (count < n) {
			System.out.println("There are fewer than " + n + " distinct elements in the array.");
		} else {
			System.out.println(n + "th largest distinct element: " + nthLargest);
		}
	}

}
