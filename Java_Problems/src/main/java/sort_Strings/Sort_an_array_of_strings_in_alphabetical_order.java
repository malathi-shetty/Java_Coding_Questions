package sort_Strings;

import java.util.Arrays;

public class Sort_an_array_of_strings_in_alphabetical_order {

	public static void main(String[] args) {
		// String a[] ={"priyanka","jugal","training"}; o/p: as per alphabetical order

		String a[] = { "priyanka", "jugal", "training" };

		// Sort the array in alphabetical order
		Arrays.sort(a);

		// Print the sorted array
		for (String s : a) {
			System.out.println(s);
		}
	}
}

/*
 * 
 * use the Arrays.sort() method from the java.util.Arrays package
 * 
 * The Arrays.sort(a) method sorts the array a in place.
 * 
 * The for loop iterates through the sorted array and prints each string.
 */