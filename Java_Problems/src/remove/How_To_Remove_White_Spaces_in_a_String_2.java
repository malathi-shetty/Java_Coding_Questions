package remove;

public class How_To_Remove_White_Spaces_in_a_String_2 {

	public static void main(String[] args) {
		String a ="Java coding questions";
		System.out.println("Before Removing the white Spaces: " + a);
		
		System.out.print("After Removing the white Spaces: ");
		for(int i=0; i<a.length(); i++)
		{
// a.charAt(i) != ' ' is a condition that checks whether the character at index i in the string a is not a space.
			if(a.charAt(i) != ' ')//true - everything other than space trying to print
			{			
				System.out.print(a.charAt(i));
			}
			/*	
			if(a.charAt(i) == ' ')//true -  Only space is trying to print because ==
			{			
				System.out.print(a.charAt(i));
			}
			*/
		}
	}
}