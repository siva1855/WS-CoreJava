package siva01.jse.file;

import java.io.File;
import java.io.IOException;

public class Test01File {

	public static void main(String[] args) throws IOException {

		File file = new File("sample.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());

	}

}
