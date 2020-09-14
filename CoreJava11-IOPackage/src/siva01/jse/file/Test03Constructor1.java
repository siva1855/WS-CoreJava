package siva01.jse.file;

import java.io.File;
import java.io.IOException;

public class Test03Constructor1 {

	public static void main(String[] args) throws IOException {

		File file = new File("Demo.txt");
		file.createNewFile();

	}

}
