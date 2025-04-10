package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.*;
public class Common_Numbers_in_both_the_Arrays_using_retainAll {

	public static void main(String[] args) {
		 List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
	        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

	        Set<Integer> set1 = new HashSet<>(list1);
	        Set<Integer> set2 = new HashSet<>(list2);

	        set1.retainAll(set2);

	        System.out.println("Common Integers: " + set1);

	}

}

//Common Integers: [4, 5]
