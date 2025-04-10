package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LEARN_Numbers_Common_in_both_the_Arrays_retainAll {

	// by using ArrayList with retainAll method
	
	public static void main(String[] args) {
		Integer[] a1 = { 4, 2, 3, 1, 6 }; 
		Integer[] a2 = { 6, 7, 8, 4 };
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(a1)); 
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(a2)); 
		list1.retainAll(list2); 
		System.out.println("Common Elements:" + list1);

	}

}
