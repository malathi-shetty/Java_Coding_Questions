package find_additional_element_in_list_while_comparing_2_List;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class Find_additional_element_in_list_while_comparing_2_List_3_Using_Apache_Commons_Collections {

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

        // Find additional elements in list2 that are not in list1
        List<String> additionalElements = new ArrayList<>(CollectionUtils.subtract(list2, list1));

     // Print the additional elements
        System.out.println("Additional elements in list2: " + additionalElements);
        
        // Find common elements using CollectionUtils
        List<String> commonElements = new ArrayList<>(CollectionUtils.intersection(list1, list2));

        // Print common elements
        System.out.println("Common elements: " + commonElements);
	}

}

/**
 * Download Apache Commons Collections
 * https://commons.apache.org/proper/commons-collections/download_collections.cgi
 */
