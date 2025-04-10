package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String_CommonAndAdditional_Using_List_and_Set {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		List<String> list2 = new ArrayList<>();
		list2.add("D");
		list2.add("B");
		list2.add("C");
		list2.add("E");
		
		 // Convert lists to sets
		Set<String> set1 = new HashSet<>(list1);
		Set<String> set2 = new HashSet<>(list2);
		
		// Find additional elements in set2 that are not in set1
		Set<String> additionalElements = new HashSet<>(set2);
		additionalElements.removeAll(set1);
		
		// Print the additional elements
        System.out.println("Additional elements in list2: " + additionalElements);
        
        System.out.println();
        // Find common elements
        Set<String> CommonElements = new HashSet<>(set1);
        CommonElements.retainAll(set2);
        
        // Print common elements
        System.out.println("Common elements in lists: " + CommonElements);
		
		
	}

}
