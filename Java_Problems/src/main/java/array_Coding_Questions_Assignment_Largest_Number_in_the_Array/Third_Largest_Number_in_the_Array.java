package array_Coding_Questions_Assignment_Largest_Number_in_the_Array;

public class Third_Largest_Number_in_the_Array {

	public static void main(String[] args) {
		// Third Largest Number in the Array

		int[] num = { 3, 5, 1, 8, 2, -4, 7 };
		System.out.print("Numbers in the array: ");
		for (int numbers : num) {
			System.out.print(numbers + " ");

		}
		System.out.println(); // New line for better formatting

		int thirdLargest = findThirdLargest(num);

		if (thirdLargest != Integer.MIN_VALUE) {
			System.out.println("Third largest number: " + thirdLargest);
		} else {
			System.out.println("Array does not have a third largest number.");
		}
	}

	// Method to find the third largest number in an array
	public static int findThirdLargest(int[] a) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int num : a) {
			if (num > largest) {
				thirdLargest = secondLargest; // Update third largest
				secondLargest = largest; // Update second largest
				largest = num; // Update largest
			} else if (num > secondLargest && num < largest) {
				thirdLargest = secondLargest; // Update third largest
				secondLargest = num; // Update second largest
			} else if (num > thirdLargest && num < secondLargest) {
				thirdLargest = num; // Update third largest
			}
		}

		return thirdLargest;
	}
}

