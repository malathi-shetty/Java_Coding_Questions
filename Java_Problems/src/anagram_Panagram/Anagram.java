package anagram_Panagram;

import java.util.Arrays;

public class Anagram {
	
	
	boolean ana()
	{
		String a="eat";
		String b="ate";
		
		if(a.length() == b.length())
			{
				char[] x = a.toLowerCase().toCharArray();
				char[] y = b.toLowerCase().toCharArray();
				
				Arrays.sort(x);
				Arrays.sort(y);
				
				return Arrays.equals(x, y);
			}
		else 
			{
				return false;
			}
	}
	public static void main(String[] args) {
		
		Anagram newobj = new Anagram();
		System.out.println(newobj.ana());
	}

}