package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class String_CommonAndAdditional_Using_Streams {

	//JDK issues
	
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

		// Convert lists to sets
		Set<String> set1 = new HashSet<>(list1);
		Set<String> set2 = new HashSet<>(list2);

		// Find additional elements using streams
		Set<String> additionalElements = set2.stream()
			    .filter(element -> !set1.contains(element))
			    .collect(Collectors.toSet());


		// Print the additional elements
		System.out.println("Additional elements in list2: " + additionalElements);

		// Find common elements using streams
		Set<String> commonElements = set1.stream().filter(set2::contains).collect(Collectors.toSet());

		// Print common elements
		System.out.println("Common elements: " + commonElements);
	}

}


/*
Additional elements in list2: [Egg, Drum]
Common elements: [Ball, Cake]
*/