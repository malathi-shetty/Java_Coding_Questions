package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.HashSet;

public class Numbers_Common_Between_three_Arrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 2, 8, 10 };
		int[] c = { 1, 8, 2 };

		 // Create a HashSet to store elements from the first array
			HashSet newobj = new HashSet();

			 // Add elements of array 'a' to newobj
			for (Integer k : a) {
				newobj.add(k);
			}

			 // Create another HashSet to store common elements between 'a' and 'b'
			HashSet newobj1 = new HashSet();

			// Check for common elements between 'a' and 'b'
			for (Integer j : b) 
			{
				if(newobj.contains(j))// return true or false, if condition is true or false
				{
				newobj1.add(j);
				}
			}
			
			// Create another HashSet to store common elements between 'a' and 'c'
			HashSet newobj2 = new HashSet();

			// Check for common elements between 'a' and 'c'
			for (Integer l : c) 
			{
				if(newobj.contains(l))// return true or false, if condition is true or false
				{
				newobj2.add(l);
				}
			}

			System.out.println("Elements in first Array - a: " + newobj);
			System.out.println("Common Elements in both Arrays - a & b: " + newobj1);
			System.out.println("Common Elements in both Arrays - a & c: " + newobj2);
		}

	}


/*
 * Create HashSets and Populate Them:

newobj stores elements from array a.
newobj1 finds common elements between a and b.
newobj2 finds common elements between a and c.
Print Results:

The elements in newobj represent all elements from the first array.
The elements in newobj1 represent common elements between arrays a and b.
The elements in newobj2 represent common elements between arrays a and c.
 *
*/