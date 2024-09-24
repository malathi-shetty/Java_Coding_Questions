package find_3rd_highest;

import java.util.Arrays;

public class sortArray_and_Find_3rd_highest_2 {

	public static void main(String[] args) {
		int array[] = { 10, 5, 20, 63, 12, 57, 88, 60 };
		int size = array.length;
		System.out.println(size);
		
		// sort array using the Arrays.sort method
		Arrays.sort(array);
		System.out.println("sorted array- " + Arrays.toString(array));
		int thirdMaxNum = array[size - 3];
		System.out.println("Third highest array- " + thirdMaxNum);

	}

}
