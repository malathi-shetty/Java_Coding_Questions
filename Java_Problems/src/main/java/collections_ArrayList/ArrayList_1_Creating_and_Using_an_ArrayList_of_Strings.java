package collections_ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_1_Creating_and_Using_an_ArrayList_of_Strings {

    public static void main(String[] args) {
        System.out.println("******1st Approach*******");
        List<String> newobj = new ArrayList<>(); // Specify the type as String
        
        newobj.add("java");
        newobj.add("Class");    
        newobj.add("testing");    
        newobj.add("Training");    
        newobj.add("hello");
        System.out.println("ArrayList-all list: " + newobj); // follows insertion order
        
       
       
    }
}
