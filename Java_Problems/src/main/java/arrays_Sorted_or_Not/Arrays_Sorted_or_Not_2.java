package arrays_Sorted_or_Not;

public class Arrays_Sorted_or_Not_2 {

	public static void main(String[] args) {
			int a[] = { 1, 3, 4, 5, 2 }; // Example array
		//int a[] = { 1, 2, 3, 4, 4, 5 };
		boolean flag = true; // Assume the array is sorted initially

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				flag = false; // Found an element greater than the next one
				break; // No need to check further
			}
		}

		// Output the result
		if (flag) {
			System.out.println("Array is sorted in ascending order");
		} else {
			System.out.println("Array is not sorted in ascending order");
		}
		
		 // Print all elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // For a newline after printing elements

	}

}

/*
 * To check if an array is sorted in ascending order, you should verify that
 * each element is less than or equal to the next element. If you find any pair
 * where the first element is greater than the next, the array is not sorted.
 * 
 * 
 * Initialization: Set flag to true at the beginning, assuming the array is sorted. 
 * 
 * Iteration: Loop through the array from the first element to the second-to-last element. 
 * 
 * Compare each element a[i] with the next element a[i + 1]. 
 * 
 * If any element is greater than the next element, set flag to false and exit the loop early. 
 * 
 * Output: After the loop, check the value of flag to determine if the array is sorted and print the result.
 * 
 * boolean flag = true; assumes the array is sorted unless proven otherwise.
 * 
 * The loop iterates through the array and compares each element with the next one. 
 * 
 * If any element is greater than the next, flag is set to false, and the loop breaks early. 
 * 
 * After the loop, the program prints whether the array is sorted based on the value of flag
 * 
 * Initially Assume Sorted (IAS) For each Element, 
 * 
 * Check Next (FECN): If Greater, then Array Not sorted (GANS) 
 * 
 * If Sorted throughout, then Array Sorted (SAS)
 * 
 * assuming the array is sorted, and then check each pair of elements to verify
 * if this assumption holds.
 */
