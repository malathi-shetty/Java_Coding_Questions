package practice_Exercise;

public class Max_Number_From_Unsorted_Array {

	public static void main(String[] args) {
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

	}

}
