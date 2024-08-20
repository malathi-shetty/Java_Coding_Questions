package find_Maximum_And_Minimum_Values_in_arrays;

public class Maximum_Element_from_an_unsorted_array {

	public static void main(String[] args) {
		
		int []a = {1,455,45,678,98,67};
		int max = Integer.MIN_VALUE;
		for(int element:a)
		{
			if(element > max)
			{
				max =element;
			}
		}
		System.out.println("Max Element is: " + max);
	}

}
