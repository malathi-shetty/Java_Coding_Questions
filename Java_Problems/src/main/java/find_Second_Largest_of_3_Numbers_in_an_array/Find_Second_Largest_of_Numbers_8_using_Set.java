package find_Second_Largest_of_3_Numbers_in_an_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Second_Largest_of_Numbers_8_using_Set {

	public static void main(String[] args) {
		 Integer[] a = { 10, 4, 5, 6, 18 };

	        // Convert the array to a List
	        List<Integer> list = Arrays.asList(a);
	        
	        // Convert the List to a Set to remove duplicates
	        Set<Integer> set = new HashSet<>(list);
	        
	        // Convert the Set back to a List
	        List<Integer> newList = new ArrayList<>(set);
	        
	        // Sort the List in ascending order
	        Collections.sort(newList);
	        
	        // Check if the list has at least 2 elements
	        if (newList.size() < 2) {
	            System.out.println("Not enough unique numbers to find the second largest.");
	        } else {
	            // Print the second largest element
	            System.out.println(newList.get(newList.size() - 2));
	        }

	}

}
