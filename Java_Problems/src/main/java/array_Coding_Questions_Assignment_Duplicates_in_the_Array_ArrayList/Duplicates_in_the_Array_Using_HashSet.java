package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.HashSet;

public class Duplicates_in_the_Array_Using_HashSet {

	//Duplicates in the Array
	
	//This method leverages a HashSet to track set elements. If an element is already in the set, it is a duplicate.

	
	public static void main(String[] args) {
		  int[] a = {1, 2, 3, 4, 5, 1, 2, 6};

	        findDuplicates(a);

	}

	public static void findDuplicates(int[] a) {
		HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : a) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
		
	}

}
