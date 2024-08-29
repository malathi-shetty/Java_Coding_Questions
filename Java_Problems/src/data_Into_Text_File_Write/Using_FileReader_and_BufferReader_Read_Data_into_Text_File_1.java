package data_Into_Text_File_Write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Using_FileReader_and_BufferReader_Read_Data_into_Text_File_1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(System.getProperty("user.dir") + "/src/data_Into_Text_File_Write/Test123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java");
		bw.write("Selenium with C# ");
		bw.write("Selenium with Python ");
		
		System.out.println("Finished!!!");
		
		bw.close();
	}

}
