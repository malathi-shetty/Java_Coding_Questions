package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.HashSet;

public class LEARN_Common_Single_Number_In_An_Array {

	public static void main(String[] args) {
		 int[] a = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8};

	        HashSet<Integer> set = new HashSet<>();
	        HashSet<Integer> common = new HashSet<>();
	        
	       // to preserve the order of first appearance 
	     //   LinkedHashSet<Integer> set = new LinkedHashSet<>();
	     //   LinkedHashSet<Integer> common = new LinkedHashSet<>();

	        for (int num : a) {
	            if (!set.add(num)) {
	                common.add(num); // If it's already in 'seen', it's a common/repeated value
	            }
	        }

	        System.out.println("Common elements in the array: " + common);

	}

}
//Common elements in the array: [3, 5, 7]

/*

set.add(num) returns false if num is already in the set.

That means it has already occurred once — so it’s common now.

common.add(num) stores that value as a common one.

*/