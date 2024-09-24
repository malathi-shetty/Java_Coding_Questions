package find_first_and_last_element_of_ArrayList;

import java.util.ArrayList;

public class Find_first_and_last_element_with_ArrayList {

	public static void main(String[] args) {
		// Create an ArrayList and add some elements
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(6);

		// Find first element
		int first = list.get(0); // First Element
		System.out.println("First Element: " + first);

		// Find last element
		int last = list.get(list.size() - 1); // Last Element
		System.out.println("Last Element: " + last);

	}

}

/*
 * 
 * ArrayList Creation: We create an ArrayList and add some integers to it.
 * 
 * Finding the First Element: We use list.get(0) to retrieve the first element.
 * 
 * Finding the Last Element: We use list.get(list.size() - 1) to retrieve the
 * last element, where list.size() gives the total number of elements in the list.
 *
 * 
 */