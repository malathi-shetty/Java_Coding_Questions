package reverse_A_String_Different_Ways;

import java.util.ArrayList;
import java.util.List;

public class Reverse_a_list_without_using_in_built_methods_1 {

	public static void main(String[] args) {
		// write a program to reverse a list without using in built methods

		// Create and initialize the list
        List<Integer> newobj = new ArrayList<>();
        newobj.add(1);
        newobj.add(2);
        newobj.add(3);
        newobj.add(4);
        newobj.add(5);

        // Reverse the list
        List<Integer> reversedList = reverseList(newobj);

        // Print the reversed list
        System.out.println("Reversed List: " + reversedList);
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> rev = new ArrayList<>();

        // Manually reverse the list
        for (int i = list.size() - 1; i >= 0; i--) {
        	rev.add(list.get(i));
        }

        return rev;
	}

}
