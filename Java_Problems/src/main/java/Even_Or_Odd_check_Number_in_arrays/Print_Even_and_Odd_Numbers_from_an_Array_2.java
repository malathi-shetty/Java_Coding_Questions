package Even_Or_Odd_check_Number_in_arrays;

public class Print_Even_and_Odd_Numbers_from_an_Array_2 {

	public static void main(String[] args) {
		
		// Using Enhanced For Loop
		
		int a[] = {12, 45, 67, 32, 9, 18, 55, 20};
		
		System.out.println("Even Numbers in Array: ");	
		for(int num :a)
		{
			if(num %2==0)
				System.out.println(num );
		}

		System.out.println("Odd Numbers in Array: ");
		for(int num  :a)
		{
			if( num %2 !=0)
				System.out.println(num );
		}

	}
}

/*

We define an array numbers with both even and odd integers.

To print even numbers, we loop through the array and check if the number is divisible by 2 (num % 2 == 0).

Similarly, for odd numbers, we check if the number is not divisible by 2 (num % 2 != 0).

The results for even and odd numbers are printed separately.

Example Output:

For the input array {12, 45, 67, 32, 9, 18, 55, 20}, the output will be:

Even Numbers in Array: 

12

32

18

20

Odd Numbers in Array: 

45

67

9

55


*/