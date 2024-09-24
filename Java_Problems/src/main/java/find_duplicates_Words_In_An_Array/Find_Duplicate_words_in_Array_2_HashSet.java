package find_duplicates_Words_In_An_Array;

import java.util.HashSet;

public class Find_Duplicate_words_in_Array_2_HashSet {

	public static void main(String[] args) {
		// Using HashSet Collections in Java
		
		HashSet<String> langs = new HashSet(); // not allow duplicate values - only unique values
		/*System.out.println(langs.add("Java"));
		System.out.println(langs.add("Python"));
		System.out.println(langs.add("Java")); // already present, so it wont allow to add duplicate
	*/	
		String a[]= {"Java", "C", "C++", "Python" ,"Java"};
		boolean flag = false;
		for(String l: a) //reading each value from array & store it inside variable - l
		{
			if(langs.add(l) == false) 
			{
				System.out.println("Found Duplicate Element: " + l);
				flag = true;
			}		
		}
		if(flag == false)
		{
			System.out.println(" No Duplicate Element Found");
		}
	}
}