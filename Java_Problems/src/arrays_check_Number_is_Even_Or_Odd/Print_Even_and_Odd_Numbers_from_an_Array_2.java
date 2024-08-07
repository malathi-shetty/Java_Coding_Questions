package arrays_check_Number_is_Even_Or_Odd;

public class Print_Even_and_Odd_Numbers_from_an_Array_2 {

	public static void main(String[] args) {
		
		// Using Enhanced For Loop
		
		int a[] = {7,8,9,10,11,12};
		
		System.out.println("Even Numbers in Array: ");	
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}

		System.out.println("Odd Numbers in Array: ");
		for(int value :a)
		{
			if( value%2 !=0)
				System.out.println(value);
		}

	}
}