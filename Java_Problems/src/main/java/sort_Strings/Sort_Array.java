package sort_Strings;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {
		// sort the elements of an array in ascending order 
		
	    int[] arr = {12, 35, 1, 10, 34, 1};  // Example array

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array in ascending order
        Arrays.sort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(arr));
    
	}

}


/*

To sort the elements of an array in ascending order in Java, you can use the built-in Arrays.sort() method from the java.util.Arrays package, which provides an easy and efficient way to sort an array.

Explanation:

Importing Arrays class: We import java.util.Arrays to use its built-in sort() method.

Initial Array: We define an integer array with some unsorted values.

Sorting: We call Arrays.sort(arr), which sorts the array arr in ascending order.

Printing the Array: The Arrays.toString() method is used to convert the array into a readable string format for printing.

Output:

For the input array {12, 35, 1, 10, 34, 1}, the output will be:

Original Array: [12, 35, 1, 10, 34, 1]

Sorted Array in Ascending Order: [1, 1, 10, 12, 34, 35]

Explanation of Sorting:

The Arrays.sort() method uses the Dual-Pivot Quicksort algorithm (for primitive types like int[]), which is efficient with an average time complexity of O(n log n).


*/