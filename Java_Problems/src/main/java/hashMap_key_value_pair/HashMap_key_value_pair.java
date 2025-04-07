package hashMap_key_value_pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_key_value_pair {
	
	// WAP to find input={100=”java”,101=”hello”,102=”apac”,105=”emea”}, add in hashmap and print map and key separately
	
	 public static void main(String[] args) {
	 // Creating a HashMap
    Map<Integer, String> map = new HashMap<>();
    
    // Adding key-value pairs to the map
    map.put(100, "java");
    map.put(101, "hello");
    map.put(102, "apac");
    map.put(105, "emea");
    
    // Print the whole map
    System.out.println("HashMap: " + map);
    
    // Print the keys separately
    Set<Integer> keys = map.keySet();
    System.out.println("Keys: " + keys);
}
}
