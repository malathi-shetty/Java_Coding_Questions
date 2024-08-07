package arrays_check_Number_is_Even_Or_Odd;

public class Print_Even_and_Odd_Numbers_from_an_Array_1 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		//Extracting Even Numbers
		
		System.out.println("Even Numbers in Array: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i] % 2 == 0)
				System.out.println(a[i]);
		}
		
		System.out.println("Odd Numbers in Array: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i] % 2 != 0)
				System.out.println(a[i]);
		}

	}

}