package collections_TreeMap;

import java.util.TreeMap;

public class TreeMapExample_Using_keySet_and_values {

	public static void main(String[] args) {
		 // Create a TreeMap and add some elements
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 40);
        treeMap.put("Banana", 10);
        treeMap.put("Cherry", 20);
        treeMap.put("Date", 30);
		
		// Method 4: Using keySet() and values()
        System.out.println("\nMethod 4: Using keySet() and values()");
        System.out.println("Keys:");
        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }
        
        System.out.println("\nValues:");
        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }

	}

}
