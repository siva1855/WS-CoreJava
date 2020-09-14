package siva06.jse.printwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test04FileExtraction {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader1 = new BufferedReader(new FileReader("input1.txt"));
		PrintWriter printWriter = new PrintWriter("output1.txt");
		String line = bufferedReader1.readLine();
		while (line != null) {
			boolean available = false;
			BufferedReader bufferedReader2 = new BufferedReader(new FileReader("delete1.txt"));
			String target = bufferedReader2.readLine();
			while (target != null) {
				if (line.equals(target)) {
					available = true;
					break;
				}
				target = bufferedReader2.readLine();
			}
			if (available == false) {
				printWriter.println(line);
			}
			line = bufferedReader1.readLine();
		}
		printWriter.flush();

	}

}
