package mergeArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays_ArrayList {

	public static void main(String[] args) {
		// Define the two input arrays
        int[] arr1 = {5, 3, 2};
        int[] arr2 = {9, 0, 1};

        // Call the mergeArrays method and store the result
        int[] mergedArray = mergeArrays(arr1, arr2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Create an ArrayList to store the merged elements
        ArrayList<Integer> mergedList = new ArrayList<>();

        // Add elements of arr1 to the ArrayList
        for (int num : arr1) {
            mergedList.add(num);
        }

        // Add elements of arr2 to the ArrayList
        for (int num : arr2) {
            mergedList.add(num);
        }

        // Convert the ArrayList back to an array
        int[] mergedArray = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            mergedArray[i] = mergedList.get(i);
        }

        // Return the merged array
        return mergedArray;
	}

}

//This approach gives you more flexibility with the ArrayList, especially if you plan to add more elements dynamically. 