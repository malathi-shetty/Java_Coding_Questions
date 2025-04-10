package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.*;
import java.util.stream.Collectors;


public class LEARN_Common_String_Between_two_List_Stream {

	
	//NOT SUPPORTED JDK - else correct code
	public static void main(String[] args) {
		 String[] a3 = { "Java", "JavaScript", "C", "C++" }; 
	        String[] a4 = { "Python", "C#", "Java", "C++" }; 

	        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(a3)); 
	        ArrayList<String> list4 = new ArrayList<>(Arrays.asList(a4)); 

	        // Convert list4 to a set for faster lookup
	        Set<String> set4 = new HashSet<>(list4);

	        // Use stream and filter with set.contains() for better performance
	        List<String> commonElements = list3.stream()
	                                           .filter(set4::contains)
	                                           .collect(Collectors.toList());

	        System.out.println("Common elements: " + commonElements);

	}

}
//Common elements: [Java, C++]
