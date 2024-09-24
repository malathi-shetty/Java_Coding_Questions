package find_3rd_highest;

import java.util.Arrays;

public class sortArray_and_Find_3rd_highest_1_without_using_inbuilt_method {

	public static void main(String[] args) {
		int temp, size;
		int array[] = { 10, 5, 20, 63, 12, 57, 88, 60 };
		size = array.length;
		System.out.println(size);
		
		// Sort the array using a simple bubble sort
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Array sorted: " );
		for (int i = 0; i < array.length; i++) {
			
			System.out.println( array[i]);
		} 
		
		// Print 3rd Largest number from an Array 
		System.out.println("Third largest number is:: " + array[size - 3]);
			
			
			

	}

}
