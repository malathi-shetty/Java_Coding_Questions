package extractLast4CharactersOfString;

public class ExtractLast4CharactersOfString {

	public static void main(String[] args) {
		 
		        String s = "Characters";
		        printLast4Chars(s);
		    }

		    private static void printLast4Chars(String s)
		    {
		        int size = s.length();
		        int counter = size-4;
		        for(int i = counter; i<size; i++)
		        {
		            System.out.print(s.charAt(i));
		        }
		    }
}

/*

Inside the printLast4Chars method:

The size of the string is calculated using s.length().

A counter is set to the position of the 4th-to-last character (i.e., size - 4).

A for loop iterates from counter to size - 1 and prints the character at each index using s.charAt(i).

Given the string "Characters", the last 4 characters are "ters", so the program prints:

ters

*/