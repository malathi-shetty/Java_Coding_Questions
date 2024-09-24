package arrays_Search_Elements;

import java.util.Arrays;

public class Searching_an_Element_in_Array_Binary_Search_2 {

	public static void main(String[] args) {
		
		// Approach 2 : Arrays.binarySearch()
		
		int a[] = {1,2,3,4,5,6,7,8,9,10}; // Sortable Order
		
		//System.out.println(Arrays.binarySearch(a, 8)); // key: 8 - return index number where location is found
		System.out.println(Arrays.binarySearch(a, 100));
	}
}