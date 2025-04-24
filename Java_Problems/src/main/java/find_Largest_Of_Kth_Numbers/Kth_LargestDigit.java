package find_Largest_Of_Kth_Numbers;

import static org.junit.jupiter.api.Assumptions.abort;

public class Kth_LargestDigit {

	public static void main(String[] args) {
		//Input: {2, 5, 7, 8, 9, 6}, K = 3
		//🔸 Output: 7  //3rd largest digit

		int[]a ={2, 5, 7, 8, 9, 6};
		int k =3; 
		LargestDigit(a,k);
	}

	public static void LargestDigit(int[] a, int k) {
		int result = 0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j]) 
				{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		result = a[a.length - k];
		System.out.println("Kth Largest Digit is: " + result);
	}

}
