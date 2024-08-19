package remove;

public class Remove_Junk_1_4 {

	public static void main(String[] args) {
		String s = "priyanka123!@";
		int sum = 0;
		char[]a = s.toCharArray();
		for(int i=0; i<a.length; i++)
		{
			if(Character.isDigit(a[i]))
			{
			int k =	Character.getNumericValue(a[i]);
				sum = sum + k;
				
			}
		}
		System.out.print(sum);
		

	}

}
