package SwapFirstLastDigit_of_a_number;


public class SwapFirstLastDigit_5_LEARN {

	 public static void main(String[] args) {
	    	// int num = 12345;
	    	 int num = -12345; // Test with a negative number

	    	// int num = 34567;
	    	// int num = 121;
	    	// int num = 987654321;
	    	// int num = 100;
	    	// int num = 23;
	    	// int num = 7;
	    	// int num = -5;
			System.out.println("Number before swapping first and last digit: " + num);

	        int swappedNum = swapFirstLast(num);
	        System.out.println("Number after swapping first and last digit: " + swappedNum);
	    }
	 
	public static int swapFirstLast(int num) {
        // If the number is a single digit, no swapping is needed
        if (num < 10 && num > -10) { 
            return num;
        }

        // Check if the number is negative
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num; // Make the number positive for easier manipulation : 12345
        }

        int lastDigit = num % 10;  // Extract last digit : 5
        int temp = num;
        int count = 0;
        int firstDigit = 0;

        // Find the first digit and count of digits
        while (temp >= 10) {
            firstDigit = temp;
            temp /= 10;
            count++;
        }
        firstDigit = temp; // Extract first digit : 1 
        count++; // Total number of digits = 5

        // Remove first and last digit from the original number
        int middlePart = num % (int) Math.pow(10, count - 1); // Remove first digit
        middlePart /= 10;  // Remove last digit : 234

     // Rebuild number: last digit at front, middle in between, first digit at end
        // Construct new number with swapped first and last digits
        int newNum = lastDigit * (int) Math.pow(10, count - 1) + middlePart * 10 + firstDigit;

        //lastDigit = 5, middlePart = 234, firstDigit = 1, count = 5
// → 5 * 10000 + 234 * 10 + 1 = 50000 + 2340 + 1 = 52341


        // If the number was negative, reapply the negative sign
        if (isNegative) {
            newNum = -newNum; // : -12345
        }

        return newNum;
    }

   

}

/*
 * 
 * Purpose of the Program
 * 
This program swaps the first and last digits of an integer number (positive or negative) without converting the number to a string.

🧠 Method Logic: swapFirstLast(int num)

✅ 1. Single-digit Check

if (num < 10 && num > -10) {

    return num;
   
}

If the number is between -9 and 9 (i.e., a single digit), no swap is needed. Just return it as is.

✅ 2. Handle Negative Numbers

boolean isNegative = num < 0;

if (isNegative) {

    num = -num;
    
}
Store whether the number is negative.

Convert it to a positive number to simplify digit operations.

✅ 3. Extract the Last Digit

int lastDigit = num % 10;

% 10 gives you the last digit of the number.

For example:

12345 % 10 = 5

✅ 4. Count Digits & Extract First Digit

int temp = num;

int count = 0;

int firstDigit = 0;

while (temp >= 10) {

    firstDigit = temp;
    
    temp /= 10;
    
    count++;
    
}

firstDigit = temp;

count++;

temp is a copy of num.

The loop divides temp until it's reduced to a single digit (the first digit).

count tracks the total number of digits.

For example:

num = 12345

→ loop gives firstDigit = 1, count = 5

✅ 5. Extract the Middle Part

int middlePart = num % (int) Math.pow(10, count - 1); // Remove first digit

middlePart /= 10;  // Remove last digit

Remove the first digit by using modulo with 10^(count-1).

Then remove the last digit by dividing by 10.

For example:

num = 12345, count = 5

→ num % 10000 = 2345 → 2345 / 10 = 234

→ middlePart = 234

✅ 6. Reconstruct the Swapped Number

int newNum = lastDigit * (int) Math.pow(10, count - 1) + middlePart * 10 + firstDigit;

Multiply the last digit by 10^(count-1) → this places it in the first digit's spot.

Shift the middle part left by one digit (×10).

Add the first digit at the units place.

Continuing our example:

lastDigit = 5, middlePart = 234, firstDigit = 1, count = 5

→ 5 * 10000 + 234 * 10 + 1 = 50000 + 2340 + 1 = 52341

✅ 7. Reapply Negative Sign if Needed

if (isNegative) {
    newNum = -newNum;
}
If the original number was negative, reapply the negative sign to the final result.

🎯 Test Case Walkthrough:
Let’s walk through a couple of examples to see the full effect:

🔸 Input: 12345
First digit: 1

Last digit: 5

Middle part: 234

Output: 52341

🔸 Input: -12345
Converted to positive: 12345

Swap as above → 52341

Reapply negative sign → -52341

🔸 Input: 121
First = 1, Last = 1

Middle = 2

New number = 1 * 100 + 2 * 10 + 1 = 121
→ Same as input

🔸 Input: 100
First = 1, Last = 0, Middle = 0

New number = 0 * 100 + 0 * 10 + 1 = 1
→ Output: 1

🔸 Input: 23
First = 2, Last = 3, Middle = 0 (since it's only 2 digits)

New number = 3 * 10 + 0 * 10 + 2 = 30 + 2 = 32

✅ Why This Approach Is Good
Works for both positive and negative numbers

Efficient: purely math-based (no string conversion)

Simple logic using modulo, division, and powers of 10

Handles all edge cases: single digits, same first/last digits, leading/trailing zeros

📌 Summary:

Input	Output

12345	52341

-12345	-52341

121  	121

100	     1

23		32

7		7
	
-5		-5

*/

/*

Expression:

(int) Math.pow(10, count - 1)

💡 Meaning:

This calculates 10 raised to the power of (count - 1), and casts the result to an int.

✅ Why we use it:
If your number has count digits, then:

10^(count - 1) gives you the place value of the first digit.

📘 Example for num = 12345:

Total digits: count = 5

So, Math.pow(10, 4) = 10,000

This helps you:

Remove the first digit (using modulus with 10,000)

Or place a digit at the front (like 5 * 10000 to make it 50000)

⚠️ Why the (int) cast?
Math.pow() returns a double, but we need an int for math operations, so we cast it:

(int) Math.pow(10, count - 1)


🧠 Summary:

Purpose							Value for 12345

count							5

Math.pow(10, count - 1)			10000.0

(int) Math.pow(10, count - 1)	10000

*/