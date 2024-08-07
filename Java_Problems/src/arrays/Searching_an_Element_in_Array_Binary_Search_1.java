package arrays;

public class Searching_an_Element_in_Array_Binary_Search_1 {

	public static void main(String[] args) {
		
		// Approach 1 : Logic
		
		int a[] = {1,2,3,4,5,6,7,8,9,10}; // Should be in Sorted Order
		
		boolean flag = false;
		int key = 25; // Searchable Element mentioned in above array
		
		int l = 0; // lower index i.e 0 Value would be 1
		int h = a.length-1; // a.length is 10 - 1 ie. 9 value would be 10
		
		while(l <= h) // Lower value should always be less than higher value
		{
			int m = (l+h) / 2; // Find Mid value
			
			if(a[m] == key)
			{
				System.out.println("Element Found..");
				flag = true; // as soon as element is found it will show true & break the loop
				break;
			}
			
			if(a[m] < key)
			{
				l = m + 1 ;
			}
			if(a[m] > key)
			{
				h = m - 1;
			}
		}
		if(flag == false)
		{
			System.out.println("Element NOT Found..");
		}
	}
}