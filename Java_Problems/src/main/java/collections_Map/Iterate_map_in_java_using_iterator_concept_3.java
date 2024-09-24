package collections_Map;

import java.util.HashMap;
import java.util.Map;

public class Iterate_map_in_java_using_iterator_concept_3 {

	public static void main(String[] args) {
		// Iterating over keys or values using keySet() and value() Methods

		 Map<Integer, String> map = new HashMap<>();
		 
		   map.put(101, " John");
		   map.put(202, " Ricky");
		   map.put(303, " Deep");
		   map.put(404, " Mark");
		   map.put(505, " Maya");
		     
		// Iterating over keys of a map using keySet() method. 
		   for (Integer rollNo : map.keySet()) 
		   System.out.println("Roll No: " + rollNo);   
		   System.out.println();   
			 
		// Iterating over values of a map using values() method.  
		   for (String name : map.values()) 
		   System.out.println("Name: " + name); 
	}

}
