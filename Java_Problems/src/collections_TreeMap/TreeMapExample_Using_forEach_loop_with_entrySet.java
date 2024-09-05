package collections_TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample_Using_forEach_loop_with_entrySet {

	public static void main(String[] args) {
		  // Create a TreeMap and add some elements
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 40);
        treeMap.put("Banana", 10);
        treeMap.put("Cherry", 20);
        treeMap.put("Date", 30);
        
        // Print all TreeMap elements using different methods
        
        // Method 1: Using for-each loop with entrySet()
        System.out.println("Method 1: Using for-each loop with entrySet()");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
       

	}

}


/*

Using for-each loop with entrySet():

This method iterates over the entrySet of the TreeMap, where each entry is a Map.Entry object containing both key and value.

Using forEach() with Lambda Expression (Java 8+):

This method uses the forEach method introduced in Java 8, which accepts a lambda expression to process each entry.

Using Iterator with entrySet():

This method utilizes an Iterator to traverse through the entrySet of the TreeMap.

Using keySet() and values():

This method prints keys and values separately. keySet() returns a set view of the keys, and values() returns a collection view of the values.

Output:
The output will show the TreeMap elements sorted by keys, as TreeMap maintains a natural ordering of keys.


*/