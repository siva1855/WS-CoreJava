package siva06.jse.printwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test04Duplicates {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader1 = new BufferedReader(new FileReader("file3.txt"));
		PrintWriter printWriter = new PrintWriter("output.txt");
		String target = bufferedReader1.readLine();
		while (target != null) {
			boolean available = false;
			BufferedReader bufferedReader2 = new BufferedReader(new FileReader("output.txt"));
			String line = bufferedReader2.readLine();
			while (line != null) {
				if (target.equals(line)) {
					available = true;
					break;
				}
				line = bufferedReader2.readLine();
			}
			if (available == false) {
				printWriter.println(target);
				printWriter.flush();
			}
			target = bufferedReader1.readLine();
		}
	}
}
