package find_Maximum_And_Minimum_Values_in_arrays;

public class Maximum_And_Minimum_Values_in_Array {

	public static void main(String[] args) {
		
		int a[]= {50,100,40,20,60};
		
		int max=a[0]; //a[0]= 50
		//consider initial element as maximum element - compare each element with the initial maximum value,
		//if any element is greater than maximum then replace the element as maximum
		
		int min=a[0];
	
		for(int i=1; i<a.length; i++)// 0 index is already taken so i started from 1
		{
			if(a[i] > max)
			{
				max = a[i]; // only if array element is greater than maximum then replace
			}
			
			if(a[i] < min)
			{
				min = a[i]; // only if array element is lesser than minimum then replace
			}
		}
		System.out.println("Maximum Element in the Array is: " + max);
		System.out.println("Minimum Element in the Array is: " + min);
	}
}