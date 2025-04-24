package find_Second_Largest_of_3_Numbers_in_an_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_Second_Largest_of_Numbers_3 {
	public static void main(String[] args) {

		Integer[] a = { 10, 4, 5, 6, 8 };

		ArrayList<Integer> newobj = new ArrayList(Arrays.asList(a));
		Collections.sort(newobj);
		System.out.println(newobj.get(newobj.size() - 2));

		/*
		 * Find Largest Number int Largest = a[0];
		 * 
		 * for(int i =1; i<a.length; i++) { if(a[i] > Largest) { Largest = a[i]; }
		 * 
		 * } System.out.println(Largest);
		 * 
		 */
	}

}
