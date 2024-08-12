package practice_Exercise;

public class Using_StringBuffer_Remove_the_special_characters_from_the_string {

	public static void main(String[] args) {
		
		String s = "Palin@123";
		
		StringBuffer sb = new StringBuffer();
		char[] a = s.toCharArray(); // P  a  l  i  n  @  1  2  3
		for(int i=0; i<a.length; i++)
		{
		/*	if(Character.isDigit(a[i]))
			{
				sb.append(a[i]);
			}
		*/	
			if(Character.isLetter(a[i]))
			{
				sb.append(a[i]);
			}
		}
		System.out.println(sb);
 
	}

}
