package siva04.jse.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("abc12.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(97);
		bufferedWriter.newLine();
		char[] ch = { 'A', 'M', 'M', 'A' };
		bufferedWriter.write(ch);
		bufferedWriter.newLine();
		bufferedWriter.write("Annapurna Solutions");
		bufferedWriter.newLine();
		bufferedWriter.write("welcome To All");
		bufferedWriter.flush();
		bufferedWriter.close();

	}
}
