package array_Coding_Questions_Assignment_Reverse_Array_and_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_elements_Array_using_Collections_reverse {

	public static void main(String[] args) {
		  // Create an ArrayList of numbers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(35);
        list.add(85);
        list.add(10);
        list.add(34);
        list.add(1);

        // Reverse the ArrayList using Collections.reverse()
        Collections.reverse(list);

        // Print the ArrayList elements in reverse order
        System.out.print("ArrayList in reverse order: ");
        for (Integer num : list) {
            System.out.print(num + " ");  // Print each element in the reversed list
        }

	}

}
/*

Reverse with Collections.reverse(): We use the Collections.reverse() method to reverse the order of the elements in the ArrayList directly.

Print Reversed Elements: After reversing, we print the elements using a for-each loop.

*/