package find_duplicates_Integers_In_An_Array;

import java.util.HashSet;

public class Duplicate_INTEGERS_InAnArray_UsingHashSet {

	public static void main(String[] args) {
		// using HashSet
		
		int[] a= {10,2,3,3,4,5,5,5,6};
		
		//HashSet Usage: The primary advantage of using a HashSet here is that it automatically handles uniqueness. 
		
		HashSet<Integer> set = new HashSet<>();//creates an empty HashSet named set to store unique elements from array a.
		HashSet<Integer> duplicate = new HashSet<>();//creates another HashSet named duplicates to store duplicate elements found in array a.
		
		
		for(int num:a) // iterates through each element num in the array a.
		{
			
			if(!set.add(num)) // If num is already in set, add returns false - if (!set.add(num)) { ... } attempts to add num to set. 
								//If num is already present in set (i.e., it returns false because num is not added as it's a duplicate),
								// then the code inside the if block executes.
			{
				duplicate.add(num); // num is a duplicate, add to duplicates set -
									//adds num to the duplicates set because it is identified as a duplicate (i.e., it already exists in set).
					
			}
		
		}
	System.out.println("Duplicates Number are: " + duplicate );
		//prints out the elements in the duplicates set, which are the duplicate elements found in the array a.
		
	}

}
