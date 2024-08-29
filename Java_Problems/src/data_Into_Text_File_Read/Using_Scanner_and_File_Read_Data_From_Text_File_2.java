package data_Into_Text_File_Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Using_Scanner_and_File_Read_Data_From_Text_File_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// Approach 2 : Using Scanner & File
			
		File file = new File(System.getProperty("user.dir") + "/src/data_Into_Text_File_Read/Test.txt");
		Scanner sc = new Scanner(file);
		
		//loop statement
		while(sc.hasNextLine()) // if sc contains line & nextline condition is true & print statement
		{
			System.out.println(sc.nextLine());
		}
	}
}

/*
hasNextLine is a conditional command which will return true or false
if there is any line in the text file it returns true else false 

if true then we have to read the data from next line method


*/