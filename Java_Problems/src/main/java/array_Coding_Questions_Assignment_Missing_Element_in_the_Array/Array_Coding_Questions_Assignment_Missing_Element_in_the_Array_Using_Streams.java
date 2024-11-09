package array_Coding_Questions_Assignment_Missing_Element_in_the_Array;

import java.util.Arrays;

public class Array_Coding_Questions_Assignment_Missing_Element_in_the_Array_Using_Streams {

	public static void main(String[] args) {
		 int[] array = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		 
		 // JDK version problem
	/*	    
		    int actualSum = Arrays.stream(array).sum();
		    int maxNumber = Arrays.stream(array).max().orElse(0);
		    int expectedSum = maxNumber * (maxNumber + 1) / 2;

		    System.out.println("Missing number: " + (expectedSum - actualSum));
		    
		    */
	}

}
