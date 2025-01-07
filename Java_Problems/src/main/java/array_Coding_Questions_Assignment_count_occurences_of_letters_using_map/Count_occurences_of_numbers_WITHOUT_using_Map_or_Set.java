package array_Coding_Questions_Assignment_count_occurences_of_letters_using_map;

public class Count_occurences_of_numbers_WITHOUT_using_Map_or_Set {

	public static void main(String[] args) {
		int[] num = { 1, 2, 2, 7, 3, 1, 4, 3, 1, 2 };

		// Iterate through each element in the numbers array
		for (int i = 0; i < num.length; i++) {
			int count = 1; // Initialize count for the current element

			// Check if the element is already counted
			if (num[i] != Integer.MIN_VALUE) { // This element is not counted yet
				// Count the frequency of the current element
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] == num[j]) {
						count++; // Increase count for duplicate
						num[j] = Integer.MIN_VALUE; // Mark as visited
					}
				}
				// Print the element and its frequency
				System.out.println("Element: " + num[i] + " - Frequency: " + count);
			}
		}

	}

}

/*
 * 
 * Integer.MIN_VALUE: This is used as a marker to ensure that already counted
 * elements are not processed again.
 * 
 * We loop through each element and count its occurrences by checking the rest
 * of the array.
 * 
 * If we find the element more than once, we mark those elements as visited by
 * setting them to Integer.MIN_VALUE.
 * 
 */