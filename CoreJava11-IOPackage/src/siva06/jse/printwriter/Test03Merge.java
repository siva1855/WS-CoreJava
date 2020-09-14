package siva06.jse.printwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03Merge {

	public static void main(String[] args) throws IOException {
		PrintWriter printwriter = new PrintWriter("file3.txt");
		BufferedReader bufferedReader1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader bufferedReader2 = new BufferedReader(new FileReader("file2.txt"));
		String line1 = bufferedReader1.readLine();
		String line2 = bufferedReader2.readLine();
		while (line1 != null || line2 != null) {
			if (line1 != null) {
				printwriter.println(line1);
				line1 = bufferedReader1.readLine();
			}
			if (line2 != null) {
				printwriter.println(line2);
				line2 = bufferedReader2.readLine();
			}
		}
		printwriter.flush();
		bufferedReader1.close();
		bufferedReader2.close();
		printwriter.close();
	}

}
