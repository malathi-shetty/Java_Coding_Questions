package find_Second_Largest_of_3_Numbers_in_an_array;

public class Find_Second_Largest_of_3_Numbers_in_an_array_1_8 {

	public static void main(String[] args) {
		int[] a = { 2, 3, 8, 5, -6 };

		int Largest = a[0];
		int secondLargest = Integer.MIN_VALUE; // Initialize to handle all cases

		for (int i = 1; i < a.length; i++) // Start from 1 as we already considered a[0]
		{
			if (a[i] > Largest) {
				secondLargest = Largest;
				Largest = a[i];
			} else if (a[i] > secondLargest && a[i] != Largest) {
				secondLargest = a[i];
			}
		}
		// System.out.println(secondLargest);

		// If secondLargest is still Integer.MIN_VALUE, it means there was no valid
		// second largest
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No valid second largest element found.");
		} else {
			System.out.println("The second largest number is: " + secondLargest);
		}
	}

}
