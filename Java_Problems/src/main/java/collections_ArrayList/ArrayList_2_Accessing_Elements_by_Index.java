package collections_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2_Accessing_Elements_by_Index {

	public static void main(String[] args) {
		List<String> newobj = new ArrayList<>(); // Specify the type as String
		newobj.add("java");
		newobj.add("Class");    
		newobj.add("testing");    
		newobj.add("Training");    
		newobj.add("hello");
		
		System.out.println("******2nd Approach*******");
		try {
		    System.out.println("ArrayList-0th index: " + newobj.get(0)); 
		    System.out.println("ArrayList-1st index: " + newobj.get(2)); 
		    System.out.println("ArrayList-2nd index: " + newobj.get(1)); 
		    System.out.println("ArrayList-3rd index: " + newobj.get(3)); 
		} catch (IndexOutOfBoundsException e) {
		    System.out.println("Index is out of bounds!");
		}

	}

}
