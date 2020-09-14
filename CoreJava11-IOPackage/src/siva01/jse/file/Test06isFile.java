package siva01.jse.file;

import java.io.File;
import java.io.IOException;

public class Test06isFile {

	public static void main(String[] args) throws IOException {

		File file1 = new File("SampleDir");
		file1.mkdir();
		System.out.println(file1.isDirectory());

		File file2 = new File("abc.txt");
		file2.createNewFile();
		System.out.println(file2.isFile());
	}

}
