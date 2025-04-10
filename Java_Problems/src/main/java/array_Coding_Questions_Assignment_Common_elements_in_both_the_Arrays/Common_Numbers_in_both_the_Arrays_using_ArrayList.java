package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Common_Numbers_in_both_the_Arrays_using_ArrayList {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 8, 9, 8 }; // duplicate value is not supported
		int[] b = { 2, 8, 3, 9 };

		// Use a Set to collect unique common elements
		Set<Integer> uniqueList = new HashSet<>();

		// Find common elements
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i] == b[j]) 
				{
					uniqueList.add(a[i]);
				}
			}
		}

		// Convert Set to ArrayList for printing
		ArrayList<Integer> uniqueCommonElements = new ArrayList<>(uniqueList);

		System.out.println("Unique common elements: " + uniqueCommonElements);
		// System.out.println(unique);
	}
}
