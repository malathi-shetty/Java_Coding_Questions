package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LEARN_String_Common_Between_two_List_retainAll {

	public static void main(String[] args) {
		 List<String> list1 = Arrays.asList("Java", "Python", "C++", "Go");
	        List<String> list2 = Arrays.asList("C++", "Go", "Rust");

	        Set<String> set1 = new HashSet<>(list1);
	        Set<String> set2 = new HashSet<>(list2);

	        set1.retainAll(set2);

	        System.out.println("Common Strings: " + set1);

	}

}
