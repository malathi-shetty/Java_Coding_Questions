package practice_Exercise;

import java.util.HashMap;

public class a3b2d4 {

	public static void main(String[] args) {
		
		// String s = "javaoops";
		// OR
		 String s = "aaabbcdddd";
		char[] a = s.toCharArray();	
		HashMap<Character, Integer> newobj = new HashMap<Character, Integer>();
		int count = 1;
		
		for(int i = 0; i<a.length; i++)
		{
			if(!newobj.containsKey(a[i]))
			{
				newobj.put(a[i], count);
			}else
			{
				newobj.put(a[i], newobj.get(a[i]) + 1);
			}			
		}
		for(Character j : newobj.keySet()) // unique key
		/*{
			System.out.print(j + "" + newobj.get(j));
		}
		*/	
		// If we want only duplicate characters how much time it is repeated -- only duplicate keys are displayed
			if(newobj.get(j) > 1)
			{
				System.out.print(j + "" + newobj.get(j));
			}	
	}
}