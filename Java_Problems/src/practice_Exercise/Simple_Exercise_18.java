package practice_Exercise;

public class Simple_Exercise_18 {

	public static void main(String[] args) {
		String s = "abcd";
		s.toUpperCase();
		System.out.println("s: " + s);

		String s1 = "abcd";
		s1 = s1.toUpperCase(); // Assign the new uppercase string to s
		System.out.println("s1: " + s1); // This will now print "ABCD"

	}

}

/*
 * 
 * In Java, the String class is immutable, meaning that methods like
 * toUpperCase() do not modify the original string but instead return a new
 * string with the desired transformation.
 * 
 //s
 
 * A String variable s is created and initialized with the value "abcd"
 * 
 * This line calls the toUpperCase() method on s. However, since strings in Java
 * are immutable, s itself is not changed. Instead, toUpperCase() returns a new
 * string "ABCD" with all characters in uppercase.
 * 
 * The result of toUpperCase() is not stored or used in any way in this code.
 * 
 * This prints the value of s, which remains unchanged as "abcd" because the
 * toUpperCase() method did not modify s.
 * 
 * //s1
 * 
 * the string in uppercase, you need to store the result of toUpperCase() in a
 * new variable or overwrite the existing variable
 * 
 * the result of toUpperCase() (which is "ABCD") is assigned back to s1,
 * effectively updating s1 to the new value.
 * 
 * This prints "ABCD" because s1 now holds the uppercase version of the original
 * string.
 * 
 * 
 * 
 * 
 * 
 * 
 */