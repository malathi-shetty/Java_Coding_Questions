package collections_Map;

import java.util.HashMap;
import java.util.Map;

public class Iterate_map_in_java_using_iterator_concept_5 {

	
	//JDK - issues else code is proper
	public static void main(String[] args) {
		// Iterate Map using forEach() Method
		
		Map<String, String> map = new HashMap<>();
		 
		   map.put("India", " Delhi");
		   map.put("USA", " Washington, D.C.");
		   map.put("Australia", " Canberra");
		   map.put("New zealand", " Wellington");
		   map.put("Switzerland", " Bern");
		      
		// Iteration over map using forEach() method.   
	//	   map.forEach((k,v) -> System.out.println("Country: "+ k + ", Capital: " + v)); 

	}

}


/*

The forEach() method was added to the iterable interface with the release of JDK 1.8. It is a default method defined in the java.lang.Iterable interface.

This method performs the specified action for each element within Iterable interface until all the elements have been processed. The collection classes which extend the Iterable interface can use forEach() method to iterate elements of collection objects.

The forEach() method takes action to be performed for each element as a parameter. If the specified action is null, it will throw NullPointerException. It does not return anything.

*/