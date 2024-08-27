package practice_Exercise;

public class Simple_Exercise_5 {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hel" + "lo";
		System.out.println(s1 == s2);
	}

}

/*
 * String Literals: When you create a string literal in Java (e.g., "Hello"),
 * Java stores it in a special pool called the string pool or intern pool. This
 * pool ensures that identical string literals are stored only once to save
 * memory and improve performance.
 * 
 * String Concatenation: In the case of String s2 = "Hel" + "lo";, the two
 * string literals "Hel" and "lo" are concatenated at compile time. The Java
 * compiler optimizes this by evaluating the concatenation and directly placing
 * the result "Hello" into the string pool.
 * 
 * Comparison with ==: The == operator compares object references (i.e., memory
 * addresses) in Java. Since both s1 and s2 refer to the same string literal
 * "Hello" in the string pool, s1 and s2 will refer to the same memory location.
 * 
 * Therefore, s1 == s2 will print true because both variables point to the same
 * object in the intern pool.
 * 
 * Java strings are interned to save space and that identical string literals
 * share the same memory location.
 * 
 * In summary, string interning helps Java manage memory efficiently by reusing
 * instances of string literals. The == operator checks if two string variables
 * point to the same instance in the pool, which is why s1 == s2 returns true in
 * your example.
 */
