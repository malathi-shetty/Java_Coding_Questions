package reverse_A_String_Different_Ways;

import java.util.ArrayList;
import java.util.List;

public class Reverse_a_list_without_using_in_built_methods_3 {

	public static void main(String[] args) {
		 // Create and initialize the original list of strings
        List<String> newobj = new ArrayList<>();
        newobj.add("Apple");
        newobj.add("Banana");
        newobj.add("Chickoo");
        newobj.add("Dragon Fruit");
        newobj.add("Grapes");

        // Create a new list to hold the reversed elements
        List<String> reversedList = new ArrayList<>();

        // Manually reverse the list
        for (int i = newobj.size() - 1; i >= 0; i--) {
            reversedList.add(newobj.get(i)); // Add elements in reverse order
        }

        // Print the reversed list
        System.out.println("Reversed List: " + reversedList);

	}

}
