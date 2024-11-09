package find_duplicates_Strings_In_An_Array;

import java.util.HashSet;

public class Duplicate_STRINGS_InAnArray_HashSet_learn {

	public static void main(String[] args) {
		
	/*	String s = "Malathi Shetty"; // a is repeated
		
		char[] a = s.toCharArray(); // seprate each character into array - p[0], r[1], i[2]...
		
		HashSet newobj = new HashSet();
		
		
		for(int i=0; i<a.length; i++)
		{
			
			if(newobj.add(a[i]) == false)
			{
			
				System.out.println(a[i]  );
			}
		}
		
		*/
  String s = "Malathi Shetty";

	        HashSet<Character> set = new HashSet<>();
	        HashSet<Character> duplicates = new HashSet<>();
	       
	        for (char c : s.toCharArray()) {
	        	
	            if (!set.add(c)) {
	                duplicates.add(c);
	                
	            }
	        }

	        System.out.println("Duplicate characters in the string:" );
	        for (char duplicate : duplicates) {
	            System.out.println(duplicate );
	            
	        }
		
	

	}
}