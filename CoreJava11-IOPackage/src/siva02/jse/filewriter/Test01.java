package siva02.jse.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("Circket.txt", true);
		fileWriter.write(83);
		fileWriter.write("ivakumar\nAnnapurna Solutions");
		fileWriter.write("\n");
		char[] ch = { 'a', 'm', 'm', 'a' };
		fileWriter.write(ch);
		fileWriter.write("\n");
		fileWriter.flush();
		fileWriter.close();

	}

}
