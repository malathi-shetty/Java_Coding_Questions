package duplicates_In_An_Array;

import java.util.HashMap;

public class Duplicate_WORDS_InAnArray_HashMap {

	public static void main(String[] args) {

		String k = " Java day concept concept of the day";
		
		String [] a=k.split(" ");
		HashMap <String, Integer> newobj = new HashMap<String, Integer>();
		
		// HashMap - key & value
		
		int count =1;
		
		for(int i=0; i<a.length; i++)
		{
			if(!newobj.containsKey(a[i]))
			{
				newobj.put(a[i], count);			
			}
			else
			{
				newobj.put(a[i], newobj.get(a[i])+1);
			}
		}
		
		for(String i: newobj.keySet())
		{
			if(newobj.get(i) >1) {
				System.out.println("Repeated dup Word is: " + i ); // if u want to check ONLY text repeat in entire sentence
			}
			
			System.out.println(" ");
			
			System.out.println("Word dup is: " + i + " --> "+ newobj.get(i)); // if u want to count entire sentence
		}
		
	}

	}


