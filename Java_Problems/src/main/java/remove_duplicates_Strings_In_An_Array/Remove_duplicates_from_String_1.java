package remove_duplicates_Strings_In_An_Array;

import java.util.HashSet;

public class Remove_duplicates_from_String_1 {

	public static void main(String[] args) {
	//	  String s = "priyanka";
		  String s = "acccbbbddd";
	        char[] a = s.toCharArray();
	        HashSet newobj = new HashSet();
	        for(int i=0; i<a.length; i++)
	        {
	            if(newobj.add(a[i])==false)
	            {
	               System.out.println(newobj); // [p, a, r, i, y, k, n] - remove duplicates
	             //  System.out.println(a[i]); //a -- find duplicates
	            }
	        }

	        /* 
	        System.out.println("String without duplicates (first occurrence only):");
	        for (char c : a) {
	            if (newobj.add(c)) {  // If the character was not already added, print it
	                System.out.print(c);  // Print only the first occurrence
	            }
	        }*/
	}

}
