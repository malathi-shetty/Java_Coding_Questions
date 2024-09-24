package find_Common_Elements_In_An_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_Common_Elements_Between_any_two_Arrays_3_5_ArrayList_with_retainAll_method {

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
