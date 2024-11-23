package rotate_array;

public class Rotate_Array {
	
	/*
	 *  Rotate right shift array at 3 times using Java Program. 
	 *  
 Input: [1,2,3,4,5,6 ,7] and n=3;
 
 Output: [5,6,7,1,2,3,4]
	 */

	  public static void rotate(int[] a, int n) {
	        int length = a.length;
	        if (length == 0) return;

	        // Normalize n to handle cases where n is larger than the array length
	        n = n % length;

	        // Reverse the entire array
	        reverse(a, 0, length - 1);

	        // Reverse the first 'n' elements
	        reverse(a, 0, n - 1);

	        // Reverse the remaining elements
	        reverse(a, n, length - 1);
	    }

	    // Helper method to reverse a portion of the array
	    private static void reverse(int[] a, int start, int end) {
	        while (start < end) {
	            int temp = a[start];
	            a[start] = a[end];
	            a[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5, 6, 7};
	        int n = 3;

	        System.out.println("Original array: ");
	        printArray(a);

	        rotate(a, n);

	        System.out.println("Array after rotating by " + n + " times: ");
	        printArray(a);
	    }

	    // Helper method to print the array
	    public static void printArray(int[] a) {
	        for (int num : a) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	}

}

/*
 * 
 * Initial Setup

int[] a = {1, 2, 3, 4, 5, 6, 7};  // Original array

int n = 3;  // Rotate 3 positions to the right

We initialize the array a = [1, 2, 3, 4, 5, 6, 7] and we want to rotate it by n = 3 times.

This is the starting point, and we'll follow through the program step by step.

Step 1: Print the Original Array

We print the original array:

System.out.println("Original array: ");

printArray(a);  // Output the original array

Output at this point:

Original array: 

1 2 3 4 5 6 7

This is the array at the beginning before any operations are done.

Step 2: Normalize n

We normalize n to ensure it doesn't exceed the array length:

n = n % a.length;  // n = 3 % 7 = 3

Explanation: This ensures if n is greater than the array length, it still gives a meaningful result. For example, rotating by 7 or any multiple of 7 won't change the array, so we take n % a.length.

Here, n = 3 % 7 = 3, so n remains 3, which means we will rotate the array 3 positions to the right.

Step 3: Reverse the Entire Array

Next, we reverse the entire array using the reverse() method:

reverse(a, 0, a.length - 1);  // Reverse the entire array

We call reverse(a, 0, 6) to reverse the entire array.

Detailed Steps in the Reverse Method (reverse(a, 0, 6)):

Swap a[0] (1) with a[6] (7):

Array becomes: [7, 2, 3, 4, 5, 6, 1]

Swap a[1] (2) with a[5] (6):

Array becomes: [7, 6, 3, 4, 5, 2, 1]

Swap a[2] (3) with a[4] (5):

Array becomes: [7, 6, 5, 4, 3, 2, 1]

Array after reversing the entire array:

[7, 6, 5, 4, 3, 2, 1]

Step 4: Reverse the First n = 3 Elements

We now reverse the first n = 3 elements (indices 0 to 2):

reverse(a, 0, n - 1);  // Reverse the first 3 elements (from index 0 to 2)

We call reverse(a, 0, 2) to reverse the first 3 elements of the array.

Detailed Steps in the Reverse Method (reverse(a, 0, 2)):

Swap a[0] (7) with a[2] (5):

Array becomes: [5, 6, 7, 4, 3, 2, 1]

Swap a[1] (6) with a[1] (6) (no change, since they are the same).

Array after reversing the first 3 elements:

[5, 6, 7, 4, 3, 2, 1]

Step 5: Reverse the Remaining Elements

Next, we reverse the remaining elements (from index 3 to 6):

reverse(a, n, a.length - 1);  // Reverse the remaining elements (from index 3 to 6)

We call reverse(a, 3, 6) to reverse the remaining part of the array (from index 3 to 6).

Detailed Steps in the Reverse Method (reverse(a, 3, 6)):

Swap a[3] (4) with a[6] (1):

Array becomes: [5, 6, 7, 1, 3, 2, 4]

Swap a[4] (3) with a[5] (2):

Array becomes: [5, 6, 7, 1, 2, 3, 4]

Array after reversing the remaining elements:

[5, 6, 7, 1, 2, 3, 4]

Step 6: Print the Rotated Array

Now we print the rotated array:

System.out.println("Array after rotating by " + n + " times: ");

printArray(a);  // Output the rotated array

Final Output:

Array after rotating by 3 times: 
5 6 7 1 2 3 4

This is the final rotated array after rotating by 3 positions to the right.

Complete Breakdown with Output at Each Step

Let’s summarize the changes to the array at each step along with the outputs:

Initial array:

1 2 3 4 5 6 7

After reversing the entire array (reverse(a, 0, 6)):

7 6 5 4 3 2 1

After reversing the first 3 elements (reverse(a, 0, 2)):

5 6 7 4 3 2 1

After reversing the remaining elements (reverse(a, 3, 6)):

5 6 7 1 2 3 4

Final output:

5 6 7 1 2 3 4
Final Recap:

Reverse entire array → [7, 6, 5, 4, 3, 2, 1]

Reverse first 3 elements → [5, 6, 7, 4, 3, 2, 1]

Reverse remaining elements → [5, 6, 7, 1, 2, 3, 4]

Final rotated array after rotating 3 times to the right → [5, 6, 7, 1, 2, 3, 4]

*/
