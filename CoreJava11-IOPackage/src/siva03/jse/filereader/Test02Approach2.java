package siva03.jse.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test02Approach2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Circket.txt");
		FileReader fileReader = new FileReader(file);

		char[] ch = new char[(int) file.length()];
		
		fileReader.read(ch);
		
		for (char ch1 : ch) {
			System.out.println(ch1);
		}
	}

}
