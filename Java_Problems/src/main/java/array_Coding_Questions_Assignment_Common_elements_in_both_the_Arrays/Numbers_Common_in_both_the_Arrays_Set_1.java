package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Numbers_Common_in_both_the_Arrays_Set_1 {

	public static void main(String[] args) {
		 int[] a = {1, 2, 3, 4, 8,9,9};
	        int[] b = {2, 8, 10, 4, 9, 8};

	        // Use a set to store elements of the first array
	        Set<Integer> newobj = new HashSet<>();
	        for (int value : a) {
	        	newobj.add(value);
	        }

	        // Use another set to store common elements
	        Set<Integer> commonElements = new HashSet<>();
	        for (int value : b) {
	            if (newobj.contains(value)) {
	                commonElements.add(value);
	            }
	        }

	        // Print the common elements
	        System.out.print("Common elements: ");
	        if (commonElements.isEmpty()) {
	            System.out.println("No common elements found.");
	        } else {
	            for (int common : commonElements) {
	                System.out.print(common + " ");
	            }
	            System.out.println();
	        }

	}

}
