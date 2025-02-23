package practice_Exercise;

public class Test21 {
	
	static int i = 10;   // Static variable 'i' is initialized with 10
    static int j = 50 / 5; // Static variable 'j' is initialized with the result of 50/5, which is 10

    public static void main(String[] args) {
        System.out.println(j);  // Prints the value of static variable 'j'
    }

    public static int assignValue(int i) {
        return i;  // Returns the input value 'i'
 }
}

/*

Static Variables Initialization:

static int i = 10;
The static variable i is assigned the value 10.
static int j = 50 / 5;
The static variable j is assigned the result of 50 / 5, which is 10.
Main Method:

The main method contains a System.out.println(j); statement, which prints the value of the static variable j. Since j was initialized to 10, the output will be:
Copy
10
assignValue Method:

The assignValue(int i) method takes an integer i as input and simply returns it. However, this method is never called in your code, so it doesn't affect the output or execution. It is just defined but not used.
Final Output:
The output of the program will be:

Copy
10
Key Points:
The method assignValue is not invoked, so it doesn't affect the output.
The static variable j is calculated at the time of class loading, and its value is 10, which is printed when System.out.println(j) is executed.

*/