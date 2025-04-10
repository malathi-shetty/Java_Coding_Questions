package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.ArrayList;
import java.util.List;

public class String_CommonAndAdditional_Using_Nested_Loops {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
        list1.add("Lily");
        list1.add("Mogra");
        list1.add("Jasmine");

        List<String> list2 = new ArrayList<>();
        list2.add("Jasmine");
        list2.add("Mogra");
        list2.add("Rose");
        list2.add("Orchid");
        
        List<String> additionalElements = new ArrayList<>();

        // Find elements in list2 that are not in list1
        for (String item2 : list2) {
            boolean found = false;
            for (String item1 : list1) {
                if (item2.equals(item1)) {
                    found = true;
                    break; // Exit inner loop early
                }
            }
            if (!found) {
                additionalElements.add(item2);
            }
        }

        // Print the additional elements
        System.out.println("Additional elements in list2: " + additionalElements);
        
        List<String> commonElements = new ArrayList<>();
        for(String item1 : list1)
        {
        	for(String item2: list2)
        	{
        		if(item1.equals(item2) && !commonElements.contains(item1))
        		{
        			commonElements.add(item1);
        		}
        	}
        }
     // Print common elements
        System.out.println("Common elements: " + commonElements);
	}
}