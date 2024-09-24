package remove_duplicate_Numbers_from_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_duplicate_Numbers_from_ArrayList_1_Using_LinkedHashSet {

	public static void main(String[] args) {

		// Approach 1: LinkedHashSet

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 4, 6, 7, 2, 3, 5, 4, 3, 8, 2, 8));
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(set);
		System.out.println(numbersListWithoutDuplicate);

	}

}
