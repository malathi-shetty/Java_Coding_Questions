package remove;

public class Remove_Junk_1_using_And_opertaor {

	public static void main(String[] args) {
		String s = "priyanka123!@";
		char[]a = s.toCharArray();
		for(int i=0; i<a.length; i++)
		{
			if(!(a[i] =='!') && !(a[i] =='@'))
			{
				System.out.print(a[i]);
			}
		}

	}

}
