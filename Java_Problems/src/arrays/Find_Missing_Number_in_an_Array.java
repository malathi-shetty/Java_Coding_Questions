package arrays;

public class Find_Missing_Number_in_an_Array {

	public static void main(String[] args) {
		// Array should not contain duplicate values
		// Array can be in any order no need to be in sorted order - ascending/descending/mixed order
// Value should be in some range like start & end value should be either 1 or 5. middle any number is missing is fine

		int a[] = {1,2,3,4,5,7,8,9,10}; // 6 is missing -- 
		//sum1 = 1+2+4+5 =12 (sum of elements of array)
		//sum2 = 1+2+3+4+5 = 15 (sum of elements of array along with missing number - within the range)
		// sum2 - sum1 = 15-12 = 3 is missing number
		
		int sum1 = 0;
		for(int i =0; i<a.length; i++)
		{
			sum1 = sum1+a[i];
		}
		System.out.println("Sum of elements in an Array: " + sum1);
		
		int sum2 = 0;
		for(int i=1; i<=10; i++)
			//not capturing according to indexes - we are including all the range so taking start & end point
		{
			sum2 = sum2 + i; // elements that come between 1 to 10
		}
		System.out.println("Sum of Total Elements coming inside the Range: " + sum2);
		System.out.println("Missing Number is: " + (sum2-sum1));
	}
}