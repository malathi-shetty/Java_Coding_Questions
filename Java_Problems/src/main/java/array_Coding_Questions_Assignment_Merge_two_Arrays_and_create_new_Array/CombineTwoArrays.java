package array_Coding_Questions_Assignment_Merge_two_Arrays_and_create_new_Array;

import java.util.Arrays;

public class CombineTwoArrays {
	
	/*
	 * 1. Combine Two Array
🔸 Input: {1, 2, 3}, {4, 5, 6}
🔸 Output: [1, 2, 3, 4, 5, 6]

	 */

	public static void main(String[] args) {
		int[]a1 = {1, 2, 3};
		System.out.println("a1: " + Arrays.toString(a1));
		int[]a2 = {4, 5, 6};
		System.out.println("a2: " + Arrays.toString(a2));
		combinedArrays(a1,a2);

	}

	public static void combinedArrays(int[] a1, int[] a2) {
		int length =a1.length + a2.length;
		int[] a3 = new int[length];
		for(int i=0; i<a1.length; i++)
		{
			a3[i] = a1[i];			
		}
		for(int i =0; i<a1.length; i++)
		{
			a3[a1.length+i] = a2[i];
		}
		System.out.println("New Combined Array is: " + Arrays.toString(a3));
		
	}

}
