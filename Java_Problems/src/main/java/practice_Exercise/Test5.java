package practice_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		//**true**
		final List<String> mp = new ArrayList();
		System.out.println(mp.add("test1"));
		
		//Output: true

/*	//	***false**
		List<String> mp = new ArrayList<>();
        mp = Collections.unmodifiableList(mp); // Make the list unmodifiable
        
        try {
            System.out.println(mp.add("test1")); // Will throw UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("false"); // Print "false" if adding is not allowed
        }
        */
	}

}

/*
 * 
 * final List<String> mp = new ArrayList();
 * 
 * Here, you declare a variable mp of type List<String>, which means it is a
 * list that holds String values.
 * 
 * final means the reference to the mp object cannot be changed once
 * initialized, meaning you cannot make mp refer to a new object later. However,
 * you can still modify the contents of the list.
 * 
 * The new ArrayList() initializes an empty ArrayList to hold the String values.
 * However, this is a raw type (no type specified), which is not recommended in
 * modern Java because it can cause unchecked warnings. A safer version would be
 * new ArrayList<String>().
 * 
 * - Adding an Item to the List:
 * 
 * System.out.println(mp.add("test1"));
 * 
 * The add("test1") method is called on mp, which adds the string "test1" to the
 * list.
 * 
 * The add() method returns a boolean value: true if the element was added
 * successfully, and false if the element was not added (which might occur if
 * the list is immutable or full).
 * 
 * Since you’re calling System.out.println(), it will print the result of the
 * add() method. Since "test1" is successfully added, it prints true.
 * 
 * Key Points:
 * 
 * final keyword: The list mp is declared final, meaning you can’t reassign mp
 * to point to another List. However, you can still modify the contents of the
 * list itself (e.g., adding or removing elements).
 * 
 * Raw type: The code uses ArrayList without specifying a generic type (like
 * <String>), which is not recommended in modern Java because it can lead to
 * runtime errors. It's better to specify the type as ArrayList<String>.
 * 
 * Output:
 * 
 * The program prints: true
 * 
 * 
 * This is the result of the add("test1") method, indicating that the item
 * "test1" was successfully added to the list.
 * 
 * Possible Improvement:
 * 
 * To avoid the raw type warning, modify the new ArrayList() to:
 * 
 * final List<String> mp = new ArrayList<String>();
 * 
 */