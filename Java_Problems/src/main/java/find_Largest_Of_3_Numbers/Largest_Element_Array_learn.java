package find_Largest_Of_3_Numbers;

public class Largest_Element_Array_learn {

	public static void main(String[] args) {
		// print the largest element in an array 
		   int[] arr = {12, 35, 1, 10, 34, 1};  // Example array

	        // Initialize the largest element with the first element of the array
	        int largest = arr[0];

	        // Loop through the array to find the largest element
	        for (int num : arr) {
	            if (num > largest) {
	                largest = num;  // Update the largest element if a larger number is found
	            }
	        }

	        // Print the largest element
	        System.out.println("Largest element in the array: " + largest);
	   
	}

}

/*

Initialize Largest: We start by assuming that the first element of the array (arr[0]) is the largest.

Iterate Through the Array: We use a for-each loop to go through each element (num) of the array. If we find an element that is greater than the current largest, we update largest to that element.

Print the Largest Element: After the loop finishes, the variable largest will hold the largest value in the array, which is then printed.

Output:

For the input array {12, 35, 1, 10, 34, 1}, the output will be:

Largest element in the array: 35

*/