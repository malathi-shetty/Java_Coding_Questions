package practice_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test15 {

	public static void main(String[] args) {
		 // Create a list with initial values
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
     
/* JAVA 8****Not COmpatible with jre 21 -- since using 1.8**
        // Use removeIf to remove elements that satisfy the condition (i % 2 == 0)
        list.removeIf(i -> i % 2 == 0);
        
        // Multiply each remaining element by 2
        list.replaceAll(i -> i * 2);
        
        // Print each element of the list
        list.forEach(i -> System.out.println(i + " "));
	*/	
// Use Iterator to remove elements that satisfy the condition (i % 2 == 0)
Iterator<Integer> iterator = list.iterator();
while (iterator.hasNext()) {
    Integer i = iterator.next();
    if (i % 2 == 0) {
        iterator.remove();  // Remove even numbers
    }
}

// Use a loop to multiply each remaining element by 2
for (int i = 0; i < list.size(); i++) {
    list.set(i, list.get(i) * 2);  // Multiply remaining elements by 2
}

// Print each element of the list using a traditional for-each loop
for (Integer i : list) {
    System.out.println(i + " ");  // Print each element
}

	}

}

/*
 * 
 * Remove Even Numbers (Alternative to removeIf):

Java 1.8 supports the Iterator interface for removing items from a collection while iterating. We use an Iterator to remove all even numbers (i % 2 == 0) from the list.

Multiply Each Element by 2 (Alternative to replaceAll):

Instead of using replaceAll, which is a Java 8 feature, we manually loop through the list and multiply each remaining element by 2 using list.set(i, list.get(i) * 2).

Printing Each Element (Alternative to forEach):

Instead of using forEach, which is also a Java 8 feature, we use a for-each loop to print each element of the list.

Output:

For the input list [1, 2, 3, 4, 5], the output after running the code will be:
 
2

6

10

Why These Changes Were Made:

removeIf is not available in Java 1.8 in the form you're using. Instead, we use the Iterator's remove() method.

replaceAll is a method introduced in Java 8. We instead use a standard loop to perform the operation.

forEach is a convenient method in Java 8 for printing the list, but we replace it with the old-fashioned for-each loop that works in all versions of Java.

This version should now work perfectly in Java 1.8 without any issues.

*/
