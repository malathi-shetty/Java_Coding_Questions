package remove;

public class Remove_Junk_1_3_using_Character_isDigit {

	public static void main(String[] args) {
		String s = "priyanka123!@";
		char[]a = s.toCharArray();
		for(int i=0; i<a.length; i++)
		{
			if(Character.isDigit(a[i]))
			{
				System.out.print(a[i]);
			}
		}

	}

}
