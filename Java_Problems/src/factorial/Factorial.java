package factorial;

public class Factorial {

	public static void main(String[] args) {
		
		int i,fact = 1;
		int number =5;//It is the number to calculate factorial  
		for(i=1; i<=5; i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}
