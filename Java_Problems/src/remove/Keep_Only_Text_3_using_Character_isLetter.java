package remove;

public class Keep_Only_Text_3_using_Character_isLetter {

	public static void main(String[] args) {
		
		String s ="Java@123";
		String rev="";
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i))) 
			{
				rev = rev + s.charAt(i);
			}
		}
		System.out.println(rev);

	}
}