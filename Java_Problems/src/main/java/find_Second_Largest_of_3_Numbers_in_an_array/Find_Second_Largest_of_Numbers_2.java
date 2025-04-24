package find_Second_Largest_of_3_Numbers_in_an_array;

public class Find_Second_Largest_of_Numbers_2 {

		 public static void main(String[] args) {
		        int[] arr = {12, 35, 1, 10, 34, 1};  // Example array
		        System.out.println("Second Largest Number: " + findSecondLargest(arr));
		    }

		    public static int findSecondLargest(int[] arr) {
		        int largest = Integer.MIN_VALUE; // To hold the largest number
		        int secondLargest = Integer.MIN_VALUE; // To hold the second largest number

		        for (int num : arr) {
		            if (num > largest) {
		                secondLargest = largest; // Update second largest before largest
		                largest = num; // Update largest number
		            } else if (num > secondLargest && num != largest) {
		                secondLargest = num; // Update second largest
		            }
		        }

		        // If second largest is still Integer.MIN_VALUE, it means there wasn't enough distinct numbers
		        if (secondLargest == Integer.MIN_VALUE) {
		            System.out.println("There is no second largest number.");
		            return -1; // Indicate there's no second largest number
		        }

		        return secondLargest;

}
}

/*

Explanation:

Initial Values: We initialize two variables, largest and secondLargest, to Integer.MIN_VALUE, which is the smallest possible value in Java. This ensures that any number in the array will be greater than these initial values.

Looping through the array:

For each number in the array:

If the number is larger than largest, we update secondLargest to be the previous largest, and then update largest to the current number.

If the number is not larger than largest but larger than secondLargest, and it’s not equal to largest, we update secondLargest.

Edge Cases:

If the array has less than two distinct numbers, secondLargest will remain Integer.MIN_VALUE. In this case, we return a message indicating there's no second largest number.

Output:

For the input array {12, 35, 1, 10, 34, 1}, the output will be:

Second Largest Number: 34

*/