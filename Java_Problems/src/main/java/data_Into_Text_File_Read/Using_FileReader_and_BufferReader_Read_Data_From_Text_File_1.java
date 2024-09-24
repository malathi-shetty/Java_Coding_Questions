package data_Into_Text_File_Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Using_FileReader_and_BufferReader_Read_Data_From_Text_File_1 {

	public static void main(String[] args) throws IOException {
		// Approach 1 : Using File Reader & Buffer Reader

		FileReader fr = new FileReader(System.getProperty("user.dir") +   "/src/data_Into_Text_File_Read/Test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		
		while((s = br.readLine()) != null) // read line by line from text
		{
			System.out.println(s);
		}
		br.close();
	}
}

/*
 * //C:\Users\malat\git\Java_Problems\Java_Problems\src\data_Into_Text_File_Read\Read_Data_From_Text_File.java
		String File = System.getProperty("user.dir") +   "/src/data_Into_Text_File_Read/Test.txt";
 user.dir: C:\Users\malat\git\Java_Problems\Java_Problems
*/