package collections_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample_Using_forEach_method_and_lambdaExpression {

	public static void main(String[] args) {
		 // Create a TreeMap and add some elements
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 40);
        treeMap.put("Banana", 10);
        treeMap.put("Cherry", 20);
        treeMap.put("Date", 30);
        
        // Method 2: Using forEach() method and lambda expression (Java 8+)
        System.out.println("\nMethod 2: Using forEach() method and lambda expression");
        treeMap.forEach((key, value) -> System.out.println(key + " = " + value));

	}

}
