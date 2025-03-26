package findMaximumDifference;

public class FindMaximumDifference {

    public static void main(String[] args) {
        // You can test with different input arrays:
         int[] a = {10, 90, 2, 40, 1, 25};
        // int[] a = {};  // Uncomment to test empty array case
         // int[] a = {10};  // Test case with a single element
        printMaximumDifference(a);
    }

    private static void printMaximumDifference(int[] a) {
        if (a.length == 0) {
            System.out.println("Array is empty. No maximum difference.");
            return;
        }

        // Initialize max and min to the first element of the array
        int max = a[0];
        int min = a[0];
        
        System.out.println("Initial max: " + max);
        System.out.println("Initial min: " + min);

        // Iterate through the array starting from the second element
        for (int i = 1; i < a.length; i++) {
            System.out.println("Checking element: " + a[i]);
            
            // Update max if the current element is greater
            if (a[i] > max) {
                max = a[i];
                System.out.println("New max found: " + max);
            }
            // Update min if the current element is smaller
            else if (a[i] < min) {
                min = a[i];
                System.out.println("New min found: " + min);
            }
        }

        // Calculate and print the maximum difference
        System.out.println("Final max: " + max);
        System.out.println("Final min: " + min);
        System.out.println("Max Difference is: " + (max - min));
    }
}





/*

The given Java program is designed to calculate the maximum difference between the largest and smallest elements in an integer array. Here's how it works:

Key Steps in the Code:
Initialization:

The program initializes two variables, max and min, both of which are initially set to the first element of the array (a[0]). These will be used to store the largest and smallest elements of the array as it is processed.

Iterating Through the Array:

The program iterates over each element of the array:

If the current element is greater than max, it updates max to this new value.

If the current element is smaller than min, it updates min to this new value.

Calculating Maximum Difference:

After the iteration, max will hold the largest value in the array, and min will hold the smallest value.

The program calculates the maximum difference by subtracting min from max (max - min).

Output:

Finally, the program prints the maximum difference between the largest and smallest elements in the array.

Example:
Given the input array: {10, 90, 2, 40, 1, 25}

Find Max and Min:

The program will iterate over the array and find:

max = 90 (largest element)

min = 1 (smallest element)

Calculate Maximum Difference:

max - min = 90 - 1 = 89

Output:

The program will print:

Max Difference is: 89

*/