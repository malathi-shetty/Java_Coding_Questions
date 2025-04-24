package find_Maximum_And_Minimum_Values_in_arrays;

import java.util.Arrays;

public class Find_Maximum_And_Minimum_Values_in_Given_Arrays {

	public static void main(String[] args) {
		
		/*
		 * Find Min and Max in Array
🔸 Input: {3, 6, 9, 5, 20, 43}
🔸 Output: Min: 3, Max: 43
		 * 
		 */
		int a[]= {3, 6, 9, 5, 20, 43};
		System.out.println("Number in the given array is: " + Arrays.toString(a));
		minAndMax(a);

	}

	public static void minAndMax(int[] a) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Minimum Number in the given array is: " + min);
		System.out.println("Maximum Number in the given array is: " + max);
	}

}
