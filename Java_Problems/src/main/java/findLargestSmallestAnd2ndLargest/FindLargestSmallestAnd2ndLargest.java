package findLargestSmallestAnd2ndLargest;

import java.util.Arrays;

public class FindLargestSmallestAnd2ndLargest {

    public static void main(String[] args) {
        // Test case 1: Multiple elements
         int[] a = { 23, 5, 1, 89, 65, 0, 23, 432, 1 };

        // Test case 2: All elements are the same
        // int[] a = { 23, 23, 23, 23 };

        // Test case 3: Only one element in the array
      //  int[] a = { 5 };

        printLargest2ndLargestAndSmallest(a);
    }

    private static void printLargest2ndLargestAndSmallest(int[] a) {
        int lengthOfArray = a.length;
        System.out.println("Length of Array: " + lengthOfArray );
        
        // Print the input array for better understanding
        System.out.println("Input Array: " + Arrays.toString(a));

        // Initialize largest, smallest, and secondLargest
        int largest = a[0];
        int smallest = a[0];
        int secondLargest = Integer.MIN_VALUE; // Initially set to smallest possible value

        // Loop through the array starting from the second element
        for (int i = 1; i < lengthOfArray; i++) {
            // Update largest and second largest
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] < largest) {
                secondLargest = a[i];
            }

            // Update smallest
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        // Handling the case when second largest is not found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element. "
                    + "Largest: " + largest + "  Smallest: " + smallest);
        } else {
            System.out.println("Largest: " + largest + "  Second Largest: " + secondLargest + "  Smallest: " + smallest);
        }
    }
}


/*


The program finds and prints the largest, second largest, and smallest elements in a given array of integers. It also handles edge cases like when there is only one element or when all elements are the same.


Key Steps in the Code:

Input Array:

The input array is printed first using Arrays.toString(a) so that users can see the data being processed.

Initialization:

The program initializes three variables:

largest: Starts with the first element of the array.

smallest: Also starts with the first element.

secondLargest: Set to Integer.MIN_VALUE (a very small value) initially to track the second largest number.

Loop Through Array:

The program iterates through the array, updating largest, secondLargest, and smallest:

Largest: If the current element is greater than largest, it becomes the new largest, and the old largest becomes the second largest.

Second Largest: If the current element is smaller than largest but larger than secondLargest, it becomes the new second largest.

Smallest: If the current element is smaller than smallest, it becomes the new smallest.

Edge Case Handling:

After the loop, if secondLargest is still Integer.MIN_VALUE, it means there was no valid second largest element (either because there is only one element or all elements are the same). The program then prints a message stating that there is no second largest element.

Output:

The program prints the largest, secondLargest, and smallest values or the message indicating no second largest element.

Example:
For the array [23, 5, 1, 89, 65, 0, 23, 432, 1], the output will be:

Input Array: [23, 5, 1, 89, 65, 0, 23, 432, 1]

Largest: 432  Second Largest: 89  Smallest: 0

Edge Cases:

Single Element: If the array has only one element, it prints that there's no second largest.

Identical Elements: If all elements are the same, it also prints that there's no second largest element.


*/