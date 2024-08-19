package read_Data_From_Text_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Using_Scanner_and_File_Read_Data_From_Text_File_3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File(System.getProperty("user.dir") + "/src/read_Data_From_Text_File/Test.txt");
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}
}

/**
 * useDelimiter("\\Z"); - matches the each & every line in the notepad
 * 
 */