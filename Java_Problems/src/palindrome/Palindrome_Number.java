package palindrome;

public class Palindrome_Number {

	public static void main(String[] args) {
		
			int original = 1234; // Store the original number
			//int original= 16461; // 4224
	        int i = original; 
	        
				int rev = 0;
				
				while(i != 0) 
				{
				 rev = rev * 10 + i % 10; // 0*10+1234%10 == 4
		
				i = i / 10;
			
				
				}
				
				System.out.println(rev);
				
				  // Check if the reversed number is equal to the original number
				if(original == rev)
				{
					System.out.println("num is palindrome");
				}else 
				{
					System.out.println("num is not palindrome");
				
				}
		}

	}


