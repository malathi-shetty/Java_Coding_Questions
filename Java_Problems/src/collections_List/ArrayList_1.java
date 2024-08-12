package collections_List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_1 {

	public static void main(String[] args) { // if we want to add string related elements only the we have to use angular brackets
		// List is an interface so we cannot create an object
		
		System.out.println("******1st Approach*******");
		List newobj = new ArrayList<String>();// we have take; LIST interface and class name is arraylist
		
		newobj.add("java");
		newobj.add("Class");	
		newobj.add("testing");	
		newobj.add("Training");	
		newobj.add("hello");
		System.out.println("ArrayList-all list: " + newobj); // follows insertion order
		
		System.out.println(" ");
		System.out.println("******2nd Approach*******");
		System.out.println("ArrayList-0th index: " + newobj.get(0)); 
		System.out.println("ArrayList-1st index: " + newobj.get(2)); 
		System.out.println("ArrayList-2nd index: " + newobj.get(1)); 
		System.out.println("ArrayList-3rd index: " + newobj.get(3)); 
		
		System.out.println(" ");
		System.out.println("******3rd Approach*******");
		for(int i=0; i<newobj.size(); i++) // size method is used to find the size of the list
		{
			System.out.println("List all the values: " + newobj.get(i));// it is used to fetch the element from the particluar position of the list
		}
		
		System.out.println(" ");
		System.out.println("******4th Approach*******");
		
		//List<String> newobj = new ArrayList<String>(); // we take List interface and class name is arraylist
		Iterator ids = newobj.iterator();
		
		while(ids.hasNext())
		{
			String data = (String) ids.next();
			System.out.println("Iterator data: " + data);
		}
		
		System.out.println(" ");
		System.out.println("******5th Approach*******");
		List newobj1 = new ArrayList<>(); 
		newobj1.add("school");
		newobj1.add("college");	
		newobj1.add(100);	
		newobj1.add("office");	
		newobj1.add("home");	
		ListIterator itr = newobj1.listIterator(newobj1.size());
		while(itr.hasPrevious())
		{
			Object data1 =  itr.previous();
			System.out.println("List Iterator data: " + data1);
			
		}
		
		System.out.println("*********");
		System.out.println("newobj-data: " + newobj);
		System.out.println("newobj1-data: " + newobj1);
		System.out.println("does newobj equals newobj1: " + newobj.equals(newobj1));
		
		
		List<String> al4 = new ArrayList<>();
		System.out.println("Is al4 Empty? : " + al4.isEmpty());
		
		System.out.println(newobj1);
		newobj1.set(3, "xxx"); // replace 3rd index value
		System.out.println(newobj1);
		
		
		System.out.println(newobj1.get(3));
		
	//String.CASE_INSENSITIVE_ORDER is a predefined comparator in Java that is used for comparing String objects in a case-insensitive manner. 
		//This means it will treat uppercase and lowercase letters as equivalent when comparing strings.
		newobj.sort(String.CASE_INSENSITIVE_ORDER); // sort the element by alphabetic order - doesnt sort if number is present
		System.out.println(newobj);
		
		System.out.println(" ");
		
		newobj.sort(Comparator.naturalOrder());
		System.out.println(newobj); // Comparator - used to print small letters one side & capital one side

	}

}
