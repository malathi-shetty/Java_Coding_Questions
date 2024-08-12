package reverse;

public class Reverse_a_Number_3 {

	public static void main(String[] args) {
		
		int i=1234;
		int rev=0;
		
		while(i != 0) {
		 rev = rev * 10 + i % 10; // 0*10+1234%10 == 4
		
		System.out.println(rev);
		
		i = i / 10;
	
		
		}
		

	}

}