/*
 * 
 * Array Initialization:
 * 
 * An integer array numbers is defined with some sample values.
 * 
 * Finding the Third Largest:
 * 
 * The findThirdLargest method initializes three variables:
 * 
 * largest, secondLargest, and thirdLargest are all set to Integer.MIN_VALUE.
 * 
 * The method iterates through the array:
 * 
 * If the current number (num) is greater than largest, it updates thirdLargest
 * to the current value of secondLargest, then updates secondLargest to the
 * current value of largest, and finally updates largest to num.
 * 
 * If num is not greater than largest but is greater than secondLargest, it
 * updates thirdLargest to the current value of secondLargest, then updates
 * secondLargest to num.
 * 
 * If num is greater than thirdLargest but less than secondLargest, it updates
 * thirdLargest to num.
 * 
 * Handling Edge Cases:
 * 
 * After the loop, if thirdLargest remains Integer.MIN_VALUE, it indicates that
 * there is no third largest number (for instance, if the array has fewer than
 * three distinct elements).
 * 
 * 
 * Output Example
 * 
 * For the given array {3, 5, 1, 8, 2, -4, 7}, the output will be:
 * 
 * 
 * Third largest number: 5
 * 
 * Edge Cases
 * 
 * If the array has fewer than three distinct elements, the program will
 * indicate that there is no third largest number. For example, for the array
 * {1, 1, 1}, the output would be:
 * 
 * Array does not have a third largest number.
 **********
 * 
 * 
 * 
 * 
 * 
 * complete breakdown of the findThirdLargest method, formatted to include each
 * element processed in the specified style.
 * 
 * Handling Each Element in the Array {3, 5, 1, 8, 2, -4, 7}
 * 
 * Handling the First Element: 3
 * 
 * Current State Before Processing 3:
 * 
 * Variables:
 * 
 * largest = Integer.MIN_VALUE
 * 
 * secondLargest = Integer.MIN_VALUE
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * Step-by-Step Comparison
 * 
 * Comparison:
 * 
 * Check if 3 > largest (Integer.MIN_VALUE):
 * 
 * Yes, so we proceed to update the variables:
 * 
 * Update thirdLargest to Integer.MIN_VALUE.
 * 
 * Update secondLargest to Integer.MIN_VALUE.
 * 
 * Set largest to 3.
 * 
 * Updating Variables:
 * 
 * After processing 3, the new values are:
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * secondLargest = Integer.MIN_VALUE
 * 
 * largest = 3
 * 
 * Final State After Processing 3
 * 
 * After handling the first element, the variables hold the following values:
 * 
 * largest = 3
 * 
 * secondLargest = Integer.MIN_VALUE
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * Handling the Second Element: 5
 * 
 * Current State Before Processing 5:
 * 
 * Variables:
 * 
 * largest = 3
 * 
 * secondLargest = Integer.MIN_VALUE
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * Step-by-Step Comparison
 * 
 * Comparison:
 * 
 * Check if 5 > largest (3):
 * 
 * Yes, so we proceed to update the variables:
 * 
 * Update thirdLargest to secondLargest (which is Integer.MIN_VALUE).
 * 
 * Set secondLargest to 3.
 * 
 * Set largest to 5.
 * 
 * Updating Variables:
 * 
 * After processing 5, the new values are:
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * secondLargest = 3
 * 
 * largest = 5
 * 
 * Final State After Processing 5
 * 
 * After handling the second element, the variables hold the following values:
 * 
 * largest = 5
 * 
 * secondLargest = 3
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * Handling the Third Element: 1
 * 
 * Current State Before Processing 1:
 * 
 * Variables:
 * 
 * largest = 5
 * 
 * secondLargest = 3
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * Step-by-Step Comparison
 * 
 * Comparison:
 * 
 * Check if 1 > largest (5):
 * 
 * No.
 * 
 * Check if 1 > secondLargest (3):
 * 
 * No.
 * 
 * Updating Variables:
 * 
 * No updates are made after processing 1.
 * 
 * Final State After Processing 1
 * 
 * After handling the third element, the variables hold the following values:
 * 
 * largest = 5
 * 
 * secondLargest = 3
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * Handling the Fourth Element: 8
 * 
 * Current State Before Processing 8:
 * 
 * Variables:
 * 
 * largest = 5
 * 
 * secondLargest = 3
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * Step-by-Step Comparison
 * 
 * Comparison:
 * 
 * Check if 8 > largest (5):
 * 
 * Yes, so we proceed to update the variables:
 * 
 * Update thirdLargest to secondLargest (which is 3).
 * 
 * Update secondLargest to largest (which is 5).
 * 
 * Set largest to 8.
 * 
 * Updating Variables:
 * 
 * After processing 8, the new values are:
 * 
 * thirdLargest = 3
 * 
 * secondLargest = 5
 * 
 * largest = 8
 * 
 * Final State After Processing 8
 * 
 * After handling the fourth element, the variables hold the following values:
 * 
 * largest = 8
 * 
 * secondLargest = 5
 * 
 * thirdLargest = 3
 * 
 * Handling the Fifth Element: 2
 * 
 * Current State Before Processing 2:
 * 
 * Variables:
 * 
 * largest = 8
 * 
 * secondLargest = 5
 * 
 * thirdLargest = 3
 * 
 * Step-by-Step Comparison
 * 
 * Comparison:
 * 
 * Check if 2 > largest (8):
 * 
 * No.
 * 
 * Check if 2 > secondLargest (5):
 * 
 * No.
 * 
 * Updating Variables:
 * 
 * No updates are made after processing 2.
 * 
 * Final State After Processing 2
 * 
 * After handling the fifth element, the variables hold the following values:
 * 
 * largest = 8
 * 
 * secondLargest = 5
 * 
 * thirdLargest = 3
 * 
 * Handling the Sixth Element: -4
 * 
 * Current State Before Processing -4:
 * 
 * Variables:
 * 
 * largest = 8
 * 
 * secondLargest = 5
 * 
 * thirdLargest = 3
 * 
 * Step-by-Step Comparison
 * 
 * Comparison:
 * 
 * Check if -4 > largest (8):
 * 
 * No.
 * 
 * Check if -4 > secondLargest (5):
 * 
 * No.
 * 
 * Check if -4 > thirdLargest (3):
 * 
 * No.
 * 
 * Updating Variables:
 * 
 * No updates are made after processing -4.
 * 
 * Final State After Processing -4
 * 
 * After handling the sixth element, the variables hold the following values:
 * 
 * largest = 8
 * 
 * secondLargest = 5
 * 
 * thirdLargest = 3
 * 
 * Handling the Seventh Element: 7
 * 
 * Current State Before Processing 7:
 * 
 * Variables:
 * 
 * largest = 8
 * 
 * secondLargest = 5
 * 
 * thirdLargest = 3
 * 
 * Step-by-Step Comparison
 * 
 * Comparison:
 * 
 * Check if 7 > largest (8):
 * 
 * No.
 * 
 * Check if 7 > secondLargest (5):
 * 
 * Yes, so we proceed to update the variables:
 * 
 * Update thirdLargest to secondLargest (which is 5).
 * 
 * Set secondLargest to 7.
 * 
 * Updating Variables:
 * 
 * After processing 7, the new values are:
 * 
 * thirdLargest = 5 (the previous value of secondLargest)
 * 
 * secondLargest = 7
 * 
 * Final State After Processing 7
 * 
 * After handling the last element, the variables hold the following values:
 * 
 * largest = 8
 * 
 * secondLargest = 7
 * 
 * thirdLargest = 5
 * 
 * 
 * Final Output
 * 
 * After iterating through the entire array, the values of the variables are:
 * 
 * largest = 8
 * 
 * secondLargest = 7
 * 
 * thirdLargest = 5
 * 
 * The method returns 5.
 * 
 * Result Display
 * 
 * In the main method, after calling findThirdLargest(numbers), the output will
 * be:
 * 
 * 
 * Third largest number: 5
 * 
 * Handling Edge Cases
 * 
 * If the array has fewer than three distinct numbers, thirdLargest will remain
 * Integer.MIN_VALUE, and the output will indicate that there is no third
 * largest number.
 *
 *
 **************
 *
 * Integer.MIN_VALUE is a constant that represents the smallest possible value
 * for an int, which is −2,147,483,648. 
 * 
 * It’s often used as an initial value for
 * comparison purposes, especially in algorithms where you need to find the
 * maximum or minimum values in a set of numbers.
 * 
 * Purpose of Using Integer.MIN_VALUE:
 * 
 * Initialization:
 * 
 * Setting largest, secondLargest, and thirdLargest to Integer.MIN_VALUE ensures
 * that any number in the array will be larger during the first comparison. 
 * 
 * This way, when the loop starts, the first number encountered will update these
 * variables correctly.
 * 
 * Comparison:
 * 
 * Since these variables start with the lowest possible value, any number in the
 * array will replace them when processed, allowing the algorithm to correctly
 * identify the largest, second largest, and third largest distinct values.
 * 
 * Example:
 * 
 * Consider an array of numbers: {3, 5, 1, 8, 2}.
 * 
 * Initial Values:
 * 
 * largest = Integer.MIN_VALUE (initially, −2,147,483,648)
 * 
 * secondLargest = Integer.MIN_VALUE
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * First Iteration:
 * 
 * When processing the first number 3:
 * 
 * 3 > Integer.MIN_VALUE: True
 * 
 * Update:
 * 
 * largest = 3
 * 
 * secondLargest = Integer.MIN_VALUE
 * 
 * thirdLargest = Integer.MIN_VALUE
 * 
 * Continued Iterations:
 * 
 * As the algorithm continues to process the array, it will update these
 * variables based on comparisons, eventually resulting in the correct values
 * for the largest three distinct numbers.
 * 
 * Conclusion:
 * 
 * Using Integer.MIN_VALUE is a common practice in algorithms that seek to find
 * maximum or minimum values in a dataset. 
 * 
 * It serves as a safe starting point to
 * ensure that any actual number in the dataset will replace it during the
 * comparison.
 * 
 * Output:
 * 
 * Numbers in the array: 3 5 1 8 2 -4 7 
 * 
Third largest number: 5
 * 
 * 
 */
