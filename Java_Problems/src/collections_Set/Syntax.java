package collections_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Syntax {

	public static void main(String[] args) {
		// We can create a generic Set object by using one of its three concrete classes: 
		// HashSet, LinkedHashSet, and TreeSet. 
		//The general syntax to create set objects is as:
		
		
	/*	Set<T> set = new HashSet<T>(); // where T is a type of generic.
		Set<T> set = new LinkedHashSet<T>();
		Set<T> set = new TreeSet<T>();

		//For example:
		Set<Integer> set1 = new HashSet<Integer>(); // Creates an empty set of Integer objects.
		Set<String> set2 = new LinkedHashSet<String>(); // Creates an empty set of String objects.
*/
		
		  // HashSet Example
        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("HashSet: " + hashSet);
        
        // LinkedHashSet Example
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("cherry");
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        // TreeSet Example
        Set<Double> treeSet = new TreeSet<Double>();
        treeSet.add(3.14);
        treeSet.add(1.618);
        treeSet.add(2.718);
        System.out.println("TreeSet: " + treeSet);
		
		
	}

}
