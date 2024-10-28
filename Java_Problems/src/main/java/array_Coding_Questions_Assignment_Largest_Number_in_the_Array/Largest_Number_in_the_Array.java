package array_Coding_Questions_Assignment_Largest_Number_in_the_Array;

public class Largest_Number_in_the_Array {

	public static void main(String[] args) {
		// Largest_Number_in_the_Array
		
		int[] num = {3, 5, 1, 8, 2, 0,-4, 7};
		//int[] num = {};

		 System.out.print("Numbers in the array: ");
			for (int numbers : num) {
				System.out.print(numbers + " ");
				
			}
			System.out.println(); // New line for better formatting
			
			 try {
        int largest = findLargest(num);
        
        System.out.println("Largest number: " + largest);
			 } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to find the largest number in an array
    public static int findLargest(int[] a) {
    	 // Check if the array is empty
        if (a.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        // Initialize largest to the minimum possible integer value
        int largest = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : a) {
            // Update largest if the current number is greater
            if (num > largest) {
                largest = num;
            }
        }

        return largest;

	}

}

/*
 * 
 * Check for Empty Array:

The line if (array.length == 0) { throw new IllegalArgumentException("Array cannot be empty."); } has been added at the beginning of the findLargest method. This checks if the input array is empty and throws an exception if it is.

Exception Handling in main:

A try-catch block is added in the main method to handle the potential IllegalArgumentException. This way, if the method is called with an empty array, the exception will be caught, and the error message will be printed.

*/
