package arrays_Sort_Elements;

import java.util.Arrays;

public class Sort_Elements_in_Array_Using_Built_in_Methods_2 {

	public static void main(String[] args) {
		// Approach 2
		
		int a[] = {30,50,20,10,60};
		System.out.println("Array Element Before Sorting: " + Arrays.toString(a));		
		Arrays.sort(a);
		System.out.println("Array Element After Sorting: " + Arrays.toString(a));
	}
}