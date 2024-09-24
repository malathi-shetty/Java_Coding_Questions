package collections_Map;

import java.util.ArrayList;
import java.util.Collections;

public class HashMap_Sort_reverse_swap_max_min {

	public static void main(String[] args) {
		
		//Collections is a frameowrk
		//collection is a class
		
		ArrayList newobj = new ArrayList();
		newobj.add("pratiksha");
		newobj.add("hello");
		newobj.add("obey");
		System.out.println("element printed: " + newobj);
		
		System.out.println(" ");
		
		System.out.println("sort:");
		Collections.sort(newobj); // it will sort alphabetically
		System.out.println("after sort printed: " + newobj);
		
		System.out.println(" ");
		
		System.out.println("inversion_Of_A_Sentence_Number:");
		Collections.reverse(newobj);// it will inversion_Of_A_Sentence_Number
		System.out.println("after inversion_Of_A_Sentence_Number printed: " + newobj);
		
		System.out.println(" ");
		
		System.out.println("swap_String:");
		System.out.println("element printed: " + newobj);
		Collections.swap(newobj,0,2);// it will inversion_Of_A_Sentence_Number
		System.out.println("after swap_String printed: " + newobj);
		
		
		System.out.println(" ********** ");
		
		ArrayList newobj1 = new ArrayList();
		newobj1.add(10);
		newobj1.add(8);
		newobj1.add(4);
		System.out.println("element printed: " + Collections.min(newobj1));
		
		System.out.println("---");
		
		System.out.println("element printed: " + Collections.max(newobj1));
		
		
		
		
		
		
		
		

	}

}
