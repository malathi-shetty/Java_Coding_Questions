package collections_TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample_Using_Iterator_with_EntrySet {

	public static void main(String[] args) {
		 // Create a TreeMap and add some elements
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 40);
        treeMap.put("Banana", 10);
        treeMap.put("Cherry", 20);
        treeMap.put("Date", 30);
        
     // Method 3: Using Iterator with entrySet()
     /*   System.out.println("\nMethod 3: Using Iterator with entrySet()");
        var iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
     */   
        
        // Method 3: Using Iterator with entrySet()
        System.out.println("\nMethod 3: Using Iterator with entrySet()");
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

	}

}


/*
 * 
 * Java 10 and later: var is supported and can be used for local variable type inference.
 * 
 * Java 9 and earlier: var is not supported, so explicit type declarations should be used
 * 
 * Explicit Typing for Iterator:
Instead of using var, explicitly declare iterator as Iterator<Map.Entry<String, Integer>>.



In Java versions before Java 10, you should use explicit types for local variables. If you are using Java 10 or later, the original code using var would work fine. Make sure your development environment or build system is using a compatible Java version if you want to use the var keyword.
 */
