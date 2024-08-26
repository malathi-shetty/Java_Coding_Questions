package find_Second_Largest_of_3_Numbers_in_an_array;

import java.util.Arrays;

public class Find_Second_Largest_of_3_Numbers_in_an_array_1_5 {

	public static void main(String[] args) {
		int [] a = {2,3,8,5,6};
		
		Arrays.sort(a);
		System.out.println("Second Largest Number is: "+ a[a.length-2]);

	}

}
