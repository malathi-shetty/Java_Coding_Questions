package smallest_Largest;

public class Largest_Number_In_An_Array_1 {

	public static void main(String[] args) {

		// Initialize array
		int[] a = { 25, 11, 7, 75, 56 };

		// Initialize max with first element of array.
		int max = a[0];

		// Loop through the array
		for (int i = 0; i < a.length; i++) {
			// Compare elements of array with max
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Largest element present in given array: " + max);

	}

}
