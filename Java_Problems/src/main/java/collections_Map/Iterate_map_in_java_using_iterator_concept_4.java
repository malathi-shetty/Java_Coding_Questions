package collections_Map;

import java.util.HashMap;
import java.util.Map;

public class Iterate_map_in_java_using_iterator_concept_4 {

	public static void main(String[] args) {
		// Iterating Map using Map.Entry<K,V> Method
		
		Map<Integer, String> map = new HashMap<>();
		 
		   map.put(101, " John");
		   map.put(202, " Ricky");
		   map.put(303, " Deep");
		   map.put(404, " Mark");
		   map.put(505, " Maya");
		      
		// Iterating over entries of a map using entrySet() method.
		   for (Map.Entry<Integer,String> entry : map.entrySet())  
		   {  
		      System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());   
		   }    

	}

}


/*

Map.Entry<K,V> is an interface that is used to work on an entry in the map. It returns a collection view of the map. Each Map.Entry object contains one key/value pair.

1. getKey(): It is used to retrieve the key for a map entry. Its return type is key.

2. getValue(): It is used to get the value for a map entry. Its return type is value.

3. entrySet(): It returns a set view of entries of a map.
*/