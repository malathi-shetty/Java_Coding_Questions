package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.HashSet;

public class LEARN_Numbers_Common_Between_three_Arrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 2, 8, 10 };
		int[] c = { 1, 8, 2 };

		// Create a HashSet to store elements from the first array
		HashSet<Integer> newobj = new HashSet<>();
		for (int k : a) {
			newobj.add(k);
		}

		// Create another HashSet to store common elements between 'a' and 'b'
		HashSet<Integer> newobj1 = new HashSet<>();
		for (int j : b) {
			if (newobj.contains(j)) {
				newobj1.add(j);
			}
		}

		// Create another HashSet to store common elements between 'a' and 'c'
		HashSet<Integer> newobj2 = new HashSet<>();
		for (int l : c) {
			if (newobj.contains(l)) {
				newobj2.add(l);
			}
		}

		// Create another HashSet to find common elements in all three arrays
		HashSet<Integer> commonAll = new HashSet<>(newobj1);
		commonAll.retainAll(newobj2);

		System.out.println("Elements in first Array - a: " + newobj);
		System.out.println("Common Elements in both Arrays - a & b: " + newobj1);
		System.out.println("Common Elements in both Arrays - a & c: " + newobj2);
		System.out.println("Common Elements in all three Arrays: " + commonAll);

	}
}

/* Output:
 * 
 * Elements in first Array - a: [1, 2, 3]
 * 
Common Elements in both Arrays - a & b: [2]

Common Elements in both Arrays - a & c: [1, 2]

Common Elements in all three Arrays: [2]


*/
 


/*
 * Add Elements to newobj: The newobj HashSet contains all elements from array a.
 * 
 * Find Common Elements Between a and b: Iterate through array b and add
 * elements to newobj1 if they are in newobj.
 * 
 * Find Common Elements Between a and c: Iterate through array c and add
 * elements to newobj2 if they are in newobj.
 * 
 * Find Common Elements in All Three Arrays:
 * 
 * Start with newobj1 and use retainAll method to keep only elements that are
 * also present in newobj2. This gives you the elements that are common in all
 * three arrays. The output of this code will show the common elements in all
 * three arrays.
 * 
 * For the provided arrays:
 * 
 * a = {1, 2, 3} 
 * 
 * b = {2, 8, 10} 
 * 
 * c = {1, 8, 2}
 *
*/