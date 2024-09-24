package practice_Exercise;

import java.util.Arrays;

public class Simple_Exercise_15 {

	public static void main(String[] args) {
		 int[] arr = { 3, 1, 4, 1, 5, 9 };
		 Arrays.sort(arr);
	//	 System.out.println(Arrays.binarySearch(arr, 2));
		 System.out.println(Arrays.binarySearch(arr, 9));
	//	 System.out.println(Arrays.binarySearch(arr, 0));
	}

}


/*

Arrays.sort(arr);

This sorts the array in ascending order. After sorting, arr will be {1, 1, 3, 4, 5, 9}.

System.out.println(Arrays.binarySearch(arr, 2));

This performs a binary search for the value 2 in the sorted array. If 2 is not present in the array, Arrays.binarySearch will return a negative number. The negative number will be the bitwise complement of the insertion point where 2 would go if it were in the array.

In this case, 2 is not present in the sorted array {1, 1, 3, 4, 5, 9}.

The insertion point for 2 would be between 1 and 3, specifically at index 2.

The binary search will thus return -(insertion point) - 1, which is -(2) - 1 = -3.

Expected Output: The output of the program will be -3, which indicates that 2 is not in the array and would be inserted at index 2.





*/