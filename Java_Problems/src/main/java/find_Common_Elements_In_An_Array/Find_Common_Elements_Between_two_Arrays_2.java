package find_Common_Elements_In_An_Array;

import java.util.HashSet;

public class Find_Common_Elements_Between_two_Arrays_2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
	//	int[] b = { 1, 3, 1 };
		int[] b = { 4, 8, 10 };

		HashSet newobj = new HashSet();

		for (Integer k : a) {
			newobj.add(k);
		}

		HashSet newobj1 = new HashSet();

		for (Integer j : b) 
		{
			if(newobj.contains(j))// return true or false, if condition is true or false
			{
			newobj1.add(j);
			}
		}

		System.out.println("Elements in first Array: " + newobj);
		System.out.println("Common Elements in both Arrays: " + newobj1);
	}

}
