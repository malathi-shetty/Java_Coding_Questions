package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.ArrayList;
import java.util.List;

public class LEARN_Common_Numbers_in_both_the_Arrays_Loop {

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
