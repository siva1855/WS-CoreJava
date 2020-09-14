package siva06.jse.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test01 {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("sample12.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.write(97);
		printWriter.println(100);
		printWriter.println(true);
		printWriter.println('c');
		printWriter.println("Hello Siva");
		printWriter.flush();
		printWriter.close();

	}

}
