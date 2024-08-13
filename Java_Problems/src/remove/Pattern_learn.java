package remove;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_learn {

	public static void main(String[] args) {
		String input = "Hello, World! 123 @#$";
	//	Pattern pattern = Pattern.compile("(?i)([a-zA-Z0-9!@,#$%^&*()\\s])");
		Pattern pattern = Pattern.compile("(?i)([a-zA-Z\\s])"); //  \\s is for space
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
		    System.out.print(matcher.group());
		}
	}
}
/*(?i): This flag still makes the matching case-insensitive.
([a-zA-Z\\s]):
[a-zA-Z]: Matches any letter (both lowercase and uppercase).
\\s: Matches any whitespace character, including spaces, tabs, and newlines. 
In this context, it specifically matches spaces.
 * */
 