package arrays_Sort_Elements;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Elements_in_Array_Using_Built_in_Methods_3 {

	public static void main(String[] args) {
		// Approach - 3: Sort in Descending Order
		// Collections.reverseOrder() doesnt support Primitive DataTypes
		// so instead of int we will say Derived Type: "Integer"
		
		Integer a[] = {30,50,20,10,60};
		System.out.println("Array Element Before Sorting: " + Arrays.toString(a));		
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array Element After Sorting: " + Arrays.toString(a));
	}
}