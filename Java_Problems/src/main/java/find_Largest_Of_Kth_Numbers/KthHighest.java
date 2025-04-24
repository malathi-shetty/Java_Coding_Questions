package find_Largest_Of_Kth_Numbers;

import java.util.Arrays;

public class KthHighest {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6 };
		int k = 3;

	Arrays.sort(a);
	  // Print the sorted array
    System.out.println("Sorted array: " + Arrays.toString(a));
		int count = 1;
		int kthLargest = a[a.length - 1];

	
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] < kthLargest) {
				kthLargest = a[i];
				count++;
			}

			if (count == k) {
				break;
			}
		}

		if (count < k) {
			System.out.println("There are fewer than " + k + " distinct elements in the array.");
		} else {
			System.out.println(k + "th largest distinct element: " + kthLargest);
		}
	}

}
