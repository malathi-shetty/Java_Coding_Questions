package arrays_Sort_Elements;

import java.util.Arrays;

public class Sort_Elements_in_Array_Bubble_Sort {

	public static void main(String[] args) {
		
		int a[] = {4,2,1,5,3}; 
		System.out.println("Array Before Sorting: " + Arrays.toString(a));
		
		int n = a.length; // n = 5
		System.out.println("Length of the Array: " + n);
		
		for(int i=0; i< n-1; i++ )// if n = 5, then  passes should be n-1 ie. 4 - Number of Passes
		{
			for(int j = 0; j< n-1 ; j++)// Iterate each & every Pass - Iteration in each Pass
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}		
		System.out.println("Array After Sorting: " + Arrays.toString(a));
	}
}