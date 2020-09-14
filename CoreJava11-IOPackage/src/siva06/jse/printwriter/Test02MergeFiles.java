package siva06.jse.printwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test02MergeFiles {

	public static void main(String[] args) throws IOException {

		File file1 = new File("file3.txt");
		file1.createNewFile();
		PrintWriter printWriter = new PrintWriter(file1);
		printWriter.println("carrat3");
		
		File file2 = new File("file1.txt");
		file2.createNewFile();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
		String line = bufferedReader.readLine();
		while (line != null) {
			printWriter.println(line);
			line = bufferedReader.readLine();
		}
		
		
		File file3 = new File("file2.txt");
		file3.createNewFile();
		bufferedReader = new BufferedReader(new FileReader(file3));
		line = bufferedReader.readLine();
		while (line != null) {
			printWriter.println(line);
			line = bufferedReader.readLine();
		}
		printWriter.flush();
		bufferedReader.close();
		printWriter.close();

	}

}
