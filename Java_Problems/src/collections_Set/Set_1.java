package collections_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_1 {

	public static void main(String[] args) {
		
		HashSet<String> newobj = new HashSet<String>();
		
		newobj.add("ehh");
		newobj.add("HIIII");
		newobj.add("Bruh...");
		newobj.add("Bruh...");
		newobj.add("Bruh...");
		newobj.add("cyaa");
		newobj.add("null");
		newobj.add("null");
		newobj.add("null");
		
		System.out.println("HashSet: "+ newobj);
		
		System.out.println(" ");
		
		LinkedHashSet newobj1 = new LinkedHashSet();
		newobj1.add("Engine");
		newobj1.add("Apple");
		newobj1.add("Drum");
		newobj1.add("Cup");
		newobj1.add("null");
		newobj1.add("Cup");
		newobj1.add("null");
		newobj1.add("Cup");
		newobj1.add("null");
		System.out.println("LinkedHashSet: "+ newobj1);
		
		System.out.println(" ");
		
		TreeSet newobj2 = new TreeSet();
		newobj2.add("Egg");
		newobj2.add("Ant");
		newobj2.add("Dog");
		newobj2.add("Cake");
		newobj2.add("null");
		newobj2.add("Cake");
		newobj2.add("null");
		newobj2.add("null");
		newobj2.add("Cake");
		System.out.println("TreeSet: "+ newobj2);
		
		
		for(String i: newobj) // return type is String so  added string:  HashSet<String> newobj = new HashSet<String>();
		{
			System.out.println(i);
		}
		
		System.out.println(" ");
		System.out.println(newobj.remove("null"));
		System.out.println(newobj);
		
		System.out.println(" ");
		
	Iterator data=	newobj.iterator();
	while(data.hasNext())
	{
		String i = (String) data.next();
		System.out.println("Iterator: " + i);
	}

	}

}
