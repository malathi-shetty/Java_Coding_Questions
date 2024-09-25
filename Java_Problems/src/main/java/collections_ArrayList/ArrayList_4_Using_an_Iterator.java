package collections_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_4_Using_an_Iterator {

	public static void main(String[] args) {
		List<String> newobj = new ArrayList<>(); // Specify the type as String
		newobj.add("java");
		newobj.add("Class");    
		newobj.add("testing");    
		newobj.add("Training");    
		newobj.add("hello");
		
		System.out.println("******4th Approach*******");

		Iterator<String> ids = newobj.iterator(); // Use a generic iterator
		while (ids.hasNext()) {
		    String data = ids.next();
		    System.out.println("Iterator data: " + data);

	}

}
}
