package collections_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_6_Comparing_Two_Lists {

	public static void main(String[] args) {
		
		List<String> newobj = new ArrayList<>(); // Specify the type as String

		newobj.add("java");
		newobj.add("Class");    
		newobj.add("testing");    
		newobj.add("Training");    
		newobj.add("hello");
		
		List<Object> newobj1 = new ArrayList<>(); // This can hold any type
		newobj1.add("school");
		newobj1.add("college");    
		newobj1.add(100);    
		newobj1.add("office");    
		newobj1.add("home");   
		
		System.out.println("newobj-data: " + newobj);
		System.out.println("newobj1-data: " + newobj1);
		System.out.println("does newobj equals newobj1: " + newobj.equals(newobj1));

	}

}
