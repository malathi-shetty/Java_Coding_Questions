package collections_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_5_Creating_and_Using_an_ArrayList_of_Objects {

	public static void main(String[] args) {
		List<Object> newobj1 = new ArrayList<>(); // This can hold any type
		newobj1.add("school");
		newobj1.add("college");    
		newobj1.add(100);    
		newobj1.add("office");    
		newobj1.add("home");    

		ListIterator<Object> itr = newobj1.listIterator(newobj1.size());
		while (itr.hasPrevious()) {
		    Object data1 = itr.previous();
		    System.out.println("List Iterator data: " + data1);
		
		}

	}

}
