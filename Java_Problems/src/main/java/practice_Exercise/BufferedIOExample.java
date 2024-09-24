package practice_Exercise;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIOExample {


	public static void main(String[] args) {

		/*
		 * Guess the Output :
		 * 
		 * public class BufferedIOExample { public static void main(String[] args) { try
		 * (BufferedInputStream bis = new BufferedInputStream(new
		 * FileInputStream("test.txt"))) { int data; while ((data = bis.read()) != -1) {
		 * System.out.print((char) data); } } catch (IOException e) { } } }
		 * 
		 * Assume that "test.txt" contains the text "Java\nProgramming" .
		 * 
		 * A) "JavaProgramming" B) "Java Programming" C) "Java\nProgramming" D)
		 * IOException is thrown at runtime
		 * 
		 * Output: C) "Java\nProgramming"
		 */

		
		  try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test1.txt"))) {
	            int data;
	            while ((data = bis.read()) != -1) {
	                System.out.print((char) data);
	            }
	        } catch (IOException e) {
	            e.printStackTrace(); // Print the stack trace for debugging purposes
	        }
		
		
	}

}

/*

BufferedInputStream: This class provides buffering for InputStream objects. It reads data in chunks and can help to improve performance compared to reading byte-by-byte.

FileInputStream: This class is used to read raw bytes from a file.

BufferedInputStream is being used to wrap around the FileInputStream which is reading from the file "test.txt".

The while loop reads one byte at a time from the BufferedInputStream and prints it as a character. It continues until bis.read() returns -1, which indicates the end of the file.

test1.txt contains the text "Java\nProgramming".

The newline character (\n) in the file is represented as a byte value in the file, and it will be read as such by the BufferedInputStream.

So when the code reads the file and prints each character, it will print the contents of the file exactly as they are stored, including any special characters like the newline.

*/