package fibonacci_series;

public class Fibonacci_series_1 {

	public static void main(String[] args) {
		// Fibonacci series - Sum of 2 preceding numbers.
		// n1 =0, n2=1, sum = 0 - -initial values
		// sum = n1+n2 & then interchange n1 into n2  & assign n2 value in sum
		
		int n1=0, n2 =1, sum = 0;
		System.out.println(n1 + " " + n2);
		
		for(int i=2; i<=10; i++)
		{
			sum = n1+n2; // 0+1=1
		//	System.out.println(n1 + " "+ " + "+ n2 +" = " + sum); // 1
			System.out.println("  " + sum); // 1
			n1 = n2; // n2 = 1 will be assigned to n1, so n1 = 1
			n2 = sum; // 1
		}
		

	}

}