package sum_of_all_the_digits_in_a_number;

public class Find_Sum_of_Elements_in_Array_1 {

	public static void main(String[] args) {
		
		int a[] = {5,2,7,9,6};
		
		int sum = 0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum = sum+a[i]; // 5 + 2 +7 + 9 + 6
		}
		System.out.println("Sum of Elements in Array: " + sum);
	 
		
		
	}

}