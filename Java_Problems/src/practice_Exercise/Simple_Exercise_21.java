package practice_Exercise;

public class Simple_Exercise_21 {

	public static void main(String[] args) {
		String str = " ";
		System.out.println("str: " + str.trim().isEmpty());

		String str1 = " Hello, Java ";
		System.out.println("str1: " + str1.trim().isEmpty());

	}

}

/*
 * In Java, the String class provides various methods for manipulating strings.
 * 
 * str.trim(): This method removes leading and trailing whitespace from the
 * string. In your case, str is a string that contains a single space " ". After
 * calling trim(), the result will be an empty string "", because the leading
 * and trailing spaces are removed.
 * 
 * isEmpty(): This method checks if the string is empty, which means it has a
 * length of 0.
 ********
 * 
 * 
 * str: Initialized to a single space " ".
 * 
 * str.trim(): This will convert " " to "" (an empty string).
 * 
 * str.trim().isEmpty(): This will check if "" is empty. Since "" is indeed
 * empty, isEmpty() will return true.
 * 
 * This is because str.trim() results in an empty string, and isEmpty() returns
 * true when called on an empty string.
 *********
 * 
 * 
 * str1 Initialization: The variable str1 is initialized with the string
 * " Hello, Java ". This string has leading and trailing whitespace.
 * 
 * str1.trim(): The trim() method removes any leading and trailing whitespace
 * from the string. Applying trim() to " Hello, Java " results in "Hello, Java",
 * which is the string without any leading or trailing spaces.
 * 
 * str1.trim().isEmpty(): The isEmpty() method checks if the string is empty
 * (i.e., it has a length of 0). After trimming, the string "Hello, Java" is not
 * empty (it has a length greater than 0).
 * 
 * 
 * str1.trim(): Results in "Hello, Java".
 * 
 * str1.trim().isEmpty(): Checks if "Hello, Java" is empty. Since it is not
 * empty, isEmpty() will return false.
 * 
 * Therefore, the output of the System.out.println(str1.trim().isEmpty());
 * statement will be:
 * 
 * false. This is because, after trimming, the string "Hello, Java" is not
 * empty.
 * 
 * 
 */