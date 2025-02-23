package arrays_Equality;

import java.util.Arrays;

public class Check_The_Equality_Of_Two_Arrays_1_learn {

	public static void main(String[] args) {
		//Approach -1:
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		boolean status = Arrays.equals(a1, a2);//returns true (if both find_Maximum_And_Minimum_Values_in_arrays are equal) or false		
		if(status == true)
		{
			System.out.println("Arrays are Equal - a1, a2");
		}else
		{
			System.out.println("Arrays are NOT Equal - a1, a2");
		}
		
		int a3[]= {1,2,10,4,5};
		int a4[]= {1,2,3,4,9};
		boolean status1 = Arrays.equals(a3, a4);
		if(status1 == true)
		{
			System.out.println("Arrays are Equal - a3, a4");
		}else
		{
			System.out.println("Arrays are NOT Equal - a3, a4");
		}	
	}
}

/*
 * 
Output:

Arrays are Equal - a1, a2

Arrays are NOT Equal - a3, a4

*/