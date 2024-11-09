package find_duplicates_Numbers_and_Strings_In_An_Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_Duplicates_in_an_Object_Array_Numbers_and_Strings_learn {

	public static void main(String[] args) {
		// given int[] a ={1,2,,2,a,a};
		/*
		 * How can we find the duplicates from the given array first of all you cannot
		 * store in the array you have to store in a object. object [] a ={1,2,a,a,a};
		 * HashSet<Object> neowbj = new HashSet();
		 */
		Object[] a = { 1, 2, 2, "a", "a", "a" };

		HashSet<Object> set = new HashSet<>();
		List<Object> dup = new ArrayList<>();

		for (Object obj : a) {
			// If the object has been seen, add to duplicates
			if (!set.add(obj)) {
				// Only add to duplicates if it's not already there
				if (!dup.contains(obj)) {
					dup.add(obj);
				}
			}
		}

		// Print duplicates
		System.out.println("Duplicates: " + dup);
	}

}

/*
 * 
 * To find duplicates in an array while storing the values in a HashSet<Object>,
 * you can follow these steps:
 * 
 * Iterate through the array.
 * 
 * For each element, check if it's already in the HashSet.
 * 
 * If it is, add it to a separate collection of duplicates.
 * 
 * If it isn't, add it to the HashSet.
 * 
 * We use a HashSet<Object> named seen to track which objects we have already encountered.
 * 
 * 
 * The add method of HashSet returns false if the item was already present. We
 * use this to check for duplicates.
 * 
 * We maintain a separate List<Object> for duplicates to store any duplicates we
 * find, ensuring that each duplicate is only added once.
 * 
 * Output:
 * 
 * This code will print:
 * 
 * Duplicates: [2, a]
 * 
 * This approach ensures that only storing unique duplicates in the duplicates
 * list, and it efficiently uses the HashSet for fast lookups.
 * 
 * 
 * 
 */
