package practice_Exercise;

import java.util.Arrays;

public class Simple_Exercise_23_findKthLargest {

	public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Sort the array in descending order
        Arrays.sort(nums);
        // Return the kth largest element (which is at index nums.length - k)
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargest(arr, k);

        System.out.println("The " + k + "th largest element is: " + result);
    }

}


/*
Sorting the Array:

The Arrays.sort() method sorts the array in ascending order.

After sorting, the largest elements will be at the end of the array.

Accessing the kth Largest Element:

To find the kth largest element, calculate the index as nums.length - k.

This works because, in a sorted array (ascending), the last element is the largest, the second-to-last is the second largest, and so on.


*/