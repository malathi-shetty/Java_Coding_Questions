package find_duplicates_Integers_In_An_Array;

public class Duplicate_INTEGERS_InAnArray {

	public static void main(String[] args) {

		int[] a= {10,2,3,3,4,5,5,6}; // 3,5 are duplicate elements in array
		
		//question
		//process - 10 compare with 2 then 10 compare with 3 & so on till 6
		// then compare 2 with 3.. till 6 all numbers are compared with each other
		// 2 for loop is needed - 1
		// numers are stored in find_Maximum_And_Minimum_Values_in_arrays - 0,1,2..
		
		
		//for(initialization, condition, increment)
		//i=0; i<7; i++
		
		
		for(int i=0; i<a.length; i++)
		{
			int count =1;
			for(int j=i+1; j<a.length; j++) // comparing 2 values that is why i+1
			{
				if(a[i] == a[j])	
				{
					count++;
					System.out.println(a[i] + " --> " + count);
				}
			}
		}
		
		
		
		

	}

}
