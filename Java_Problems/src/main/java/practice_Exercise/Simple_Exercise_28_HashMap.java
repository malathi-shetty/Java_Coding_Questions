package practice_Exercise;

import java.util.HashMap;
import java.util.Map;

public class Simple_Exercise_28_HashMap {

	public static void main(String[] args) {
	/*	Map<String, String> map = new HashMap<>();
	 * 
		 map.put("A", "Apple");
		 
		 map.put("B", "Boy");
		 
		 map.put("C", "Cat");
		 
		 map.replace("C", "Element");
		 
		 map.remove("A","Apple");
		 
		 System.out.println(map);
	*/	 
		 
		 Map<String, String> map = new HashMap<>();
	        
	        // Adding elements to the map
	        map.put("A", "Apple");
	        map.put("B", "Boy");
	        map.put("C", "Cat");
	        
	        // Replacing the value for key "C"
	   //     map.replace("C", "Element");
	        // Check if the key "C" exists and update its value
	        if (map.containsKey("C")) {
	            map.put("C", "Element"); // Update the value
	        }
	        
	        // Removing the entry with key "A"
	        map.remove("A"); // No second argument, just remove by key
	        
	        // Print the current state of the map
	        System.out.println(map); // Output will be {B=Boy, C=Element}

	}

}
