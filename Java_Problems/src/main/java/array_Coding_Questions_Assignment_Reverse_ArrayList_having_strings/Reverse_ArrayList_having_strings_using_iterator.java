package array_Coding_Questions_Assignment_Reverse_ArrayList_having_strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Reverse_ArrayList_having_strings_using_iterator {

	public static void main(String[] args) {
		 // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Reverse the ArrayList using Collections.reverse
        Collections.reverse(list);

        // Print the ArrayList elements in reverse order
        System.out.print("ArrayList in reverse order: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

	}

}


/*

use an Iterator to traverse the ArrayList in reverse order by first converting it to a list or using a ListIterator.

Reverse with Collections.reverse(): We use the Collections.reverse() method to reverse the order of the elements in the ArrayList. This method modifies the original list.

Iterator: We then use an Iterator to traverse through the reversed ArrayList and print each element.

Output:

For the ArrayList {"Apple", "Banana", "Cherry", "Date", "Elderberry"}, the output will be:

ArrayList in reverse order: Elderberry Date Cherry Banana Apple 

*/