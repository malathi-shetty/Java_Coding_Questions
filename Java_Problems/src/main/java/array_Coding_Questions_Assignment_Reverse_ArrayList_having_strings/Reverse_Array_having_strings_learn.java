package array_Coding_Questions_Assignment_Reverse_ArrayList_having_strings;

public class Reverse_Array_having_strings_learn {
	 public static void main(String[] args) {
	        String[] arr = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};  // Example string array
	        System.out.print("Original Array: ");
	        for (String fruit : arr) {
				System.out.print(fruit + " ");
			}
			System.out.println(); // New line for better formatting
	       
	        
	        // Print the elements in reverse order
	        System.out.print("String array in reverse order: ");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");  // Print each string starting from the last
	        }
	    }
}

/*

Array Initialization: We define a string array arr with some example string values.

Loop in Reverse: We use a for loop to iterate through the array starting from the last index (arr.length - 1) and moving to the first index (0).

Print Elements: Inside the loop, each string from the array is printed starting from the last element and proceeding backwards.

Output:

For the input array {"Apple", "Banana", "Cherry", "Date", "Elderberry"}, the output will be:

String array in reverse order: Elderberry Date Cherry Banana Apple 

*/