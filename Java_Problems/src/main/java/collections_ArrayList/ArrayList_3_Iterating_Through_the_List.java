package collections_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_3_Iterating_Through_the_List {

	public static void main(String[] args) {
		List<String> newobj = new ArrayList<>(); // Specify the type as String
		newobj.add("java");
		newobj.add("Class");    
		newobj.add("testing");    
		newobj.add("Training");    
		newobj.add("hello");
		
		System.out.println("******3rd Approach*******");
		for (int i = 0; i < newobj.size(); i++) {
		    System.out.println("List all the values: " + newobj.get(i));
		}


	}

}
