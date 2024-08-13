package practice_Exercise;

public class Each_letter_Twice_In_A_String {

	public static void main(String[] args) {
		String s = "Hello Java";
		
		char[] a = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<a.length; i++)
		{
			sb.append(a[i]).append(a[i]);
		}
		System.out.println(sb.toString());
	}
}