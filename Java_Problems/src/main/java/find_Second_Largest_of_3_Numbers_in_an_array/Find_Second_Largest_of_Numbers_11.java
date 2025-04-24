package find_Second_Largest_of_3_Numbers_in_an_array;

import java.util.Arrays;

public class Find_Second_Largest_of_Numbers_11 {

	public static void main(String[] args) {
		/*🔸 Input: {4, 19, 3, 4, 16}
🔸 Output: 16
		 */

		int[]a ={4, 19, 3, 4, 16};
		System.out.println("Digit: " + Arrays.toString(a));
		System.out.println("Second Largest Digit is: " + secondLargestDigit(a));
		
	}

	public static int secondLargestDigit(int[] a) {
		int largest =0;
		int secondLargest = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > largest)
			{
				secondLargest = largest;
				largest = a[i];
			}
			else if(a[i] > secondLargest && a[i] < largest)
			{
				secondLargest = a[i];
			}
		}
		return secondLargest;
	}

}
