package arrays_Sort_Elements;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Elements_in_Array_Using_Built_in_Methods_3_learn {

	public static void main(String[] args) {
		// Approach - 3: Sort in Descending Order
		// Collections.reverseOrder() doesnt support Primitive DataTypes
		// so instead of int we will say Derived Type: "Integer"

		Integer a[] = { 30, 50, 20, 10, 60 };
		System.out.println("Array Element Before Sorting: " + Arrays.toString(a));

		Arrays.sort(a);
		System.out.println("Array Element After Sorting - Ascending Order: " + Arrays.toString(a));

		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array Element After reverseOrder Sorting - Descending Order: " + Arrays.toString(a));

		// Sort in parallel (note: this will sort the array in ascending order again)
		Arrays.parallelSort(a);
		System.out.println("Array Element After Sorting - Parallel Sort: " + Arrays.toString(a));
	}
}

/*
 * If you want to see the effect of parallelSort(), you should avoid calling it
 * after reverseOrder(), as it will overwrite the sorting done by
 * reverseOrder().
 * 
 * Initialization: You start with an array of Integer objects and print its
 * state before sorting.
 * 
 * Ascending Sort: You use Arrays.sort() to sort the array in ascending order.
 * Arrays.sort(a);
 * 
 * 
 * Descending Sort: You then use Arrays.sort() with Collections.reverseOrder()
 * to sort the array in descending order. Arrays.sort(a,
 * Collections.reverseOrder());
 * 
 * 
 * Parallel Sort: Finally, you use Arrays.parallelSort() to sort the array. This
 * method is useful for large arrays as it may perform better by leveraging
 * multiple threads. This method sorts the array using a parallel sorting
 * algorithm. It's generally faster than Arrays.sort() for large arrays due to
 * the parallelism but may be overkill for small arrays. Arrays.parallelSort(a);
 * 
 * Primitive Types vs. Wrapper Classes: Arrays.sort() can be used directly on
 * primitive types (int[], double[], etc.) but requires wrapper classes like
 * Integer for objects where Collections.reverseOrder() is involved.
 * 
 * Parallel Sort: Best suited for large arrays where performance gains from
 * parallelism outweigh the overhead of managing multiple threads.
 * 
 */