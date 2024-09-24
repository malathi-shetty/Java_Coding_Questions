package collections_List;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		
		List<String> al1 = new ArrayList<>();
		al1.add(0, "Abc");
		al1.add(1, "Xyz");
		
		List<String> al2 = new ArrayList<>();
		al2.add(0, "ush");
		al2.add(1, "ijk");
		
		List al3 = new ArrayList();
		al3.add(100000);
		al3.add("pttt");
		
		System.out.println("al3: " + al3);
		
		for(String i: al1)
		{
			System.out.println("al1: " + i);
		}
		
		for(String j: al2)
		{
			System.out.println("al2: " + j);
		}
		
		al2.addAll(al1);
		for(String k:al2)
		{
			System.out.println("Values after all values of al1 added to al2: " + k);
			
		}
		
		System.out.println("*******");
		
		al2.addAll(al3);
		System.out.println(al2);
		
		System.out.println("data: " + al2.addAll(1, al3)); // Inserts all elements of the list al3 into the list al2 at index 1.	
        System.out.println("Modified al2: " + al2);   // Print the modified list al2
		
		System.out.println("********");
		
		System.out.println("Before Clear - al3: " + al3);
		al3.clear();
		System.out.println("After Clear - al3: " + al3);


	}

}
