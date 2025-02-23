package practice_Exercise;

public class Test6 {

	public static void main(String[] args) {
		int i1 = 20;
		byte b1 = (byte) (short) (int) (short) (byte) i1;
		System.out.println(b1);

	}

}

//Output: 20

/*
 * 
 * type casting works in Java involves casting the integer i1 into a byte type
 * using multiple intermediate type casts.
 * 
 * 
 * Initial Integer Declaration:
 * 
 * int i1 = 20;
 * 
 * An integer variable i1 is declared and initialized to 20.
 * 
 * Multiple Type Casting:
 * 
 * byte b1 = (byte)(short)(int)(short)(byte)i1;
 * 
 * This line involves multiple type casts.
 * 
 * (byte)i1: First, the int value i1 (which is 20) is cast to a byte. Since a
 * byte in Java can hold values from -128 to 127, this cast doesn't cause any
 * issues, and the result is still 20 because 20 is within the range of byte.
 * 
 * (short)(byte)i1: The result of the previous cast (which is now a byte value
 * of 20) is then cast to a short. The short type has a wider range than byte
 * (-32,768 to 32,767), so the value still remains 20.
 * 
 * (int)(short)(byte)i1: The result of the previous cast (which is now a short
 * value of 20) is cast to an int. The int type can hold values far larger than
 * short, so no loss of information occurs here. The value remains 20.
 * 
 * (short)(int)(short)(byte)i1: The result of the previous cast (which is an int
 * value of 20) is then cast back to short. Since the value is within the short
 * range, the value remains 20.
 * 
 * (byte)(short)(int)(short)(byte)i1: Finally, the short value (20) is cast to
 * byte again. Since the value is within the byte range (-128 to 127), the value
 * still remains 20.
 * 
 * Printing the Result:
 * 
 * java Copy System.out.println(b1); The final value of b1 is 20, and it is
 * printed to the console.
 * 
 * Summary The code is a demonstration of type casting where an int value (20)
 * is cast to byte, then short, then int, then short again, and finally back to
 * byte. In this case, no data is lost during the casts because all the values
 * involved are within the range of the target types. The final output printed
 * is 20.
 * 
 */