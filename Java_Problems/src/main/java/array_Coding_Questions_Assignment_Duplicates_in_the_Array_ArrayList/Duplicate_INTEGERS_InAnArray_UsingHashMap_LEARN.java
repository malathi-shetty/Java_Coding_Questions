package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.HashMap;

public class Duplicate_INTEGERS_InAnArray_UsingHashMap_LEARN {

	public static void main(String[] args) {

		int []a = {1,3,3,2,2,4,5,5, 10,3, 99};
		
		HashMap<Integer,Integer> dup = new HashMap<Integer,Integer>();
		//Hashmap stores in the form of keys & values
		// keys is the character & value is the number
		
		int count =1;
		for(int i=0; i<a.length; i++ )
		{
			if(!dup.containsKey(a[i]))
			{
				dup.put(a[i], count);
				
			}else 
			{
				dup.put(a[i], dup.get(a[i])+1);
			}
		}
		
		for(Integer i: dup.keySet())
		{
			System.out.println("duplicate number are: " + i + " --> " + dup.get(i));
		}

	}

}

/*
 * 
 * duplicate number are: 1 --> 1
duplicate number are: 2 --> 2
duplicate number are: 3 --> 3
duplicate number are: 99 --> 1
duplicate number are: 4 --> 1
duplicate number are: 5 --> 2
duplicate number are: 10 --> 1


*/
