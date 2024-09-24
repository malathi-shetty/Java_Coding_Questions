package find_first_and_last_element_of_ArrayList;

import java.util.ArrayList;

public class Find_first_and_last_element_without_ArrayList {

	public static void main(String[] args) {
		
		  int[] a = { 4, 2, 3, 1, 6 };

	        // Find first element
	        int first = a[0]; // First Element
	        System.out.println("First Element: " + first);

	        // Find last element
	        int last = a[a.length - 1]; // Last Element
	        System.out.println("Last Element: " + last);
	    }
	}
