package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.HashSet;

public class Numbers_Common_in_both_the_Arrays_Set_2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
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
