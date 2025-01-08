package array_Coding_Questions_Assignment_Reverse_ArrayList_having_strings;

import java.util.ArrayList;

public class Reverse_ArrayList_having_strings_using_for_loop {

	public static void main(String[] args) {
		 // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Print the ArrayList elements in reverse order
        System.out.print("ArrayList in reverse order: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");  // Print each element from last to first
        }

	}

}


/*

To print the elements of an ArrayList in reverse order in Java, you can use a similar approach to that used for arrays. However, since ArrayList provides more flexibility than arrays, such as dynamic resizing and built-in methods, we can still use a for loop or an Iterator to loop through it in reverse order.


Explanation:

ArrayList Initialization: We create an ArrayList of strings and add some example elements to it.

Reverse Iteration: We use a for loop to iterate over the ArrayList starting from the last element (list.size() - 1) and decrementing the index down to 0.

Print Elements: Inside the loop, we use the list.get(i) method to retrieve and print the elements in reverse order.

Output:

For the ArrayList {"Apple", "Banana", "Cherry", "Date", "Elderberry"}, the output will be:

ArrayList in reverse order: Elderberry Date Cherry Banana Apple 

*/