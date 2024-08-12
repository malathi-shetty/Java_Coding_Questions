package practice_Exercise;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8...
		
		int n1=0; 
		int n2=1;
		System.out.println(n1+ " " +n2); // 0 1
		int sum=0;
		
		for(int i=2; i<=10; i++)
		{
			sum = n1 + n2; // sum = 1, n1=0, n2 =1
			n1=n2;
			n2=sum;
			
			System.out.println("Fibonacci Series:" + " " + sum);
			//System.out.println(" " + sum);
			
			
			
		}
		

	}

}
