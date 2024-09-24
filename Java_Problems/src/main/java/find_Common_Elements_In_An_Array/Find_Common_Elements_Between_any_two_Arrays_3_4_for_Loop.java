package find_Common_Elements_In_An_Array;

import java.util.ArrayList;
import java.util.List;

public class Find_Common_Elements_Between_any_two_Arrays_3_4_for_Loop {

	public static void main(String[] args) {
		// By using the for loop
		Integer[] a1 = { 4, 2, 3, 1, 6 };
		Integer[] a2 = { 6, 7, 8, 4 };
		List<Integer> commonElements = new ArrayList<>();
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					commonElements.add(a1[i]);
				}
			}
		}
		System.out.println("Common Elements for given two array List is:" + commonElements);

	}

}
