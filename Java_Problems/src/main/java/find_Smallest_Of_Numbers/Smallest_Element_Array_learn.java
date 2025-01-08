package find_Smallest_Of_Numbers;

public class Smallest_Element_Array_learn {

	public static void main(String[] args) {
		// print the smallest element in an array
		  int[] arr = {12, 35, 1, 10, 34, 1};  // Example array

	        // Initialize the smallest element with the first element of the array
	        int smallest = arr[0];

	        // Loop through the array to find the smallest element
	        for (int num : arr) {
	            if (num < smallest) {
	                smallest = num;  // Update the smallest element if a smaller number is found
	            }
	        }

	        // Print the smallest element
	        System.out.println("Smallest element in the array: " + smallest);
	    
	}

}

/*

Initialize Smallest: We start by assuming that the first element of the array (arr[0]) is the smallest.

Iterate Through the Array: We use a for-each loop to go through each element (num) of the array. If we find an element that is smaller than the current smallest, we update smallest to that element.

Print the Smallest Element: After the loop finishes, the variable smallest will hold the smallest value in the array, which is then printed.

Output:

For the input array {12, 35, 1, 10, 34, 1}, the output will be:

Smallest element in the array: 1

*/