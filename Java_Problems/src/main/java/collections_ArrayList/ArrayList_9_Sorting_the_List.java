package collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList_9_Sorting_the_List {

	public static void main(String[] args) {
		List<String> newobj = new ArrayList<>();
        newobj.add("java");
        newobj.add("Class");
        newobj.add("testing");
        newobj.add("Training");
        newobj.add("hello");

        
     // Sorting using Collections.sort()
        Collections.sort(newobj, String.CASE_INSENSITIVE_ORDER); // Sort the elements by alphabetic order
        System.out.println(newobj);

        System.out.println(" ");

        // Sort in natural order
        Collections.sort(newobj); // Sorts in natural order
        System.out.println(newobj); // This will sort strings alphabetically
	}

}
