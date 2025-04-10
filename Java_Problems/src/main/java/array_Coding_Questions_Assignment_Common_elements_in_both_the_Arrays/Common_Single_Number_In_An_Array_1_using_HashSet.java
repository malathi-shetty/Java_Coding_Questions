package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.HashSet;

public class Common_Single_Number_In_An_Array_1_using_HashSet {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 3, 4, 5, 5 };
		// int[] a = { 1, 2, 3, 3, 4, 5, 5, 6, 7,7,7,8 };
		HashSet newobj = new HashSet();

		for (int i = 0; i < a.length; i++) {
			if (newobj.add(a[i]) == false) // duplicate not able to add
			{
				System.out.println(newobj); // newobj will be unque

				// System.out.print("Common - Only Duplicates: " );
				// System.out.println( a[i]);
			}

		}

	}

}

/*
 * "Seen Set: Printing Duplicates Shows Unique Progress"
 * 
 * Seen: Remember that HashSet tracks seen elements.
 * 
 * Printing: Print when a duplicate is detected.
 * 
 * Duplicates: Only duplicates trigger the print.
 * 
 * Shows: The shown set is always unique up to the current point.
 * 
 * printing the HashSet at the moment when a duplicate is found, showing the
 * set’s unique contents up to that point.
 * 
 * 
 * int[] a = { 1, 2, 3, 3, 4, 5, 5, 6, 7,7,7,8 }; The println(newobj) statement
 * is only executed for elements that are duplicates. Since 8 is not a duplicate
 * when it is encountered (it has not been seen before), the code inside the if
 * block does not run, and thus 8 does not trigger a print.
 * 
 * 
 */