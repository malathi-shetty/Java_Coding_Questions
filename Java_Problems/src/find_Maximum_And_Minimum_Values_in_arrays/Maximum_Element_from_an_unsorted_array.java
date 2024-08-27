package find_Maximum_And_Minimum_Values_in_arrays;

public class Maximum_Element_from_an_unsorted_array {

	public static void main(String[] args) {
		
		int []a = {1,455,45,678,98,67};
		int max = Integer.MIN_VALUE;
		for(int element:a)
		{
			if(element > max)
			{
				max =element;
			}
		}
		System.out.println("Max Element is: " + max);
	}

}

/*
	// Find max element from unsorted array
		
		int[] arr= {1,45,67,698,455,78};   // Define an unsorted array
		
		// Initialize a variable to hold the maximum value found
		int max = Integer.MIN_VALUE; // Initially set to the smallest possible integer value
		
		 // Iterate through each element in the array
		for(int element: arr)
		{
			
			 // Check if the current element is greater than the current max value
			if(element > max)
			{
				max = element;  // If true, update the max value to the current element
			}
		}
		
		System.out.println("The maximum number in the array is: " + max); // Print the maximum value found in the array

*/