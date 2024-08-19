package find_Sum_of_Elements_in_Array;

public class Find_Sum_of_Elements_in_Array {

	public static void main(String[] args) {
		
		int a[] = {5,2,7,9,6};
		
		int sum = 0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum = sum+a[i]; // 5 + 2 +7 + 9 + 6
		}
		System.out.println("Sum of Elements in Array: " + sum);
	 
		//OR
		//Enhanced For Loop - For each loop
		int b[] = {5,2,7,9,6};
		
		int sum1 = 0;
		for(int value: b)
		{
			sum1 = sum1 + value;
		}
		System.out.println("Sum of Array Elements: " + sum1);
	}

}