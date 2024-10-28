package array_Coding_Questions_Assignment_Reverse_Array_and_ArrayList;

public class Reverse_Array {

	public static void main(String[] args) {
		// Reverse_Array
		
		
		 // Sample array
        int[] a = {3, 5, 1, 8, 2, -4, 7};

        // Print original array
        System.out.print("Original Array: ");
        printArray(a);
        
        // Reverse the array
        reverseArray(a);
        
        // Print reversed array
        System.out.print("Reversed Array: ");
        printArray(a);
    }

    // Method to reverse an array
    public static void reverseArray(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            // Swap elements
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    // Method to print the array
    public static void printArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for better formatting
	}

}
