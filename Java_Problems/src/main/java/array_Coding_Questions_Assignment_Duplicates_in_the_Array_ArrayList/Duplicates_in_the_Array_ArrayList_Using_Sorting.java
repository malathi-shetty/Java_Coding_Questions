package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Duplicates_in_the_Array_ArrayList_Using_Sorting {

	public static void main(String[] args) {
		  int[] array = {1, 2, 3, 4, 5, 1, 2, 6};
	        System.out.println("Array Duplicates: " + Arrays.toString(findDuplicatesInArray(array)));

	        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6));        
	        System.out.println("ArrayList Duplicates: " + findDuplicatesInArrayList(list));
	    }

	    public static int[] findDuplicatesInArray(int[] a) {
	        Arrays.sort(a);
	        HashSet<Integer> duplicates = new HashSet<>();
	        
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] == a[i - 1]) {
	                duplicates.add(a[i]);
	            }
	        }
	        
	        // Convert HashSet to int array
	        int[] result = new int[duplicates.size()];
	        int i = 0;
	        for (Integer num : duplicates) {
	            result[i++] = num;
	        }
	        return result;
	    }

	    public static ArrayList<Integer> findDuplicatesInArrayList(ArrayList<Integer> list) {
	        Collections.sort(list);
	        ArrayList<Integer> duplicates = new ArrayList<>();

	        for (int i = 1; i < list.size(); i++) {
	            if (list.get(i).equals(list.get(i - 1))) {
	                if (!duplicates.contains(list.get(i))) {
	                    duplicates.add(list.get(i));
	                }
	            }
	        }
	        
	        return duplicates;
	}

}
