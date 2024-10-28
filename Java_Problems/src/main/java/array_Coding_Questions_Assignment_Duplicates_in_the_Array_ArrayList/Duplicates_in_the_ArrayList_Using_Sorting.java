package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Duplicates_in_the_ArrayList_Using_Sorting {

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
	        Collections.sort(list);
	        System.out.print("Duplicates: ");

	        for (int i = 1; i < list.size(); i++) {
	            if (list.get(i).equals(list.get(i - 1))) {
	                System.out.print(list.get(i) + " ");
	            }
	        }
	    }

}
