package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String_Common_Between_two_List_retainAll2 {

	public static void main(String[] args) {
		 List<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("Ball");
	        list1.add("Cake");

	        List<String> list2 = new ArrayList<>();
	        list2.add("Drum");
	        list2.add("Ball");
	        list2.add("Cake");
	        list2.add("Egg");

	        Set<String> set1 = new HashSet<>(list1);  // Convert list1 to a set
	        Set<String> set2 = new HashSet<>(list2);  // Convert list2 to a set

	        // Find common elements
	        Set<String> commonElements = new HashSet<>(set1);
	        commonElements.retainAll(set2);  // Retain only elements that are in both sets

	        // Print common elements
	        System.out.println("✅ Common Elements: " + commonElements);

	}

}

// ✅ Common Elements: [Ball, Cake]
