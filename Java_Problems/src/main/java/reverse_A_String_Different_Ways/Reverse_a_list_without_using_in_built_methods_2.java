package reverse_A_String_Different_Ways;

import java.util.ArrayList;
import java.util.List;

public class Reverse_a_list_without_using_in_built_methods_2 {

	public static void main(String[] args) {
		// write a program to reverse a list without using in built methods
		
		// Create and initialize the original list
        List<Integer> newobj = new ArrayList<>();
        newobj.add(1);
        newobj.add(2);
        newobj.add(3);
        newobj.add(4);
        newobj.add(5);

        // Create a new list to hold the reversed elements
        List<Integer> reversedList = new ArrayList<>();

        // Manually reverse the list
        for (int i = newobj.size() - 1; i >= 0; i--) {
            reversedList.add(newobj.get(i));
        }

        // Print the reversed list
        System.out.println("Reversed List: " + reversedList);
	}

}
