package practice_Exercise;

public class Convert_output_in_proper_way {

	public static void main(String[] args) {
		
		String s = "a2b3c1";
		
		
		for(int i =0; i<s.length(); i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
			}else
			{
				int x = Character.getNumericValue(s.charAt(i));
				
				for(int j = 1; j <x ; j++)
				{
					System.out.print(s.charAt(i-1));
				}
			}
		}
	}
}