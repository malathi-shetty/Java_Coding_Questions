package collections_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_8_Replacing_an_Element_in_the_List {

	public static void main(String[] args) {
		
		List<Object> newobj1 = new ArrayList<>(); // This can hold any type
		newobj1.add("school");
		newobj1.add("college");    
		newobj1.add(100);    
		newobj1.add("office");    
		newobj1.add("home");
		
		System.out.println("Original Values:"+ newobj1);
		newobj1.set(3, "xxx"); // replace the 3rd index value
		System.out.println("Replace existing office with xxx: " + newobj1);

		System.out.println("Value which is been added: " + newobj1.get(3));

	}

}
