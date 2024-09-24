package find_Maximum_And_Minimum_Values_in_arrays;

public class Minimum_Element_from_an_unsorted_array {

	public static void main(String[] args) {
		int[]a = {1,455,45,678,-6,98,67};
		int min = Integer.MAX_VALUE;
		for(int element: a)
		{
			if(element < min)
			{
				min = element;
			}
		}
		System.out.println("Min Element is: " + min);
	}

}
