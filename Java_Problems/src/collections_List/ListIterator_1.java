package collections_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_1 {

	public static void main(String[] args) {
		   List newobj1 = new ArrayList<>(); 
	        newobj1.add("school");
	        newobj1.add("college");    
	        newobj1.add("office");    
	        newobj1.add("home");
	        newobj1.add(100);  
	        newobj1.add("office123"); 
	        newobj1.add("office123"); 

	        ListIterator itr = newobj1.listIterator(newobj1.size()); // Initialize iterator at the end of the list
	        
	        while(itr.hasPrevious()) {
	             Object data1 = itr.previous();
	            System.out.println("List Iterator data: " + data1);
	            
	            System.out.println(" ******** ");
	        }
	        
	        List newobj = new ArrayList<>(); 
	        newobj.add("xyz");
	        newobj.add(10);    
	        newobj.add("office123"); 
	        newobj.add("office123"); 
	        newobj.add(100); 
	        newobj.add(100);
	        newobj.add("office123"); 
	        newobj.add("office123"); 
	        newobj.add("office123"); 
	        
	        
	        newobj.addAll(newobj1);
	        System.out.println("newobj1: " + newobj1);
	        
	        System.out.println(" ---------- ");
	        
	        System.out.println("All data of newobj & newobj1 in 'newobj': " + newobj);
	        
	        System.out.println(" ---------- ");
	        
	        newobj.add(0, "testing"); // add data to 0th index
	        System.out.println("newobj - Add Data in index 0: " + newobj);
	        
	        System.out.println(" ---------- ");
	        
	        System.out.println(newobj.containsAll(newobj1)); // true - newobj contains all data of newobj1
	        
	        System.out.println(newobj1.containsAll(newobj)); // false  - since newobj1 doesnt contains all data of newobj
	        
	        System.out.println(newobj.equals(newobj1)); // false  -
	        System.out.println(newobj1.equals(newobj)); // false  -
	        
	        System.out.println(newobj.indexOf(10));
	        System.out.println(newobj.indexOf("office"));
	        System.out.println(newobj.indexOf("tttttttttt")); // since elemnet is not present
	        
	        System.out.println(newobj.remove(2));
	        System.out.println("newobj after removing index2: " + newobj);
	        
	        System.out.println(" ");
	        // Retain only elements in newobj1 that are also in newobj
	        boolean modified = newobj1.retainAll(newobj);
	        System.out.println("newobj1 after retainAll(newobj): " + newobj1);
	        System.out.println("Was newobj1 modified? " + modified);
	        
	        System.out.println("--------");
	        
	        boolean modified1 = newobj.retainAll(newobj1);
	        System.out.println("newobj.retainAll(newobj1): "+ newobj); // common elements will be picked
	        System.out.println("Was newobj modified? " + modified1);
	        System.out.println("newobj1 values : " + newobj1);
	        System.out.println("newobj values : " + newobj);
	        //newobj1 should contain the same elements as before because it was not changed (since all of its elements were present in newobj).
	        //The method retainAll returns false if newobj1 wasn't modified; otherwise, it returns true. 
	  //In this case, since newobj1 was already only containing elements that are in newobj, it remains unchanged, and retainAll returns false.
	      
	        
	        
	        System.out.println(" ");
	        
	        System.out.println(newobj);
	        System.out.println(newobj.lastIndexOf("office123")); // last index of the text will print even if its duplicate 
	        System.out.println(newobj.indexOf("office123")); // first index  of the text will print even if its duplicate
	        
	        System.out.println(newobj.contains("home"));
	        System.out.println(newobj.contains(568));
	}

}
