package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Duplicates_in_the_ArrayList_Using_HashSet_learn {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(1);
	        list.add(2);
	        list.add(6);

	        findDuplicates(list);
	    }

	    public static void findDuplicates(ArrayList<Integer> list) {
	        HashSet<Integer> set = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (int num : list) {
	            if (!set.add(num)) {
	                duplicates.add(num);
	            }
	        }

	        System.out.println("Duplicates: " + duplicates);
	    }
}
