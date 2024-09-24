package natural_Number;

import java.util.Scanner;

public class Natural_Number {

	public static void main(String[] args) {
		// Java Program to Check If a Given Number is a Natural Number
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            System.out.print(number + " is a Natural Number.");
        } else {
            System.out.print(number + " is not a Natural Number.");
        }

	}

}

/*
// Natural numbers are positive integers

number >= 0

Positive Natural Numbers: {1, 2, 3, 4, ...}

Non-negative Natural Numbers (including zero): {0, 1, 2, 3, 4, ...}

"Not a Natural Number"

When you mention "not a natural number," you are referring to any number that does not fall within the set of natural numbers. This includes:

Negative Numbers: (-1, -2, -3, ...)

Fractions and Decimals: (1/2, 3.14, 0.75, ...)

Non-numeric Characters: Letters or symbols that are not numbers (A, %, &)

Complex Numbers: Numbers that have both a real and an imaginary part (e.g., 3 + 4i)

Zero (in some definitions): Some definitions of natural numbers do not include zero.

Examples of Numbers That Are Not Natural Numbers

-5 (a negative integer)

1/2 (a fraction)

2.5 (a decimal)

√-1 (an imaginary number)

π (an irrational number)

*/