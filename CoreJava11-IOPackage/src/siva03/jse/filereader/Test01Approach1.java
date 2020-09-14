package siva03.jse.filereader;

import java.io.FileReader;
import java.io.IOException;

public class Test01Approach1 {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("Circket.txt");
		int value = fileReader.read();
		while (value != -1) {
			System.out.println((char) value);
			value = fileReader.read();

		}
	}

}
