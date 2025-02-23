package practice_Exercise;

public class Test11 {

	public static void main(String[] args) {
		String s = "Java";  // Line 1
		s = s + " Programming";  // Line 2
		System.out.println(s);
		s = s.substring(10);  // Line 3
		System.out.println(s);

	}

}

// ouput: amming

/* how many string object is created in strig pool for above question

Line 1:

String s = "Java";

When you create a String using a literal like "Java", it gets added to the String Pool (if not already present). So, 1 String object is added to the String Pool, with the value "Java".

Line 2:

s = s + " Programming";

This line performs string concatenation. Here, the string "Programming" is a literal, so it might be added to the String Pool if it's not already present. However, string concatenation creates a new String object on the heap. So, even though "Programming" could be in the String Pool, the result of concatenating "Java" + " Programming" will create a new String object in the heap (not in the String Pool).

The new string formed by concatenation is "Java Programming", which is not added to the String Pool because it’s dynamically created at runtime (heap object).

Line 3:

s = s.substring(10);

The substring method will create a new string, starting from index 10 of the string "Java Programming". The substring result will be "Programming".

This new string "Programming" is also not added to the String Pool. It’s created as a new object on the heap.

Summary of String objects in the String Pool:

"Java": Added to the String Pool (because it's a literal).

"Programming": Added to the String Pool (since it's a literal).

Total number of String objects in the String Pool:

2: "Java" and "Programming".

Total number of String objects created (including heap objects):

3 heap objects: "Java Programming", "Programming" (from substring), and the temporary object created during string concatenation.

So, the total number of String objects in the String Pool is 2.


*/