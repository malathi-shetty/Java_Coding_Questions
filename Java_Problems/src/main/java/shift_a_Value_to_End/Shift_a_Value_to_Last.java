package shift_a_Value_to_End;

import java.util.Arrays;

public class Shift_a_Value_to_Last {

	public static void main(String[] args) {
		/*
		 * Shift a Value to End
🔸 Input: {1, 4, 5, 4, 3, 0, 3, 2, 0, 1}, Value = 1
🔸 Output: [4, 5, 4, 3, 0, 3, 2, 0, 1, 1]
		 */

		int[] a ={1, 4, 5, 4, 3, 0, 3, 2, 0, 1};
		System.out.println("Before Shifting Values:" + Arrays.toString(a));
		System.out.println("After Shifting Values: " + shiftToLast(a, 3));
		
	}
	
	public static String shiftToLast(int[] a, int shiftValue)
	{
		
		for(int i=0; i<a.length; i++)
		{
			if (a[i] == shiftValue) {
			for(int j=i+1; j<a.length; j++)
			{
				if (a[j] != shiftValue) 
				{
					// swap a[i] and a[j]
				
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					break; // important to break after the first swap
				}
			}
		}
		}
		 return Arrays.toString(a);
	}

}
