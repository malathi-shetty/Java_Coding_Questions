package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LEARN_String_CommonAndAdditional_Using_Set {

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

        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        // Common Elements
        Set<String> common = new HashSet<>(set1);
        common.retainAll(set2);

        // Additional Elements in list2 (not in list1)
        Set<String> additional = new HashSet<>(set2);
        additional.removeAll(set1);

        System.out.println("✅ Common Elements: " + common);
        System.out.println("➕ Additional Elements in list2: " + additional);

	}

}

/*
 * ✅ Common Elements: [Cake, Ball]
➕ Additional Elements in list2: [Egg, Drum]

*/

/*
 * 
 * Convert Lists to Sets:

Set<String> set1 = new HashSet<>(list1);

Set<String> set2 = new HashSet<>(list2);

This ensures that duplicate elements in each list are removed, and we can use efficient Set operations.

Find Common Elements:

common.retainAll(set2);

This keeps only the elements that are present in both sets (set1 and set2), i.e., the common elements.

Find Additional Elements in list2:

additional.removeAll(set1);

This removes all elements from set2 that are also in set1, leaving only the additional elements in list2.

Print Results:

System.out.println("✅ Common Elements: " + common);

System.out.println("➕ Additional Elements in list2: " + additional);

*/
