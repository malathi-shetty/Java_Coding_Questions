package changeSpecialCharacter;

public class ChangeSpecialCharacter {

	public static void main(String[] args) {
        String s = "Hello @World";
        System.out.print(replaceSpecialCharacter(s));  // Corrected method name
    }

    private static String replaceSpecialCharacter(String s) {
        return s.replace('@', '_');
    }

	}


/*

The main method defines the string s as "Hello @World".

It then calls the replaceSpecialCharacter(s) method to replace the @ character with an underscore _.

Inside the replaceSpecialCharacter method:

The replace method is used to replace all occurrences of the @ character with _. This method returns a new string with the replacement applied.

For the input string "Hello @World", the output will be:

Hello _World

*/