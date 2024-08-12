package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		


				String s = "madam"; // nitin, naman, radar
				//String s = "malathi";
				String rev ="";
				
				for(int i=s.length()-1; i >=0; i--)
				{
					rev = rev+s.charAt(i);
				}
				System.out.println("Reverse String: " + rev);
				
				if(rev.equals(s)){
					System.out.println(s + " is palindrome");
				}else
				{
					System.out.println(s + " is not a palindrome");
				}
				
			/*	if(s.toLowerCase().equals(rev.toLowerCase()))
				{
					System.out.println(s + " is palindrome");
				}else
				{
					System.out.println(s + " is not a palindrome");
				}
			*/
			}
	

		

	}


