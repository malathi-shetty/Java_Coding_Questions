package find_Smallest_Of_Numbers;

public class Largest_Smallest_Array {

	public static void main(String[] args) {
		 int[] arr = {12, 35, 1, 10, 34, 1};  // Example array

	        // Find the largest and smallest elements
	        int largest = arr[0]; // Assume the first element is the largest initially
	        int smallest = arr[0]; // Assume the first element is the smallest initially

	        for (int num : arr) {
	            if (num > largest) {
	                largest = num; // Update largest if a larger number is found
	            }
	            if (num < smallest) {
	                smallest = num; // Update smallest if a smaller number is found
	            }
	        }

	        // Print the largest and smallest elements
	        System.out.println("Largest element in the array: " + largest);
	        System.out.println("Smallest element in the array: " + smallest);
	  
	}

}

/*

Explanation:

Initialization: We initialize both largest and smallest to the first element of the array (arr[0]).

Looping through the array: We iterate over each element in the array using a for-each loop:

If the current element (num) is greater than largest, we update largest to the current element.

If the current element (num) is smaller than smallest, we update smallest to the current element.

Output: After the loop finishes, we print both the largest and smallest values found in the array.

Output:

For the input array {12, 35, 1, 10, 34, 1}, the output will be:

Largest element in the array: 35

Smallest element in the array: 1

*/