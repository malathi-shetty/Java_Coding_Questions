package array_Coding_Questions_Assignment_Reverse_Array_and_ArrayList;

public class Reverse_elements_Array_learn {

	public static void main(String[] args) {
		// print the elements of an array in reverse order 
		
		  int[] a = {12, 35, 1, 10, 34, 6};  // Example array
		  // Print original array
	        System.out.print("Original Array: ");
	        for (int num : a) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        // Print the elements in reverse order
	        System.out.print("Array in reverse order: ");
	        for (int i = a.length - 1; i >= 0; i--) {
	            System.out.print(a[i] + " ");  // Print each element starting from the last
	        }

	}

}

/*
Array Initialization: We define an array arr with some integer values.

Loop in Reverse: We use a for loop that starts from the last index (arr.length - 1) and moves towards the first index (0). The loop condition checks if i >= 0 to ensure we are within valid array bounds.

Print Elements: Inside the loop, we print the elements of the array starting from the last element down to the first.

For the input array {12, 35, 1, 10, 34, 1}, the output will be:

Array in reverse order: 1 34 10 1 35 12 

Output:

Original Array: 12 35 1 10 34 6 

Array in reverse order: 6 34 10 1 35 12 

*/